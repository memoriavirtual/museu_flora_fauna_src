package museu.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import museu.fachadas.remoto.MuseuRemote;

import org.apache.commons.io.IOUtils;

import br.usp.memoriavirtual.servicos.soap.Multimidia;

@WebServlet(name="Thumb",urlPatterns="/thumb")
public class Thumb extends HttpServlet{

	private static final long serialVersionUID = 4151154894234140590L;
	
    @EJB
    private MuseuRemote museu;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Long id = Long.parseLong(req.getParameter("id"));
		
		List<Multimidia> midias = museu.getMidias(id);
		
		if (midias.get(0) != null){
			resp.setContentType(midias.get(0).getContentType());
        	resp.getOutputStream().write(midias.get(0).getContent());
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
