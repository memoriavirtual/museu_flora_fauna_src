package museu.controller.adm;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.component.UIData;
import javax.servlet.http.Part;

import museu.entidades.Configuracao;
import museu.entidades.Slide;
import museu.fachadas.remoto.BancoRemote;
import museu.fachadas.remoto.MuseuRemote;
import museu.util.Constants;
import museu.util.FacesUtil;
import museu.util.Mensagens;

import org.apache.commons.io.IOUtils;

public class Index implements Serializable{

	private static final long serialVersionUID = 4087515490285305589L;

	@EJB
	private BancoRemote banco;
	
	@EJB
	private MuseuRemote museu;
	
	private Configuracao config;
	
	private javax.servlet.http.Part logo;
	
	private javax.servlet.http.Part uploadSlide;
	
	//private boolean canUpload = true;
	
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
	}
	 
	public String addSlide() throws IOException{
		if(uploadSlide.getSize() >1){

			Slide slide = new Slide();
			InputStream is = uploadSlide.getInputStream();
			byte[] array = IOUtils.toByteArray(is);
			
			slide.setContent(array);
			slide.setContentType(uploadSlide.getContentType());
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
			System.out.println("valor de i:"+i);
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
	
	
	public void testeServicos(){
		try{
			museu.getBens("",1,1);
			memoriaVirtual = Mensagens.getString("testeSucesso");
		}catch(Exception e){
			memoriaVirtual = "ERROR:"+e.toString();
		}
		
		try{
			museu.getPosts(banco.getConfiguracao().getTagNews());
			wordpress = Mensagens.getString("testeSucesso");
		}catch(Exception e){
			wordpress = "ERROR:"+e.toString();
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
			freeGeoUIP = "ERROR:"+e.toString();
		}
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
}
