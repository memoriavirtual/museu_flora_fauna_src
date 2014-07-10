package museu.controller;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.FacesUtil;

import com.bkahlert.devel.wpws.model.Post;

public class Busca implements Serializable{
	
	private static final long serialVersionUID = -6513539498844351067L;
	
	private List<Post> posts = null;
	
	private int page = 1;
	private boolean backButton;
	private boolean nextButton;
	
	@EJB
	private MuseuRemote museu;
	
	private String stringBusca = "";
	
	public Busca(){
		
	}
	
	@PostConstruct
	public void run(){
		if(FacesUtil.getRequestParameter("stringBusca") !=null)
			stringBusca = (String) FacesUtil.getRequestParameter("stringBusca");
		if(FacesUtil.getRequestParameter("idPagina") !=null)
			page = Integer.parseInt(FacesUtil.getRequestParameter("idPagina"));
		
		realizarBusca(stringBusca);
	}
	
	public void realizarBusca(String chave){
		try {
			posts = museu.getPosts("s="+stringBusca+"&paged="+page);
			if(page==1)
				backButton = false;
			else
				backButton = true;
			
			if(museu.getPosts("s="+stringBusca+"&paged=" + (page + 1)).size() >= 1)
				nextButton = true;
			else
				nextButton = false;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public void nextPage() {
		page++;
		realizarBusca(stringBusca);
	}

	public void backPage() {
		page--;
		realizarBusca(stringBusca);
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String getStringBusca() {
		return stringBusca;
	}

	public void setStringBusca(String stringBusca) {
		this.stringBusca = stringBusca;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public boolean isBackButton() {
		return backButton;
	}

	public void setBackButton(boolean backButton) {
		this.backButton = backButton;
	}

	public boolean isNextButton() {
		return nextButton;
	}

	public void setNextButton(boolean nextButton) {
		this.nextButton = nextButton;
	}

	public MuseuRemote getMuseu() {
		return museu;
	}

	public void setMuseu(MuseuRemote museu) {
		this.museu = museu;
	}
	
}
