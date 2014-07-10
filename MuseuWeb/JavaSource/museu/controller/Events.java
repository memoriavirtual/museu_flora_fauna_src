package museu.controller;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.FacesUtil;

import com.bkahlert.devel.wpws.model.Post;

public class Events implements Serializable {

	private static final long serialVersionUID = 2947745858184499891L;
	private int page;

	private boolean backButton;
	private boolean nextButton;

	private List<Post> events = null;

	@EJB
	private MuseuRemote museu;

	public Events() {
		page = 1;
	}

	@PostConstruct
	public void run() {
		if (FacesUtil.getRequestParameter("idPagina") != null)
			page = new Integer(FacesUtil.getRequestParameter("idPagina"))
					.intValue();
		else
			page = 1;
		this.loadEvents();
	}

	public void loadEvents() {
		try {
			events = museu.getPosts("tag="+museu.getConfiguracao().getTagEvents()+"&paged=" + page);
			if (page == 1)
				backButton = false;
			else
				backButton = true;
			if (museu.getPosts("tag="+museu.getConfiguracao().getTagEvents()+"&paged=" + (page + 1)).size() >= 1)
				nextButton = true;
			else
				nextButton = false;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public void nextPage() {
		page++;
		loadEvents();
	}

	public void backPage() {
		page--;
		loadEvents();
	}

	public List<Post> getEvents() {
		return events;
	}

	public void setEvents(List<Post> events) {
		this.events = events;
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
