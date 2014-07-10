package museu.controller.adm;

import java.io.Serializable;

import javax.ejb.EJB;

import museu.entidades.Usuario;
import museu.fachadas.remoto.BancoRemote;
import museu.util.Constants;
import museu.util.FacesUtil;

public class Login implements Serializable {

        private static final long serialVersionUID = 780426841855310341L;

        private Usuario u = null;

        private String login;

        private String senha;

        @EJB
        private BancoRemote config;

        public Login() {

        }

        public String realizarLogin() {
                Usuario usuario = config.getUsuario(login);
                if (usuario == null) {
                        FacesUtil.addMessage("Login Inválido", null,Constants.WARN);
                } else {
                        if (usuario.getSenha().equals(this.senha)) {
                                u = usuario;
                                FacesUtil.setSession(Constants.USER, usuario);
                                return "/admin/index";
                        } else {
                                FacesUtil.addMessage("Senha Inválida", null,Constants.WARN);
                        }
                }
                return "login";
        }

        public String realizarLogoff() {
                u = null;
                FacesUtil.setSession(Constants.USER, null);
                return "/admin/login";
        }

        public Usuario getU() {
                return u;
        }

        public void setU(Usuario u) {
                this.u = u;
        }

        public String getSenha() {
                return senha;
        }

        public void setSenha(String senha) {
                this.senha = senha;
        }

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public BancoRemote getConfig() {
			return config;
		}

		public void setConfig(BancoRemote config) {
			this.config = config;
		}

}