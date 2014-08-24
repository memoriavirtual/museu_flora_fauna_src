package museu.entidades;

import java.io.Serializable;
import java.util.List;


public class Mapa implements Serializable{

	private static final long serialVersionUID = -7138442808931064232L;

	private List<Poligono> poligonos;

	public List<Poligono> getPoligonos() {
		return poligonos;
	}

	public void setPoligonos(List<Poligono> poligonos) {
		this.poligonos = poligonos;
	}
	
}
