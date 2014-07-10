package museu.controller;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.fachadas.remoto.MuseuRemote;
import museu.util.Constants;
import museu.util.EmailUtil;
import museu.util.FacesUtil;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.bkahlert.devel.wpws.model.Page;

public class AjudeOMuseu implements Serializable{

	private static final long serialVersionUID = -8794959968642766635L;
	
	@EJB
	private MuseuRemote museu;
	
	private EmailUtil email = new EmailUtil();
	
	private List<UploadedFile> uploads = new ArrayList<UploadedFile>();
	
	private String assunto;
	
	private String mensagem;
	
	private List<String> anexos = new ArrayList<String>();
	
	private Page page;
	
	public AjudeOMuseu(){
		
	}
	
	@PostConstruct
	public void run(){
		try {
			this.page = museu.getPage(Integer.parseInt(museu.getConfiguracao().getAjudeOMuseu()));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public void enviarSugestao(){	
		try{
			email.setAssunto(assunto);
			email.setTexto(mensagem);
			email.setAnexos(uploads);
			email.sendMail();
			FacesUtil.addMessage("Mensagem Enviada com Sucesso:", null, Constants.INFO);
		}catch(Exception e){
			e.printStackTrace();
			FacesUtil.addMessage("Erro ao tentar enviar Mensagem:", null, Constants.ERROR);
			
		}
	}
	
	 public void handleFileUpload(FileUploadEvent event) {
		 uploads.add(event.getFile());
		 FacesUtil.addMessage("Status:", "Arquivo:"+event.getFile().getFileName()+
				 " Carregado em sua mensagem com sucesso!"
				 , Constants.INFO);
		 anexos.add(event.getFile().getFileName());
	 }
	 
	public List<UploadedFile> getUploads() {
		return uploads;
	}

	public void setUploads(List<UploadedFile> uploads) {
		this.uploads = uploads;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public List<String> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<String> anexos) {
		this.anexos = anexos;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}
