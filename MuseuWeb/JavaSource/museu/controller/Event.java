package museu.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.FacesUtil;

import com.bkahlert.devel.wpws.model.Gallery;
import com.bkahlert.devel.wpws.model.Post;

public class Event implements Serializable{

	private static final long serialVersionUID = 2289286661596924648L;
	private Post post;
	private Gallery gallery;
	private int ID;
	private int backPage;
	
	private String urlEvento;
	
	@EJB
	private MuseuRemote museu;
	
	@PostConstruct
	public void run(){
		if(FacesUtil.getRequestParameter("idEvent") !=null){
			ID = new Integer(FacesUtil.getRequestParameter("idEvent")).intValue();
			if(FacesUtil.getRequestParameter("backPage") !=null)
				backPage = new Integer(FacesUtil.getRequestParameter("backPage")).intValue();
			else
				backPage = 1;
			this.loadEvent();
		}
		else
			this.loadNewestEvent();
	}
	
	public void loadEvent(){
        try {
        	post = museu.getPost(ID);
        	gallery = museu.getGallery(post.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        urlEvento = museu.getConfiguracao().getUrlPortal() + "/pages/event.jsf?idEvent=" + post.getId();
	}
	
	
	public void loadNewestEvent(){
        try {
        	post = museu.getPosts("tag="+museu.getConfiguracao().getTagEvents()).get(0);
        	gallery = museu.getGallery(post.getId());
        	backPage = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        urlEvento = museu.getConfiguracao().getUrlPortal() + "/pages/event.jsf?idEvent=" + post.getId();
	}
	
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Gallery getGallery() {
		return gallery;
	}

	public void setGallery(Gallery gallery) {
		this.gallery = gallery;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getBackPage() {
		return backPage;
	}

	public void setBackPage(int backPage) {
		this.backPage = backPage;
	}

	public String getUrlEvento() {
		return urlEvento;
	}

	public void setUrlEvento(String urlEvento) {
		this.urlEvento = urlEvento;
	}
}
