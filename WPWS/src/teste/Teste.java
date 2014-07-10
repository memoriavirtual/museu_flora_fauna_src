package teste;

import java.rmi.RemoteException;

import com.bkahlert.devel.wpws.WordPressWebServicePortTypeProxy;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WordPressWebServicePortTypeProxy wordpress = new WordPressWebServicePortTypeProxy(
				"http://mff.icmc.usp.br:22180/wordpress/index.php?/wpws");
		try {
			wordpress.getPosts("tag=RightSide");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
