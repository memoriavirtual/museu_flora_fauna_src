package teste;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;

import org.apache.axis.encoding.Base64;

import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;
import br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPServiceProxy;

public class Teste {

	/**
	 * @param args
	 * @throws IOException
	 * @throws RemoteException
	 */
	public static void main(String[] args) throws IOException {
		RealizarBuscaSOAPServiceProxy ws = new RealizarBuscaSOAPServiceProxy(
				"http://localhost:8080/memoriavirtualWebService/buscar");

		
		//SOAP
		BemPatrimonial bem;
		try {
			bem = ws.buscar("MFF", 1)[0];

			System.out.println(bem.getColecao());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//REST
		String webPage = "http://localhost:8080/memoriavirtualWebService/rest/buscar";
		String name = "mvirtual";
		String password = "mvirtual";
		String authString = name + ":" + password;

		String authStringEnc = Base64.encode(authString.getBytes());

		System.out.println("Base64 encoded auth string: " + authStringEnc);

		URL url = new URL(webPage);
		URLConnection urlConnection = url.openConnection();
		urlConnection.setRequestProperty("Authorization", "Basic "
				+ authStringEnc);
		InputStream is = urlConnection.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);

		int numCharsRead;
		char[] charArray = new char[1024];
		StringBuffer sb = new StringBuffer();
		while ((numCharsRead = isr.read(charArray)) > 0) {
			sb.append(charArray, 0, numCharsRead);
		}
		String result = sb.toString();

		System.out.println("---------------------------------------------");
		System.out.println("Response from the server: " + result);

	}

}
