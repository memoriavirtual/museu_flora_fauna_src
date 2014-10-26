package museu.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.BancoRemote;
import museu.fachadas.remoto.MuseuRemote;

import com.bkahlert.devel.wpws.model.Gallery;
import com.bkahlert.devel.wpws.model.Page;
import com.bkahlert.devel.wpws.model.Post;

public class Index implements Serializable {

	private static final long serialVersionUID = -6422558484247970941L;

	private Page welcome;

	private List<Post> blog;

	private List<Post> events;

	private museu.entidades.Mapa mapa;
	
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
		mapa = banco.getMapaBusca();
		
		System.out.println("Carregando Eventos/Noticias/VoceSabia");
		try {
			blog = museu.getPosts("tag="+museu.getConfiguracao().getTagNews()+"&paged=1&posts_per_page=3");
			events = museu.getPosts("tag="+museu.getConfiguracao().getTagEvents()+"&paged=1&posts_per_page=3");
			voceSabia = museu.getPosts("tag="+museu.getConfiguracao().getTagVoceSabia()).get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Carregamento Concluido");
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

	public museu.entidades.Mapa getMapa() {
		return mapa;
	}

	public void setMapa(museu.entidades.Mapa mapa) {
		this.mapa = mapa;
	}
}