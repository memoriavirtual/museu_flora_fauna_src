package museu.controller;

import java.util.List;

import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;
import br.usp.memoriavirtual.servicos.soap.Multimidia;

public abstract class Modal {

	private BemPatrimonial selecionadoParaModal;
	
	private List<Multimidia> fotosSelecionadoParaModal = null;

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
}
