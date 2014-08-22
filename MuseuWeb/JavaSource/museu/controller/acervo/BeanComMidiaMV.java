package museu.controller.acervo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.PreDestroy;

import museu.util.FacesUtil;
import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;
import br.usp.memoriavirtual.servicos.soap.Multimidia;

public abstract class BeanComMidiaMV {

	private BemPatrimonial selecionadoParaModal = new BemPatrimonial();
	
	private List<Multimidia> fotosSelecionadoParaModal = new ArrayList<Multimidia>();

	private String sessionKey;
	
	public BeanComMidiaMV(){
		selecionadoParaModal.setNumeroRegistro(new String());
		sessionKey = UUID.randomUUID().toString();
	}
	
	public void setToSession(){
		FacesUtil.setSession(sessionKey, this);
	}
	
	public BemPatrimonial getSelecionadoParaModal() {
		return selecionadoParaModal;
	}

	public void setSelecionadoParaModal(BemPatrimonial selecionadoParaModal) {
		this.selecionadoParaModal = selecionadoParaModal;
	}

	public List<Multimidia> getFotosSelecionadoParaModal() {
		return fotosSelecionadoParaModal;
	}

	public void setFotosSelecionadoParaModal(
			List<Multimidia> fotosSelecionadoParaModal) {
		this.fotosSelecionadoParaModal = fotosSelecionadoParaModal;
	}
	
	public abstract void selecionaItemParaModal();

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	
	@PreDestroy
	public void destroy() {
		if(FacesUtil.getSession(sessionKey)!=null){
			FacesUtil.removeSession(sessionKey);
		}
	}
}
