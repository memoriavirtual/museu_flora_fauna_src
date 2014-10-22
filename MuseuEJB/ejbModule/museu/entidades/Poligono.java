package museu.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Poligono implements Serializable{

	private static final long serialVersionUID = -1485100383224597727L;

	@SequenceGenerator(name = "POLIGONO_ID", sequenceName = "POLIGONO_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POLIGONO_ID")
	@Id
	private String id;
	
	private String nome;
	
	@Lob
	private String forma; //Em Coordenadas no Formato POLYGON(...)

	@ManyToOne
	@JoinColumn(name="MAPA_ID")
	private Mapa mapa;
	
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
