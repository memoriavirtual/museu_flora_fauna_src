package museu.controller.acervo;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.Constants;
import museu.util.FacesUtil;
import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;

public class AcervoIndex extends BeanComMidiaMV implements Serializable {

	private static final int tamanhoPaginaDefaultIndex = 3;
	
	private static final long serialVersionUID = -3685611350450753145L;
	
	private List<BemPatrimonial> resultados = null;

	private int pagina = 1;

	@EJB
	private MuseuRemote museu;
	
	public AcervoIndex(){
		super();
	}
	
	@PostConstruct
	public void run() {
		System.out.println("Carregando Acervo do Index");
		buscar("");
		System.out.println("Acervo Carregado do Index");
	}
	
	public void buscar(String chave) {
		try {
			resultados = museu.getBens(chave,pagina,tamanhoPaginaDefaultIndex);	
		} catch (Exception e) {
			FacesUtil
					.addMessage(
							"Erro ao comunicador com servidor de dados: Memória Virtual",
							"Erro ao comunicador com servidor de dados: Memória Virtual",
							Constants.ERROR);
			e.printStackTrace();
		}
	}
	
	public List<BemPatrimonial> getResultados() {
		return resultados;
	}

	public void setResultados(List<BemPatrimonial> resultados) {
		this.resultados = resultados;
	}

	public MuseuRemote getMuseu() {
		return museu;
	}

	public void setMuseu(MuseuRemote museu) {
		this.museu = museu;
	}
	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	@Override
	public void selecionaItemParaModal() {
		try {
			setFotosSelecionadoParaModal(museu.getMidias(getSelecionadoParaModal().getId()));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		this.setToSession();	
	}
	
	public void selecionaItemParaModal(BemPatrimonial bem){
		System.out.println("teste:"+bem.getTituloPrincipal());
		setSelecionadoParaModal(bem);
		try {
			setFotosSelecionadoParaModal(museu.getMidias(getSelecionadoParaModal().getId()));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		this.setToSession();		
	}
}
