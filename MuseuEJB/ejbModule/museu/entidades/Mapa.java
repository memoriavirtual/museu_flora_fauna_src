package museu.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	private String tipo; // LOCALIZACAO || BUSCA
	
	private String latitude;
	
	private String longitude;
	
	private String url;
	
	@OneToMany(fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name="MAPA_ID")
	private List<Poligono> poligonos;

	public List<Poligono> getPoligonos() {
		return poligonos;
	}

	public void setPoligonos(List<Poligono> poligonos) {
		this.poligonos = poligonos;
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

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}	
}
