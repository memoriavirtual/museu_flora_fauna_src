package museu.controller.acervo;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIData;

import com.bkahlert.devel.wpws.model.Page;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.FacesUtil;
import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;
import br.usp.memoriavirtual.servicos.soap.Multimidia;


@ManagedBean(name = "listagemCompleta")
@ViewScoped
public class ListagemCompletaAcervo {
	
	@EJB
	private MuseuRemote museu;
	
	private List<BemPatrimonial> itens = new ArrayList<BemPatrimonial>();
	
	private BemPatrimonial selecionadoParaModal = null;
	private List<Multimidia> fotosSelecionadoParaModal = null;
	
	private UIData tabelaItens;
	
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
		
		for(int i = 1; ; i++){
			try {
				List<BemPatrimonial> bens = museu.getBens("", i, 30);
				if(bens == null) break;
				
				for(BemPatrimonial bem : bens){
					this.itens.add(bem);
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
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

}
