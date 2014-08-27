package museu.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Configuracao implements Serializable{

	private static final long serialVersionUID = -7841188389992445757L;

	public Configuracao(){
		
	}
		
	@Id
	private String id;
	
    private String contentTypeLogo;
    
    @Lob  
    @Column(columnDefinition = "BYTEA")
    private byte[] logo;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@OrderBy("ordem ASC")
	@JoinColumn(name="CONFIGURACAO_ID")
	private List<Slide> slides = new ArrayList<Slide>();
	
	private String urlPortal;
	
	private String emailPortal;
	
	/*Configuracoes dos WebServices*/
	private String urlMemoria;
	
	private String nomeInstituicaoMemoria;
	
	private String urlWordpress;
	
	private String urlFreeGeoIP;
	
	private String memoriaVirtualLogin;
	
	private String memoriaVirtualSenha;
	/*FIM Configuracoes WebServices*/
	
	/*Redes Sociais*/
	private String facebook;
	
	private String twitter;
	
	private String flickr;
	
	private String youtube;
	/*FIM Redes Sociais*/
	
	/*Institucional*/
	private String nomeInstituicao;
	
	private String urlInstituicao;
	/*FIM Institucional*/
	
	/*Tags dos Posts do Wordpress*/
	
	private String tagVoceSabia;
	
	private String tagNews;
	
	private String tagEvents;
	/*FIM Tags dos Posts do Wordpress*/
	
	/*Ids das Paginas que Estão no Wordpress*/
	private String Padrao;
	
	private String BemVindo;
	
	private String Mais;
	
	private String Historia;
	
	private String Institucional;
	
	private String PalestrasEEventos;
	
	private String Academicos;
	
	private String ExtraAcademicos;
	
	private String VisiteOMuseu;
	
	private String MissaoEObjetivos;
	
	private String Fundacao;
	
	private String Horarios;
	
	private String OutrosMuseus;
	
	private String Links;
	
	private String AjudeOMuseu;
	
	private String Acervo;
	
	private String AcervoFauna;
	
	private String AcervoFlora;
	
	private String OMuseu;
	
	private String Midia;
	
	private String Localizacao;
	/*FIM Ids das Paginas que Estão no Wordpress*/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Slide> getSlides() {
		return slides;
	}

	public void setSlides(List<Slide> slides) {
		this.slides = slides;
	}

	public String getUrlPortal() {
		return urlPortal;
	}

	public void setUrlPortal(String urlPortal) {
		this.urlPortal = urlPortal;
	}

	public String getEmailPortal() {
		return emailPortal;
	}

	public void setEmailPortal(String emailPortal) {
		this.emailPortal = emailPortal;
	}

	public String getUrlMemoria() {
		return urlMemoria;
	}

	public void setUrlMemoria(String urlMemoria) {
		this.urlMemoria = urlMemoria;
	}

	public String getUrlWordpress() {
		return urlWordpress;
	}

	public void setUrlWordpress(String urlWordpress) {
		this.urlWordpress = urlWordpress;
	}

	public String getTagVoceSabia() {
		return tagVoceSabia;
	}

	public void setTagVoceSabia(String tagVoceSabia) {
		this.tagVoceSabia = tagVoceSabia;
	}

	public String getTagNews() {
		return tagNews;
	}

	public void setTagNews(String tagNews) {
		this.tagNews = tagNews;
	}

	public String getTagEvents() {
		return tagEvents;
	}

	public void setTagEvents(String tagEvents) {
		this.tagEvents = tagEvents;
	}

	public String getMais() {
		return Mais;
	}

	public void setMais(String mais) {
		Mais = mais;
	}

	public String getHistoria() {
		return Historia;
	}

	public void setHistoria(String historia) {
		Historia = historia;
	}

	public String getInstitucional() {
		return Institucional;
	}

	public void setInstitucional(String institucional) {
		Institucional = institucional;
	}

	public String getPalestrasEEventos() {
		return PalestrasEEventos;
	}

	public void setPalestrasEEventos(String palestrasEEventos) {
		PalestrasEEventos = palestrasEEventos;
	}

	public String getAcademicos() {
		return Academicos;
	}

	public void setAcademicos(String academicos) {
		Academicos = academicos;
	}

	public String getExtraAcademicos() {
		return ExtraAcademicos;
	}

	public void setExtraAcademicos(String extraAcademicos) {
		ExtraAcademicos = extraAcademicos;
	}

	public String getVisiteOMuseu() {
		return VisiteOMuseu;
	}

	public void setVisiteOMuseu(String visiteOMuseu) {
		VisiteOMuseu = visiteOMuseu;
	}

	public String getMissaoEObjetivos() {
		return MissaoEObjetivos;
	}

	public void setMissaoEObjetivos(String missaoEObjetivos) {
		MissaoEObjetivos = missaoEObjetivos;
	}

	public String getFundacao() {
		return Fundacao;
	}

	public void setFundacao(String fundacao) {
		Fundacao = fundacao;
	}

	public String getHorarios() {
		return Horarios;
	}

	public void setHorarios(String horarios) {
		Horarios = horarios;
	}

	public String getOutrosMuseus() {
		return OutrosMuseus;
	}

	public void setOutrosMuseus(String outrosMuseus) {
		OutrosMuseus = outrosMuseus;
	}

	public String getLinks() {
		return Links;
	}

	public void setLinks(String links) {
		Links = links;
	}

	public String getAjudeOMuseu() {
		return AjudeOMuseu;
	}

	public void setAjudeOMuseu(String ajudeOMuseu) {
		AjudeOMuseu = ajudeOMuseu;
	}

	public String getPadrao() {
		return Padrao;
	}

	public void setPadrao(String padrao) {
		Padrao = padrao;
	}

	public String getContentTypeLogo() {
		return contentTypeLogo;
	}

	public void setContentTypeLogo(String contentTypeLogo) {
		this.contentTypeLogo = contentTypeLogo;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getAcervo() {
		return Acervo;
	}

	public void setAcervo(String acervo) {
		Acervo = acervo;
	}

	public String getAcervoFauna() {
		return AcervoFauna;
	}

	public void setAcervoFauna(String acervoFauna) {
		AcervoFauna = acervoFauna;
	}

	public String getAcervoFlora() {
		return AcervoFlora;
	}

	public void setAcervoFlora(String acervoFlora) {
		AcervoFlora = acervoFlora;
	}

	public String getOMuseu() {
		return OMuseu;
	}

	public void setOMuseu(String oMuseu) {
		OMuseu = oMuseu;
	}

	public String getMidia() {
		return Midia;
	}

	public void setMidia(String midia) {
		Midia = midia;
	}

	public String getLocalizacao() {
		return Localizacao;
	}

	public void setLocalizacao(String localizacao) {
		Localizacao = localizacao;
	}

	public String getNomeInstituicaoMemoria() {
		return nomeInstituicaoMemoria;
	}

	public void setNomeInstituicaoMemoria(String nomeInstituicaoMemoria) {
		this.nomeInstituicaoMemoria = nomeInstituicaoMemoria;
	}

	public String getUrlFreeGeoIP() {
		return urlFreeGeoIP;
	}

	public void setUrlFreeGeoIP(String urlFreeGeoIP) {
		this.urlFreeGeoIP = urlFreeGeoIP;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getFlickr() {
		return flickr;
	}

	public void setFlickr(String flickr) {
		this.flickr = flickr;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getUrlInstituicao() {
		return urlInstituicao;
	}

	public void setUrlInstituicao(String urlInstituicao) {
		this.urlInstituicao = urlInstituicao;
	}

	public String getMemoriaVirtualLogin() {
		return memoriaVirtualLogin;
	}

	public void setMemoriaVirtualLogin(String memoriaVirtualLogin) {
		this.memoriaVirtualLogin = memoriaVirtualLogin;
	}

	public String getMemoriaVirtualSenha() {
		return memoriaVirtualSenha;
	}

	public void setMemoriaVirtualSenha(String memoriaVirtualSenha) {
		this.memoriaVirtualSenha = memoriaVirtualSenha;
	}

	public String getBemVindo() {
		return BemVindo;
	}

	public void setBemVindo(String bemVindo) {
		BemVindo = bemVindo;
	}
	
	
}
