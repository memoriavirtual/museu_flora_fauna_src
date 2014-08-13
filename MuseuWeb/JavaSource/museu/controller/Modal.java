package museu.controller;

import java.util.ArrayList;
import java.util.List;

import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;
import br.usp.memoriavirtual.servicos.soap.Multimidia;

public abstract class Modal {

	private BemPatrimonial selecionadoParaModal = new BemPatrimonial();
	
	private List<Multimidia> fotosSelecionadoParaModal = new ArrayList<Multimidia>();

	public Modal(){
		selecionadoParaModal.setNumeroRegistro(new String());
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
}
