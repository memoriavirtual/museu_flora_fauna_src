package museu.controller;

public interface Mapa {

	public String getWkts(); //método que retornara as formas geometricas desenhadas no mapa
	
	public void selecionarAreaMapa(); //método chamado quando selecionado uma area no mapa, ele recebe como paremetro request "param1"
	
	public void confirmarSelecaoMapa();
	
	public void cancelarSelecaoMapa();
	
	public String getNomeLocal(String local);
}
