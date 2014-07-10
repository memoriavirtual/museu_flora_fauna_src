package museu.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import com.bkahlert.devel.wpws.model.Gallery;
import com.bkahlert.devel.wpws.model.Post;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.FacesUtil;

public class New implements Serializable{

	private static final long serialVersionUID = 7312066387051546878L;
	private Post post;
	private Gallery gallery;
	private int ID;
	private int backPage;
	private String data;
	
	@EJB
	private MuseuRemote museu;
	
	@PostConstruct
	public void run(){
		if(FacesUtil.getRequestParameter("idNews") !=null){
			ID = new Integer(FacesUtil.getRequestParameter("idNews")).intValue();
			if(FacesUtil.getRequestParameter("backPage") !=null)
				backPage = new Integer(FacesUtil.getRequestParameter("backPage")).intValue();
			else
				backPage = 1;
			this.loadPost();
		}
		else
			this.loadNewestPost();
	}
	
	
	@SuppressWarnings("deprecation")
	public void loadPost(){
        try {
        	post = museu.getPost(ID);
        	gallery = museu.getGallery(post.getId());
        	data = post.getDate().toLocaleString().split(" ")[0];
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void loadNewestPost(){
        try {
        	post = museu.getPosts("tag="+museu.getConfiguracao().getTagNews()).get(0);
        	gallery = museu.getGallery(post.getId());
        	backPage = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
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


	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}	
	
}
