package museu.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import museu.entidades.Acesso;
import museu.fachadas.remoto.BancoRemote;
import museu.fachadas.remoto.MuseuRemote;

import org.codehaus.jackson.map.ObjectMapper;

import com.bkahlert.devel.wpws.model.Gallery;
import com.bkahlert.devel.wpws.model.Page;
import com.bkahlert.devel.wpws.model.Post;

public class Index implements Serializable {

	private static final long serialVersionUID = -6422558484247970941L;

	private Page welcome;

	private List<Post> blog;

	private List<Post> events;

	private Post voceSabia;
	private Gallery voceSabiaImage;

	private String stringBusca = "";
	
	@EJB
	private MuseuRemote museu;
	
	@EJB
	private BancoRemote banco;

	public Index() throws IOException {
		
	}

	
	
	@PostConstruct
	public void run() {
		System.out.println("Carregando Index");
		try {
			LoadWelcome();
			LoadNews();
			LoadEvents();
			LoadVoceSabia();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Index Carregado");
	}

	@SuppressWarnings("unchecked")
	public void guardaAcesso() throws IOException{
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
	}
	
	public void LoadWelcome() throws RemoteException{
		welcome = museu.getPage(Integer.parseInt(museu.getConfiguracao().getBemVindo()));
	}
	
	public void LoadNews() throws RemoteException {
		List<Post> blogTemp = museu.getPosts("tag="+museu.getConfiguracao().getTagNews()+"&paged=1");
		blog = new ArrayList<Post>();

		for (int i = 0; i < 4; i++) {
			if (i == blogTemp.size())
				break;
			blog.add(blogTemp.get(i));
		}
	}

	public void LoadEvents() throws RemoteException {
		List<Post> eventsTemp = museu.getPosts("tag="+museu.getConfiguracao().getTagEvents()+"&paged=1");
		events = new ArrayList<Post>();

		for (int i = 0; i < 3; i++) {
			if (i == eventsTemp.size())
				break;
			events.add(eventsTemp.get(i));
		}
	}

	public void LoadVoceSabia() throws RemoteException {
		voceSabia = museu.getPosts("tag="+museu.getConfiguracao().getTagVoceSabia()).get(0);
	}

	public List<Post> getBlog() {
		return blog;
	}

	public void setBlog(List<Post> blog) {
		this.blog = blog;
	}

	public Post getVoceSabia() {
		return voceSabia;
	}

	public void setVoceSabia(Post voceSabia) {
		this.voceSabia = voceSabia;
	}

	public Gallery getVoceSabiaImage() {
		return voceSabiaImage;
	}

	public void setVoceSabiaImage(Gallery voceSabiaImage) {
		this.voceSabiaImage = voceSabiaImage;
	}

	public List<Post> getEvents() {
		return events;
	}

	public void setEvents(List<Post> events) {
		this.events = events;
	}	

	public MuseuRemote getMuseu() {
		return museu;
	}

	public void setMuseu(MuseuRemote museu) {
		this.museu = museu;
	}

	public String getStringBusca() {
		return stringBusca;
	}

	public void setStringBusca(String stringBusca) {
		this.stringBusca = stringBusca;
	}	
	
	 public static String inputStreamToString(InputStream is) throws IOException {
	      if (is != null) {
	         Writer writer = new StringWriter();

	         char[] buffer = new char[1024];
	         try {
	            Reader reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
	            int n;
	            while ((n = reader.read(buffer)) != -1) {
	               writer.write(buffer, 0, n);
	            }
	         } finally {
	            is.close();
	         }
	         return writer.toString();
	      } else {
	         return "";
	      }
	   }

	public Page getWelcome() {
		return welcome;
	}



	public void setWelcome(Page welcome) {
		this.welcome = welcome;
	}
}