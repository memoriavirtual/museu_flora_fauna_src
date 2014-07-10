package museu.fachadas.remoto;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.Remote;

import museu.entidades.Configuracao;
import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;
import br.usp.memoriavirtual.servicos.soap.Multimidia;

import com.bkahlert.devel.wpws.model.Gallery;
import com.bkahlert.devel.wpws.model.Page;
import com.bkahlert.devel.wpws.model.Post;

@Remote
public interface MuseuRemote{

	public List<Page> getPages(String args) throws RemoteException;
	public Page getPage(Integer id) throws RemoteException;
	public List<Post> getPosts(String args) throws RemoteException;
	public Post getPost(Integer id) throws RemoteException;
	public Gallery getGallery(Integer id) throws RemoteException;
	public List<Gallery> getGalleries(String args) throws RemoteException;
	
	public void carregarWebServices();
	
	public List<Multimidia> getMidias(Long idBemPatrimonial) throws RemoteException;
	public List<BemPatrimonial> getBens(String args,int pagina,int tamanhoPagina) throws RemoteException;
	
	public Configuracao getConfiguracao();
}
