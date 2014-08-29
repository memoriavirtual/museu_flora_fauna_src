package museu.fachadas.remoto;

import java.sql.Date;
import java.util.List;

import javax.ejb.Remote;

import museu.entidades.Acesso;
import museu.entidades.Configuracao;
import museu.entidades.Slide;
import museu.entidades.Usuario;

@Remote
public interface BancoRemote {

	public void salvarConfiguracoes(Configuracao configuracao);
	public Configuracao getConfiguracao();
	
	public Usuario getUsuario(String email);
	public void salvaUsuario(Usuario usuario);
	public List<Usuario> getUsuarios();
	
	public List<Slide> getSlides();
	public Slide getSlide(String id);
	public void persistirSlide(Slide s);
	public void updateSlide(Slide s);
	public void removerSlide(String id);
	public Slide getSlideByOrdem(Integer ordem);
	public Integer getMaiorOrdemDeSlide();
	
	public void persistirAcesso(Acesso a);
	public List<Acesso> getAcessos(int pagina,int tamanho);
	public List<Acesso> pesquisarAcessos(Date date,int pagina,int tamanho);
	
	public Long getTotalAcessos();
	public Long getTotalAcessosDia(Date date);
}
