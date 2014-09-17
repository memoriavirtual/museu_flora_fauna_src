package museu.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import museu.fachadas.remoto.MuseuRemote;

import org.apache.commons.io.IOUtils;

@WebServlet(name="Logo",urlPatterns="/logo")
public class Logo extends HttpServlet{

	private static final long serialVersionUID = 4151154894234140590L;
	
    @EJB
    private MuseuRemote museu;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		if (museu.getConfiguracao().getLogo() != null){
			resp.setContentType(museu.getConfiguracao().getContentTypeLogo());
        	resp.getOutputStream().write(museu.getConfiguracao().getLogo());
		}
		else{
			resp.setContentType("img/jpg");
        	resp.getOutputStream().write(getFotoDefault(req));
		}
		
	}
	
	private byte[] getFotoDefault(HttpServletRequest req) {
		ServletContext context = getServletContext();
		InputStream input = context.getResourceAsStream("/Images/indisponivel.jpg");

		try {
			return IOUtils.toByteArray(input);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
