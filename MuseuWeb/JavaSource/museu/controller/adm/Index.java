package museu.controller.adm;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.component.UIData;
import javax.servlet.http.Part;

import museu.entidades.Configuracao;
import museu.entidades.Mapa;
import museu.entidades.Poligono;
import museu.entidades.Slide;
import museu.fachadas.remoto.BancoRemote;
import museu.fachadas.remoto.MuseuRemote;
import museu.util.Constants;
import museu.util.FacesUtil;
import museu.util.Mensagens;

import org.apache.commons.io.IOUtils;
import org.ol4jsf.component.api.FeatureVector;
import org.ol4jsf.util.WKTFeaturesCollection;

public class Index implements Serializable{

	private static final long serialVersionUID = 4087515490285305589L;

	@EJB
	private BancoRemote banco;
	
	@EJB
	private MuseuRemote museu;
	
	private Configuracao config;
	
	private javax.servlet.http.Part logo;
	
	private javax.servlet.http.Part uploadSlide;
	
	private String mapaAtual;
	
	private String poligono;
	
	private String localAdicionar;
	
	private Mapa mapaBusca;
	
	private boolean editandoMapa = false;
	
	private Integer abaAtual = 0;
	
	private UIData tabelaSlides;
	
	//Strings com resultado dos testes
	private String memoriaVirtual = Mensagens.getString("testeNaoRealizado");
	private String wordpress = Mensagens.getString("testeNaoRealizado");
	private String freeGeoUIP = Mensagens.getString("testeNaoRealizado");
	
	public Index(){
		
	}
	
	@PostConstruct
	public void init(){
		config = banco.getConfiguracao();

		mapaBusca = banco.getMapaBusca();
		tratamentoMapa(mapaBusca);
		editandoMapa = false;
	}
	
	public void adicionarLocal(){
		Poligono poligono = new Poligono();
		poligono.setForma(this.poligono);
		poligono.setNome(localAdicionar);
		this.mapaBusca.getPoligonos().add(poligono);

		tratamentoMapa(this.mapaBusca);

		this.localAdicionar="";
		this.poligono="";
	}
	
	public void editarMapa(){
		editandoMapa = true;
		abaAtual = 5;
		localAdicionar = "";
	}
	
	public void removerUltimo(){
		localAdicionar="";
		poligono="";
		mapaBusca.getPoligonos().remove(mapaBusca.getPoligonos().size()-1);
		
		tratamentoMapa(this.mapaBusca);
	}
	
	public void limparMapa(){
		localAdicionar="";
		poligono="";
		editandoMapa = true;
		
		mapaBusca.setPoligonos(new ArrayList<Poligono>());
		
		tratamentoMapa(this.mapaBusca);
	}
	
	public void salvarMapaEdicao(){
		banco.persisteMapaBusca(this.mapaBusca);
		FacesUtil.addMessage("Salvo com Sucesso", "Salvo com Sucesso", Constants.INFO);
		abaAtual = 0;
		editandoMapa = false;
	}
	
	public void salvar(){
		try{
			if(logo !=null)
			if(logo.getSize() > 1){
				InputStream is = logo.getInputStream();
				byte[] array = IOUtils.toByteArray(is);
				
				config.setLogo(array);
				config.setContentTypeLogo(logo.getContentType());
			}
			
			banco.salvarConfiguracoes(config);
			museu.carregarWebServices();
			FacesUtil.addMessage("Salvo com Sucesso", "Salvo com Sucesso", Constants.INFO);
		}catch(Exception e){
			FacesUtil.addMessage("Erro ao Salvar Dados", "Erro ao Salvar Dados", Constants.ERROR);
		}
		abaAtual = 0;
	}
	 
	public String addSlide() throws IOException{
		if(uploadSlide.getSize() >1){
			Slide slide = new Slide();
			InputStream is = uploadSlide.getInputStream();
			byte[] array = IOUtils.toByteArray(is);
			slide.setContent(array);
			slide.setContentType(uploadSlide.getContentType());
			if(config.getSlides().size()==0)
				slide.setOrdem(1);
			else
				slide.setOrdem(config.getSlides().get(config.getSlides().size()-1).getOrdem()+1);
			config.getSlides().add(slide);
			
			banco.salvarConfiguracoes(config);
			FacesUtil.addMessage("Slide Adicionado com Sucesso", "Slide Adicionado com Sucesso", Constants.INFO);
		}
		else
			FacesUtil.addMessage("Selecione uma Imagem para Fazer o Upload", 
					"Selecione uma Imagem para Fazer o Upload", Constants.ERROR);
		return "/admin/index";
	}
	
	public void aumentarOrdem(){
		Slide slide = (Slide) tabelaSlides.getRowData();
		
		Slide superior = banco.getSlideByOrdem(slide.getOrdem()-1);
		
		superior.setOrdem(slide.getOrdem());
		slide.setOrdem(slide.getOrdem()-1);
		
		banco.updateSlide(slide);
		banco.updateSlide(superior);
		
		config = banco.getConfiguracao();
		
		for(Slide s: config.getSlides())
			System.out.println("slide:"+s.getOrdem());
	}
	
