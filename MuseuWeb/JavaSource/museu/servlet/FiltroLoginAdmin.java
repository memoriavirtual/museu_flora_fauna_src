package museu.servlet;

import java.io.IOException;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import museu.entidades.Usuario;
import museu.fachadas.remoto.BancoRemote;
import museu.util.Constants;

public class FiltroLoginAdmin implements Filter, Serializable {

	private static final long serialVersionUID = 8072680858090704425L;

	@EJB
	private BancoRemote banco;
	
	public FiltroLoginAdmin() {

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		Usuario usuario = (Usuario) ((HttpServletRequest) request).getSession()
				.getAttribute(Constants.USER);

		String url = ((HttpServletRequest) request).getRequestURL().toString();

		if(url.contains("admin")){
			
			if(banco.getUsuarios().size() == 0){
				if(!url.contains("primeiro_acesso")){
					String contextPath = ((HttpServletRequest) request).getContextPath();
					((HttpServletResponse) response).sendRedirect(contextPath+ "/admin/primeiro_acesso.jsf");
				}else{
					chain.doFilter(request, response);
				}
			}else{
				if(usuario != null && url.contains("login")){
					String contextPath = ((HttpServletRequest) request).getContextPath();
					((HttpServletResponse) response).sendRedirect(contextPath+ "/admin/index.jsf");
				}
				
				else if (usuario == null && !url.contains("login")) {
					String contextPath = ((HttpServletRequest) request).getContextPath();
					((HttpServletResponse) response).sendRedirect(contextPath+ "/admin/login.jsf");
				}else {
					chain.doFilter(request, response);
				}
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
