package museu.controller.acervo;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import museu.controller.Mapa;
import museu.entidades.Poligono;
import museu.fachadas.remoto.BancoRemote;
import museu.fachadas.remoto.MuseuRemote;
import museu.util.Constants;
import museu.util.FacesUtil;
import museu.util.Mensagens;

import org.ol4jsf.component.api.FeatureVector;
import org.ol4jsf.util.WKTFeaturesCollection;

import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;

import com.bkahlert.devel.wpws.model.Page;

@ManagedBean(name = "listagemCompleta")
@ViewScoped
public class ListagemCompletaAcervo extends BeanComMidiaMV implements Serializable,Mapa{

	private static final long serialVersionUID = -1247505733388344492L;

	private static final int tamanhoPaginaDefaultAcervo = 15;
	
	@EJB
	private BancoRemote banco;
	
	@EJB
	private MuseuRemote museu;
	
	private List<BemPatrimonial> itens = new ArrayList<BemPatrimonial>();
	
	private String stringBusca = "";
	
	private String localMapa = "mapaInteiro";
	
	private String localTemp = "mapaInteiro";
	
	private int pagina = 1;
	
	private boolean ultimaPagina;	
	
	private String tipoAcervo = "todoAcervo";
	
	private boolean buscaNoMapa = false;
	
	private Page page; //relacionado a pagina no Wordpress, de apresentação do acervo
	
	public ListagemCompletaAcervo(){
		super();
	}
	
	@PostConstruct
	public void init(){
		if(banco.getMapaBusca().getPoligonos().size()>0){
			buscaNoMapa = true;
		}
		
		if(FacesUtil.getRequestParameter("chave")!= null){
			stringBusca = FacesUtil.getRequestParameter("chave");
			
		}
		
		try {
			page = museu.getPage(Integer.parseInt(museu.getConfiguracao().getAcervo()));
		} catch (RemoteException e) {
			e.printStackTrace();
		}		
		
		buscar(stringBusca);
	}
	
	public String novaBusca(String chave){
		pagina = 1;
		buscar(chave);
		return "acervo";
	}
	
	public void buscarPorTipoAcervo(){
		pagina = 1;
		if(tipoAcervo.equals("todoAcervo"))buscar("");
		else if(tipoAcervo.equals("flora"))buscar("MFF-FL");
		else if(tipoAcervo.equals("fauna"))buscar("MFF-FN");
	}
	
	public void buscarPeloMapa(){
		pagina = 1;
		if(localMapa.equals("mapaInteiro"))buscar("");
		else buscar(localMapa);
	}
	
	public void buscar(String chave) {
		itens = new ArrayList<BemPatrimonial>();
		try {
			itens = museu.getBens(chave,pagina,tamanhoPaginaDefaultAcervo);
			if(museu.getBens(chave, pagina+1,tamanhoPaginaDefaultAcervo)==null)
				ultimaPagina = true;
			else
				ultimaPagina = false;
			
		} catch (Exception e) {
			FacesUtil
					.addMessage(
							"Erro ao comunicador com servidor de dados: Memória Virtual",
							"Erro ao comunicador com servidor de dados: Memória Virtual",
							Constants.ERROR);
			e.printStackTrace();
		}
	}
	
	public void filtrarPorTipo(List<BemPatrimonial> itens){
		
	}
	
	public void proxPagina(){
		System.out.println("prox:"+pagina);
		pagina++;
		buscar(stringBusca);
		
	}
	
	public void pagAnterior(){
		System.out.println("ant:"+pagina);
		pagina--;
		buscar(stringBusca);	
	}
	
	@Override
	public void selecionaItemParaModal(){
		try {
			setFotosSelecionadoParaModal(museu.getMidias(getSelecionadoParaModal().getId()));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		this.setToSession();		
	}
	
	public List<BemPatrimonial> getItens() {
		return itens;
	}

	public void setItens(List<BemPatrimonial> itens) {
		this.itens = itens;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getStringBusca() {
		return stringBusca;
	}

	public void setStringBusca(String stringBusca) {
		this.stringBusca = stringBusca;
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public boolean isUltimaPagina() {
		return ultimaPagina;
	}

	public void setUltimaPagina(boolean ultimaPagina) {
		this.ultimaPagina = ultimaPagina;
	}

	public String getTipoAcervo() {
		return tipoAcervo;
	}

	public void setTipoAcervo(String tipoAcervo) {
		this.tipoAcervo = tipoAcervo;
	}
	
	@Override
	public String getWkts() {
		museu.entidades.Mapa m = banco.getMapaBusca();
		
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
		
		return features.toMap();
	}
	
	@Override
	public void selecionarAreaMapa() {
		String local = FacesUtil.getRequestParameter("param1");
		localTemp = local;
	}

	@Override
	public void confirmarSelecaoMapa() {
		localMapa = localTemp;
	}

	@Override
	public void cancelarSelecaoMapa() {
		
	}

	@Override
	public void selecionarTodoOMapa() {
		localMapa = "mapaInteiro";		
	}

	public String getLocalMapa() {
		return localMapa;
	}

	public void setLocalMapa(String localMapa) {
		this.localMapa = localMapa;
	}

	public String getLocalTemp() {
		return localTemp;
	}

	public void setLocalTemp(String localTemp) {
		this.localTemp = localTemp;
	}

	@Override
	public String getNomeLocal(String local) {
		try{
			return Mensagens.getString(local);
		}catch(Exception e){
			return local;
		}
	}

	public boolean isBuscaNoMapa() {
		return buscaNoMapa;
	}

	public void setBuscaNoMapa(boolean buscaNoMapa) {
		this.buscaNoMapa = buscaNoMapa;
	}
}
