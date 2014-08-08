package museu.controller.acervo;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIData;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.Constants;
import museu.util.FacesUtil;
import museu.util.Mensagens;
import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;
import br.usp.memoriavirtual.servicos.soap.Multimidia;

import com.bkahlert.devel.wpws.model.Page;


@ManagedBean(name = "listagemCompleta")
@ViewScoped
public class ListagemCompletaAcervo implements Serializable{

	private static final long serialVersionUID = -1247505733388344492L;

	private static final int tamanhoPaginaDefaultAcervo = 15;
	
	@EJB
	private MuseuRemote museu;
	
	private List<BemPatrimonial> itens = new ArrayList<BemPatrimonial>();
	
	private BemPatrimonial selecionadoParaModal = null;
	private List<Multimidia> fotosSelecionadoParaModal = null;
	
	private UIData tabelaItens;
	
	private String stringBusca = "";
	
	private int pagina = 1;
	
	private boolean ultimaPagina;	
	
	private String tipoAcervo = Mensagens.getString("selecionarTipoAcervo");
	
	private Page page; //relacionado a pagina no Wordpress, de apresentação do acervo
	
	public ListagemCompletaAcervo(){
		
	}
	
	@PostConstruct
	public void init(){
		try {
			page = museu.getPage(Integer.parseInt(museu.getConfiguracao().getAcervoFlora()));
		} catch (RemoteException e) {
			e.printStackTrace();
		}		
		
		buscar(stringBusca);
	}
	
	public void buscar(String chave) {
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
	
	public void proxPagina(){
		pagina++;
		buscar(stringBusca);
		
	}
	
	public void pagAnterior(){
		pagina--;
		buscar(stringBusca);	
	}
	
	public void selecionaItemParaModal() throws RemoteException{
		selecionadoParaModal =  (BemPatrimonial) tabelaItens.getRowData();
		
		fotosSelecionadoParaModal = museu.getMidias(selecionadoParaModal.getId());
		if(fotosSelecionadoParaModal!=null){
			for(Multimidia midia: fotosSelecionadoParaModal){
				FacesUtil.setSession(new Long(midia.getId()).toString(), midia);
			}
		}
		
	}
	
	public List<BemPatrimonial> getItens() {
		return itens;
	}

	public void setItens(List<BemPatrimonial> itens) {
		this.itens = itens;
	}

	public BemPatrimonial getSelecionadoParaModal() {
		return selecionadoParaModal;
	}

	public void setSelecionadoParaModal(BemPatrimonial selecionadoParaModal) {
		this.selecionadoParaModal = selecionadoParaModal;
	}

	public UIData getTabelaItens() {
		return tabelaItens;
	}

	public void setTabelaItens(UIData tabelaItens) {
		this.tabelaItens = tabelaItens;
	}

	public List<Multimidia> getFotosSelecionadoParaModal() {
		return fotosSelecionadoParaModal;
	}

	public void setFotosSelecionadoParaModal(
			List<Multimidia> fotosSelecionadoParaModal) {
		this.fotosSelecionadoParaModal = fotosSelecionadoParaModal;
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
}
