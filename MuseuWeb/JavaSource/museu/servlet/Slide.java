package museu.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import museu.fachadas.remoto.BancoRemote;

@WebServlet(name="Slide",urlPatterns="/slide")
public class Slide extends HttpServlet{

	private static final long serialVersionUID = 4151154894234140590L;

	@EJB
	BancoRemote banco;	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String id = req.getParameter("id");
		museu.entidades.Slide slide = banco.getSlide(id);
		
		if (slide != null){
			resp.setContentType(slide.getContentType());
        	resp.getOutputStream().write(slide.getContent());
		}
		else{
			resp.setContentType("img/jpg");
        	resp.getOutputStream().write(getFotoDefault());
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
