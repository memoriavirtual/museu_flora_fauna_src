package museu.entidades;

import java.io.Serializable;

public class Poligono implements Serializable{

	private static final long serialVersionUID = -1485100383224597727L;

	private String nome;
	
	private String forma;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
}
