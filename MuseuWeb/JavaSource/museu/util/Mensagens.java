package museu.util;

import java.util.ResourceBundle;

import javax.faces.context.FacesContext;

public class Mensagens {

	private static String bundleName = "strings";
	
	public static String getString(String nomeAtributo){
		FacesContext context = FacesContext.getCurrentInstance();
		ResourceBundle bundle = context.getApplication().getResourceBundle(
				context, bundleName);
		String message = bundle.getString(nomeAtributo);
		return message;
	}
	
}
