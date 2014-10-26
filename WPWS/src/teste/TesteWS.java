package teste;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.bkahlert.devel.wpws.WordPressWebServicePortTypeProxy;
import com.bkahlert.devel.wpws.model.Post;

public class TesteWS {

	@Test
	public void testConexao() {
		WordPressWebServicePortTypeProxy wordpress = new WordPressWebServicePortTypeProxy(
				"http://localhost/wordpress/index.php?/wpws");
		try {
			Post post = wordpress.getPosts("tag=News")[0];
			assertNotNull(post);			
		} catch (RemoteException e) {
			fail("exepction");
			e.printStackTrace();
		}
	}

}
