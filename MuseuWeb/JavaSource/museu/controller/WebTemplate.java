package museu.controller;

import java.io.Serializable;

import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;

public class WebTemplate implements Serializable{
	
	private static final long serialVersionUID = 8525924864372596029L;
	private String Location = "Onde Voce Esta no Site";
	private String urlDP;
	private String urlAcervo;
	
	@EJB
	private MuseuRemote museu;

	public WebTemplate(){
	}
	
	public String preLoad(){
		return "success";
	}
	
	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getUrlDP() {
		return urlDP;
	}

	public void setUrlDP(String urlDP) {
		this.urlDP = urlDP;
	}

	public String getUrlAcervo() {
		return urlAcervo;
	}

	public void setUrlAcervo(String urlAcervo) {
		this.urlAcervo = urlAcervo;
	}

	public String Home(){
		return "index";
	}
	
	public String ajudeOMuseu(){
		return "ajudeOMuseu";
	}
	
	public String OMuseu(){
		return "pagina";
	}
	
	public String Fundacao(){
		return "pagina";
	}
	
	public String Institucional(){
		return "pagina";
	}
	
	public String MissaoEObjetivos(){
		return "pagina";
	}
	
	public String PalestrasEEventos(){
		return "events";
	}
	
	public String VisiteHorarios(){
		return "pagina";
	}
	
	public String VisiteLocalizacao(){
		return "pagina";
	}
	
	public String MaisOutrosMuseus(){
		return "pagina";
	}

	public String Links(){
		return "pagina";
	}
	
	public String Midia(){
		return "pagina";
	}
	
	public String Acervo(){
		return "acervo";
	}
	
	public String AcervoFauna(){
		return "acervo_fauna";
	}

	public String AcervoFlora(){
		return "acervo_flora";
	}

	public MuseuRemote getMuseu() {
		return museu;
	}

	public void setMuseu(MuseuRemote museu) {
		this.museu = museu;
	}
}
