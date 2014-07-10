package museu.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.FacesUtil;

import com.bkahlert.devel.wpws.model.Post;

public class ViewBusca implements Serializable{

	private static final long serialVersionUID = 7752075141662021151L;
	
	private String backPage = "1";
	private String stringBusca = "";
	
	private Post search;
	private String ID;
	
	@EJB
	private MuseuRemote museu;
	
	public ViewBusca(){}
	
	@PostConstruct
	public void init(){
		if(FacesUtil.getRequestParameter("backPage")!=null)
			backPage = FacesUtil.getRequestParameter("backPage");
		if(FacesUtil.getRequestParameter("stringBusca")!=null)
			stringBusca = FacesUtil.getRequestParameter("stringBusca");
		
		
		if(FacesUtil.getRequestParameter("idpost") !=null){
			ID = FacesUtil.getRequestParameter("idpost");
			this.loadSearch();
		}
	}
	
	public void loadSearch(){
		try {
			search = museu.getPost(Integer.parseInt(ID));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getBackPage() {
		return backPage;
	}

	public void setBackPage(String backPage) {
		this.backPage = backPage;
	}

	public String getStringBusca() {
		return stringBusca;
	}

	public void setStringBusca(String stringBusca) {
		this.stringBusca = stringBusca;
	}
	
	public Post getSearch() {
		return search;
	}

	public void setSearch(Post search) {
		this.search = search;
	}

}
