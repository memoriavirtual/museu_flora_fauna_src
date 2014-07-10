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
import br.usp.memoriavirtual.servicos.soap.Multimidia;

public class ItemDoAcervo implements Serializable {

	private static final long serialVersionUID = -4091352528877557900L;

	private BemPatrimonial bem;

	private List<Multimidia> fotos;
	
	@EJB
	private MuseuRemote museu;

	public ItemDoAcervo() {

	}

	@PostConstruct
	public void run() {
		if (!(FacesUtil.getRequestParameter("idBem") == null)) {
			String id = FacesUtil.getRequestParameter("idBem");
			try {
				bem = museu.getBens(id,1,1).get(0);
				fotos = museu.getMidias(bem.getId());
				if(fotos!=null){
					for(Multimidia midia: fotos){
						FacesUtil.setSession(new Long(midia.getId()).toString(), midia);
					}
				}
			} catch (RemoteException e) {
				FacesUtil
						.addMessage("Erro:",
								"Bem Patrimonial Não Consta no Acervo",
								Constants.ERROR);
				e.printStackTrace();
			}
		}
	}

	public void selectItemToModal(Multimidia midia){
		
	}
	
	public void setBem(BemPatrimonial bem) {
		this.bem = bem;
	}

	public BemPatrimonial getBem() {
		return bem;
	}

	public MuseuRemote getMuseu() {
		return museu;
	}

	public void setMuseu(MuseuRemote museu) {
		this.museu = museu;
	}

	public List<Multimidia> getFotos() {
		return fotos;
	}

	public void setFotos(List<Multimidia> fotos) {
		this.fotos = fotos;
	}
}
