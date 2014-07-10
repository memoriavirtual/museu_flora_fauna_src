package museu.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.activation.DataHandler;
import javax.ejb.EJB;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

import museu.fachadas.remoto.MuseuRemote;

import org.apache.commons.io.IOUtils;
import org.primefaces.model.UploadedFile;

public class EmailUtil implements Serializable {

	private static final long serialVersionUID = -2043778923175158335L;

	@EJB
	private MuseuRemote museu;

	private List<MimeBodyPart> anexos;
	private MimeBodyPart texto;
	private String assunto;

	public EmailUtil() {

	}

	public void setAnexos(List<UploadedFile> attachments) {
		anexos = new ArrayList<MimeBodyPart>();
		for (int i = 0; i < attachments.size(); i++) {
			MimeBodyPart anexo = new MimeBodyPart();
			try {

				UploadedFile item = attachments.get(i);
				byte[] arquivo = IOUtils.toByteArray(item.getInputstream());

				anexo.setDataHandler(new DataHandler(new ByteArrayDataSource(
						arquivo, item.getContentType())));
				anexo.setFileName(item.getFileName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			anexos.add(anexo);
		}

	}

	public void setTexto(String text) throws MessagingException {
		texto = new MimeBodyPart();
		texto.setContent(text, "text/html; charset=utf-8");
	}

	public String sendMail() throws AddressException, MessagingException {
		Session session = null;
		try {
			Context initCtx = new InitialContext();
			session = (Session) initCtx.lookup("mail/Museu");
		} catch (Exception e) {
			e.printStackTrace();
		}
		/** Ativa Debug para sessão */
		session.setDebug(true);

		Message message = new MimeMessage(session);

		Multipart mp = new MimeMultipart();
		mp.addBodyPart(texto);
		for (int i = 0; i < anexos.size(); i++)
			mp.addBodyPart(anexos.get(i));

		Address[] toUser = InternetAddress // Destinatário(s)
				.parse("mff@icmc.usp.br");
		message.setRecipients(Message.RecipientType.TO, toUser);
		message.setSubject(assunto);// Assunto
		message.setSentDate(new Date());
		message.setContent(mp);
		/** Método para enviar a mensagem criada */
		Transport.send(message);
		System.out.println("Done!");

		return "Done";
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

}
