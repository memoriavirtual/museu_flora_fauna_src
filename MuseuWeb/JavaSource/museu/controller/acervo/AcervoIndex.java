package museu.controller.acervo;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.Constants;
import museu.util.FacesUtil;
import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;

public class AcervoIndex implements Serializable {

	private static final int tamanhoPaginaDefaultIndex = 3;
	
	private static final long serialVersionUID = -3685611350450753145L;
	
	private List<BemPatrimonial> resultados = null;

	private int pagina = 1;
	
	private boolean ultimaPagina;

	@EJB
	private MuseuRemote museu;
	
	@PostConstruct
	public void run() {
		System.out.println("Carregando Acervo do Index");
		buscar("");
		System.out.println("Acervo Carregado do Index");
	}
	
	public void buscar(String chave) {
		try {
			resultados = museu.getBens(chave,pagina,tamanhoPaginaDefaultIndex);
			if(museu.getBens(chave, pagina+1,tamanhoPaginaDefaultIndex)==null)
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
		buscar("");
		
	}
	
	public void pagAnterior(){
		pagina--;
		buscar("");	
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

	public boolean isUltimaPagina() {
		return ultimaPagina;
	}

	public void setUltimaPagina(boolean ultimaPagina) {
		this.ultimaPagina = ultimaPagina;
	}
}
