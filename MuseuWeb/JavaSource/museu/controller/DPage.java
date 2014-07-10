package museu.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.FacesUtil;

import com.bkahlert.devel.wpws.model.Page;

public class DPage implements Serializable{

	private static final long serialVersionUID = 4938122310587902401L;
	private Page page;
	private Integer ID;
	
	@EJB
	private MuseuRemote museu;
	
	public DPage(){
		
	}
	
	@PostConstruct
	public void run(){
		if(FacesUtil.getRequestParameter("idPagina") != null)
			ID = new Integer(FacesUtil.getRequestParameter("idPagina"));
		else
			ID = null;
		System.out.println("ID:"+ID);
		this.loadPage();
	}
	
	public void loadPage(){
		if(ID == null || ID == -1){
	        try {
	        	
	        	page = museu.getPage(Integer.parseInt(museu.getConfiguracao().getPadrao()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else{
	        try {
	        	page = museu.getPage(ID);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	
}
