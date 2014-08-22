package museu.controller;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.util.HashMap;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import museu.entidades.Acesso;
import museu.fachadas.remoto.BancoRemote;
import museu.fachadas.remoto.MuseuRemote;

import org.codehaus.jackson.map.ObjectMapper;


@ManagedBean(name = "salvaAcessoUsuario")
@SessionScoped
public class SalvaAcessoUsuario {
	
	@EJB
	private MuseuRemote museu;
	
	@EJB
	private BancoRemote banco;
	
	private boolean acessoJaSalvo = false;
	
	public SalvaAcessoUsuario(){
		
	}
	
	@SuppressWarnings("unchecked")
	public void guardaAcesso() throws IOException{
		if(acessoJaSalvo == false){
		
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			String ip = request.getRemoteAddr();
			
			java.util.Calendar cal = java.util.Calendar.getInstance(); 
			Date dataAcesso = new Date(cal.getTimeInMillis());
			
			String urlWebService = museu.getConfiguracao().getUrlFreeGeoIP()+ip;
			
			URL url = new URL(urlWebService);
		    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		    connection.setRequestMethod("GET");
		    connection.setConnectTimeout(15000);
		    connection.connect();
		     
		    HashMap<String,Object> geoip = new ObjectMapper().readValue(connection.getInputStream(), HashMap.class);
		    
		    Acesso acesso = new Acesso();
		    acesso.setIp(ip);
		    acesso.setCountryCode((String) geoip.get("country_code"));
		    acesso.setCountryName((String) geoip.get("country_name"));
		    acesso.setRegionCode((String) geoip.get("region_code"));
		    acesso.setRegionName((String) geoip.get("region_name"));
		    acesso.setZipCode((String) geoip.get("zipcode"));
		    acesso.setCity((String) geoip.get("city"));
		    acesso.setLatitude(geoip.get("latitude").toString());
		    acesso.setLongitude(geoip.get("longitude").toString());
		    acesso.setMetroCode((String) geoip.get("metro_code"));
		    acesso.setAreaCode((String) geoip.get("area_code"));
		    acesso.setAcessDate(dataAcesso);
		    
		    banco.persistirAcesso(acesso);
		    acessoJaSalvo = true;
		}
	}
}
