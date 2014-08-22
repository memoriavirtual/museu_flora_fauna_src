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

import museu.controller.acervo.BeanComMidiaMV;
import museu.fachadas.remoto.MuseuRemote;

import org.apache.commons.io.IOUtils;

import br.usp.memoriavirtual.servicos.soap.Multimidia;

@WebServlet(name = "midia", urlPatterns = { "/midia" })
public class Midia extends HttpServlet {

        private static final long serialVersionUID = -7748738652983031614L;

        @EJB
        private MuseuRemote museu;

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                        throws ServletException, IOException {
    
        	Integer id = Integer.parseInt(req.getParameter("id"));
        	String key = req.getParameter("chave");
        	
        	BeanComMidiaMV modal = (BeanComMidiaMV) req.getSession().getAttribute(key);
            Multimidia midia = null;
        	
			for(Multimidia m : modal.getFotosSelecionadoParaModal()){
				if(m.getId() == id){
					midia = m;
				}
			}
			if(midia == null){
				resp.setContentType("img/jpg");
	            resp.getOutputStream().write(getFotoDefault());
			}else{
	            resp.setContentType(midia.getContentType());
	            resp.getOutputStream().write(midia.getContent());
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