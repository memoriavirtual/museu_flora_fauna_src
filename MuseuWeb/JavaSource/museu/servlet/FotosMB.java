package museu.servlet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;

import museu.entidades.Slide;
import museu.fachadas.remoto.BancoRemote;
import museu.fachadas.remoto.MuseuRemote;
import museu.util.FacesUtil;

import org.apache.commons.io.IOUtils;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import br.usp.memoriavirtual.servicos.soap.Multimidia;

@ManagedBean(name="fotos")
@SessionScoped
public class FotosMB implements Serializable {

	private static final long serialVersionUID = 4123277535280650893L;

	@EJB
	MuseuRemote museu;
	
	@EJB
	BancoRemote banco;

	public FotosMB() {

	}

	public StreamedContent getFoto() throws RemoteException {
		FacesContext context = FacesContext.getCurrentInstance();

		if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			return new DefaultStreamedContent();
		} else {
			String id = context.getExternalContext().getRequestParameterMap().get("id");
			Multimidia midia = (Multimidia) FacesUtil.getSession(id);
			FacesUtil.removeSession(id);
			if(midia == null) return new DefaultStreamedContent(new ByteArrayInputStream(getFotoDefault()));
			return new DefaultStreamedContent(new ByteArrayInputStream(midia.getContent()));
		}

	}

	public StreamedContent getThumb() throws RemoteException {
		FacesContext context = FacesContext.getCurrentInstance();

		if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			return new DefaultStreamedContent();
		} else {
			String id = context.getExternalContext().getRequestParameterMap().get("id");
			List<Multimidia> midias = museu.getMidias(Long.parseLong(id));
			FacesUtil.removeSession(id);
			if(midias == null) return new DefaultStreamedContent(new ByteArrayInputStream(getFotoDefault()));
			return new DefaultStreamedContent(new ByteArrayInputStream(midias.get(0).getContent()));
		}
	}
	
	public StreamedContent getLogo() throws RemoteException {
		FacesContext context = FacesContext.getCurrentInstance();
		if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			return new DefaultStreamedContent();
		} else {
			if (museu.getConfiguracao().getLogo() != null)
				return new DefaultStreamedContent(new ByteArrayInputStream(museu.getConfiguracao().getLogo()));
			else
				return new DefaultStreamedContent(new ByteArrayInputStream(getFotoDefault()));
		}
	}
	
	public StreamedContent getSlide() throws RemoteException {
		FacesContext context = FacesContext.getCurrentInstance();

		if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			return new DefaultStreamedContent();
		} else {
			String id = context.getExternalContext().getRequestParameterMap().get("slide");
			Slide slide = banco.getSlide(id);
			if(slide == null) return new DefaultStreamedContent(new ByteArrayInputStream(getFotoDefault()));
			return new DefaultStreamedContent(new ByteArrayInputStream(slide.getContent()));
		}
	}
	
	private byte[] getFotoDefault(){
		   InputStream input = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/Images/indisponivel.jpg");
		
		    try {
		        return IOUtils.toByteArray(input);
		    }
		    catch (IOException e) {
		        e.printStackTrace();
		        return null;
		    }
		}
}