	public void removeSlide(){
		Slide slide = (Slide) tabelaSlides.getRowData();
		banco.removerSlide(slide.getId());
		config.getSlides().remove(slide);
		
		for(int i = 1;i<config.getSlides().size()+1;i++){
			config.getSlides().get(i-1).setOrdem(i);
			banco.updateSlide(config.getSlides().get(i-1));
		}
		banco.salvarConfiguracoes(config);
		FacesUtil.addMessage("Slide removido com sucesso", 
				"Slide removido com sucesso", Constants.INFO);
	}
	
	public void reiniciar(){
		init();
	}
	
	
	public void testarServicos(){
		try{
			museu.getBens("",1,1);
			if(museu.getBens("",1,1)!=null)
				memoriaVirtual = Mensagens.getString("testeSucesso");
			else
				memoriaVirtual = "ERROR:"+Mensagens.getString("erroAutenticacaoMemoria");
		}catch(Exception e){
			memoriaVirtual = "ERROR:"+Mensagens.getString("erroComunicacaoServico");
		}
		
		try{
			museu.getPosts(banco.getConfiguracao().getTagNews());
			wordpress = Mensagens.getString("testeSucesso");
		}catch(Exception e){
			wordpress = "ERROR:"+Mensagens.getString("erroComunicacaoServico");
		}
		
		try{
			String urlWebService = museu.getConfiguracao().getUrlFreeGeoIP()+"127.0.0.1";
			
			URL url = new URL(urlWebService);
		    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		    connection.setRequestMethod("GET");
		    connection.setConnectTimeout(15000);
		    connection.connect();
		    
			freeGeoUIP = Mensagens.getString("testeSucesso");
		}catch(Exception e){
			freeGeoUIP = "ERROR:"+Mensagens.getString("erroComunicacaoServico");
		}
		abaAtual = 1;
	}
	
	public BancoRemote getBanco() {
		return banco;
	}

	public void setBanco(BancoRemote banco) {
		this.banco = banco;
	}

	public Configuracao getConfig() {
		return config;
	}

	public void setConfig(Configuracao config) {
		this.config = config;
	}

	public Part getLogo() {
		return logo;
	}

	public void setLogo(Part logo) {
		this.logo = logo;
	}

	public UIData getTabelaSlides() {
		return tabelaSlides;
	}

	public void setTabelaSlides(UIData tabelaSlides) {
		this.tabelaSlides = tabelaSlides;
	}

	public javax.servlet.http.Part getUploadSlide() {
		return uploadSlide;
	}

	public void setUploadSlide(javax.servlet.http.Part uploadSlide) {
		this.uploadSlide = uploadSlide;
	}

	public String getMemoriaVirtual() {
		return memoriaVirtual;
	}

	public void setMemoriaVirtual(String memoriaVirtual) {
		this.memoriaVirtual = memoriaVirtual;
	}

	public String getWordpress() {
		return wordpress;
	}

	public void setWordpress(String wordpress) {
		this.wordpress = wordpress;
	}

	public String getFreeGeoUIP() {
		return freeGeoUIP;
	}

	public void setFreeGeoUIP(String freeGeoUIP) {
		this.freeGeoUIP = freeGeoUIP;
	}

	public String getLocalAdicionar() {
		return localAdicionar;
	}

	public void setLocalAdicionar(String localAdicionar) {
		this.localAdicionar = localAdicionar;
	}

	public String getMapaAtual() {
		return mapaAtual;
	}

	public void setMapaAtual(String mapaAtual) {
		this.mapaAtual = mapaAtual;
	}

	public boolean isEditandoMapa() {
		return editandoMapa;
	}

	public void setEditandoMapa(boolean editandoMapa) {
		this.editandoMapa = editandoMapa;
	}
	
	public void tratamentoMapa(Mapa m){
		List<FeatureVector> poligonos = new ArrayList<>();

		for(Poligono p : m.getPoligonos()){
			Map<String, String> hash = new HashMap<String, String>();
			hash.put("string", p.getNome());
			FeatureVector f = new FeatureVector(p.getForma(),hash);
			poligonos.add(f);
		}		

		WKTFeaturesCollection features = new WKTFeaturesCollection();
		for(FeatureVector vector : poligonos)
			features.addFeature(vector);
		
		mapaAtual = features.toMap();
	}

	public String getPoligono() {
		return poligono;
	}

	public void setPoligono(String poligono) {
		this.poligono = poligono;
	}

	public Mapa getMapaBusca() {
		return mapaBusca;
	}

	public void setMapaBusca(Mapa mapaBusca) {
		this.mapaBusca = mapaBusca;
	}

	public Integer getAbaAtual() {
		return abaAtual;
	}

	public void setAbaAtual(Integer abaAtual) {
		this.abaAtual = abaAtual;
	}
}
