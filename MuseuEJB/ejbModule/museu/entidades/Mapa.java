package museu.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Mapa implements Serializable{

	private static final long serialVersionUID = -7138442808931064232L;
	
	@SequenceGenerator(name = "MAPA_ID", sequenceName = "MAPA_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MAPA_ID")
	@Id
	private String id;
	
	private String zoomLevels;
	
	private Long latCenter;
	
	private Long longCenter;
	
	private String tipo; // LOCALIZACAO || BUSCA
	
	@OneToMany
	@JoinColumn(name="MAPA_ID")
	private List<Poligono> poligonos;

	public List<Poligono> getPoligonos() {
		return poligonos;
	}

	public void setPoligonos(List<Poligono> poligonos) {
		this.poligonos = poligonos;
	}

	public String getZoomLevels() {
		return zoomLevels;
	}

	public void setZoomLevels(String zoomLevels) {
		this.zoomLevels = zoomLevels;
	}

	public Long getLatCenter() {
		return latCenter;
	}

	public void setLatCenter(Long latCenter) {
		this.latCenter = latCenter;
	}

	public Long getLongCenter() {
		return longCenter;
	}

	public void setLongCenter(Long longCenter) {
		this.longCenter = longCenter;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
