package museu.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Slide implements Serializable{
    
	private static final long serialVersionUID = 5216540536632062134L;

	@Id
	@SequenceGenerator(name = "SLIDE_ID", sequenceName = "SLIDE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SLIDE_ID")
    private String id;

    private String titulo;
    
    private String texto;
    
    private String link;    
    
    private Integer ordem;
    
    @Lob  
    @Column(columnDefinition = "BYTEA")
    private byte[] content;
    
    private String contentType;

    @ManyToOne
    @JoinColumn(name="CONFIGURACAO_ID")
    private Configuracao configuracao;

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
    
}
