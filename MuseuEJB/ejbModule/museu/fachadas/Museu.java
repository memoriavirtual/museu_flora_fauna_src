package museu.fachadas;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import museu.entidades.Configuracao;
import museu.fachadas.remoto.BancoRemote;
import museu.fachadas.remoto.MuseuRemote;

import org.apache.axis.client.Stub;

import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;
import br.usp.memoriavirtual.servicos.soap.Buscar_ServiceLocator;
import br.usp.memoriavirtual.servicos.soap.Multimidia;
import br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPService;

import com.bkahlert.devel.wpws.WordPressWebServicePortTypeProxy;
import com.bkahlert.devel.wpws.model.Gallery;
import com.bkahlert.devel.wpws.model.Page;
import com.bkahlert.devel.wpws.model.Post;

@Stateless
public class Museu implements MuseuRemote {

	@EJB
	private BancoRemote banco;

	@PersistenceContext(unitName="museu")
	private EntityManager em;

	private WordPressWebServicePortTypeProxy wp;
	
	private RealizarBuscaSOAPService mv;
	
	public Museu() {
	}
	
	@Override
	public void carregarWebServices(){
		init();
	}
	
	@PostConstruct
	public void init(){
		wp = new WordPressWebServicePortTypeProxy(banco.getConfiguracao().getUrlWordpress());
		
		Buscar_ServiceLocator servico = new Buscar_ServiceLocator();
		servico.setRealizarBuscaSOAPServicePortEndpointAddress(banco.getConfiguracao().getUrlMemoria());
		
		try{
			RealizarBuscaSOAPService servico_ = servico.getRealizarBuscaSOAPServicePort();
			Stub stub = (Stub) servico_;
			stub._setProperty(Stub.USERNAME_PROPERTY, banco.getConfiguracao().getMemoriaVirtualLogin());
			stub._setProperty(Stub.PASSWORD_PROPERTY, banco.getConfiguracao().getMemoriaVirtualSenha());
			mv = servico_;
			}catch(Exception e){
			
		}
		
	}

	@Override
	public Configuracao getConfiguracao(){
		return banco.getConfiguracao();
	}
	
	@Override
	public List<Page> getPages(String args) throws RemoteException {
		return Arrays.asList(wp.getPages(args));
	}
	
	@Override
	public Page getPage(Integer id) throws RemoteException {
		return wp.getPage(id);
	}

	@Override
	public List<Post> getPosts(String args) throws RemoteException {
		return Arrays.asList(wp.getPosts(args));
	}

	@Override
	public Post getPost(Integer id) throws RemoteException {
		return wp.getPost(id);
	}

	@Override
	public Gallery getGallery(Integer id) throws RemoteException {
		return wp.getGallery(id);
	}

	@Override
	public List<Gallery> getGalleries(String args) throws RemoteException {
		return Arrays.asList(wp.getGalleries(args));
	}

	@Override
	public List<BemPatrimonial> getBens(String args,int pagina,int tamanhoPagina) throws RemoteException {
		BemPatrimonial[] bens = mv.buscarInstituicao(args, pagina,tamanhoPagina, banco.getConfiguracao().getNomeInstituicaoMemoria());
		
		if(bens == null) 
			return null;
		
		return Arrays.asList(bens);
	}
	
	@Override
	public List<Multimidia> getMidias(Long idBemPatrimonial)
			throws RemoteException {
		Multimidia[] midias = mv.buscarMidias(idBemPatrimonial.toString());
		if(midias==null) return null;
		return Arrays.asList(midias);
	}
}
