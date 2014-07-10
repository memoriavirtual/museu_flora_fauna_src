package museu.controller;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.FacesUtil;

import com.bkahlert.devel.wpws.model.Post;

public class News implements Serializable{

	private static final long serialVersionUID = -4333469337728669036L;
	
	private int page;
	
	private boolean backButton;
	private boolean nextButton;
	
	private List<Post> blog = null;
	
	@EJB
	private MuseuRemote museu;
	
	@PostConstruct
	public void run(){
		if(FacesUtil.getRequestParameter("idPagina")!=null)
			page = new Integer(FacesUtil.getRequestParameter("idPagina")).intValue();
		else
			page = 1;
		this.loadFeed();
	}
	
	public void loadFeed(){
        try {
			blog = museu.getPosts("tag="+museu.getConfiguracao().getTagNews()+"&paged="+page);
			if(page == 1)
				backButton = false;
			else
				backButton = true;
			if(museu.getPosts("tag="+museu.getConfiguracao().getTagNews()+"&paged="+(page+1)).size() >= 1)
				nextButton = true;
			else
				nextButton = false;
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public void nextPage(){
		page++;
		this.loadFeed();
	}
	
	public void backPage(){
		page--;
		this.loadFeed();
	}
	
	public boolean isNextButton() {
		return nextButton;
	}

	public void setNextButton(boolean nextButton) {
		this.nextButton = nextButton;
	}

	public boolean isBackButton() {
		return backButton;
	}

	public void setBackButton(boolean backButton) {
		this.backButton = backButton;
	}

	public List<Post> getBlog() {
		return blog;
	}

	public void setBlog(List<Post> blog) {
		this.blog = blog;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public MuseuRemote getMuseu() {
		return museu;
	}

	public void setMuseu(MuseuRemote museu) {
		this.museu = museu;
	}
}
