package museu.controller.adm;

import java.io.Serializable;

import javax.ejb.EJB;

import museu.entidades.Usuario;
import museu.fachadas.remoto.BancoRemote;
import museu.util.Constants;
import museu.util.FacesUtil;

public class PrimeiroAcesso implements Serializable{

	private static final long serialVersionUID = 3075609767135312620L;
	
	private Usuario usuario = new Usuario();
	
	private String senhaRedigitada = new String();
	
	@EJB
	private BancoRemote banco;
	
	public PrimeiroAcesso(){
		
	}

	public String realizarCadastro(){
		if(!usuario.getSenha().equals(senhaRedigitada)){
			FacesUtil.addMessage("Senhas não conferem", "", Constants.ERROR);
			return "admin/primeiro_acesso.jsf";
		}
		else if(usuario.getEmail().isEmpty()){
			FacesUtil.addMessage("Login em Branco", "", Constants.ERROR);
			return "admin/primeiro_acesso.jsf";
		}
		else if(usuario.getNome().isEmpty()){
			FacesUtil.addMessage("Nome em Branco", "", Constants.ERROR);
			return "admin/primeiro_acesso.jsf";
		}
		else if(usuario.getSenha().isEmpty()){
			FacesUtil.addMessage("Senha em Branco", "", Constants.ERROR);
			return "admin/primeiro_acesso.jsf";
		}
		else{
			banco.salvaUsuario(usuario);
			FacesUtil.addMessage("Cadastro Realizado com sucesso", "", Constants.INFO);
			return "/admin/login.jsf";
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getSenhaRedigitada() {
		return senhaRedigitada;
	}

	public void setSenhaRedigitada(String senhaRedigitada) {
		this.senhaRedigitada = senhaRedigitada;
	}
	
	
}
