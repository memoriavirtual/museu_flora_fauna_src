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
	
	private String ajudeOMuseu;
	
	private String acervo;
	
	private String flora;
	
	private String fauna;
	
	private String item1;
	
	private String item2;
	
	private String item3;
	
	private String item4;
	
	private String item5;
	
	private String item6;
	
	private String item7;
	
	private String item8;
	
	private String item9;
	
	private String item10;
	
	private String item11;
	
	private String item12;
	
	private String item13;
	
	private String item14;
	
	private String item15;
	
	private String item16;
	
	private String item17;
	
	private String item18;
	
	private String item19;
	
	private String item20;
	
	private String item21;
	
	private String item22;
	
	private String item23;
	
	private String item24;
	
	private String item25;
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

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public String getItem6() {
		return item6;
	}

	public void setItem6(String item6) {
		this.item6 = item6;
	}

	public String getItem7() {
		return item7;
	}

	public void setItem7(String item7) {
		this.item7 = item7;
	}

	public String getItem8() {
		return item8;
	}

	public void setItem8(String item8) {
		this.item8 = item8;
	}

	public String getItem9() {
		return item9;
	}

	public void setItem9(String item9) {
		this.item9 = item9;
	}

	public String getItem10() {
		return item10;
	}

	public void setItem10(String item10) {
		this.item10 = item10;
	}

	public String getItem11() {
		return item11;
	}

	public void setItem11(String item11) {
		this.item11 = item11;
	}

	public String getItem12() {
		return item12;
	}

	public void setItem12(String item12) {
		this.item12 = item12;
	}

	public String getItem13() {
		return item13;
	}

	public void setItem13(String item13) {
		this.item13 = item13;
	}

	public String getItem14() {
		return item14;
	}

	public void setItem14(String item14) {
		this.item14 = item14;
	}

	public String getItem15() {
		return item15;
	}

	public void setItem15(String item15) {
		this.item15 = item15;
	}

	public String getItem16() {
		return item16;
	}

	public void setItem16(String item16) {
		this.item16 = item16;
	}

	public String getItem17() {
		return item17;
	}

	public void setItem17(String item17) {
		this.item17 = item17;
	}

	public String getItem18() {
		return item18;
	}

	public void setItem18(String item18) {
		this.item18 = item18;
	}

	public String getItem19() {
		return item19;
	}

	public void setItem19(String item19) {
		this.item19 = item19;
	}

	public String getItem20() {
		return item20;
	}

	public void setItem20(String item20) {
		this.item20 = item20;
	}

	public String getItem21() {
		return item21;
	}

	public void setItem21(String item21) {
		this.item21 = item21;
	}

	public String getItem22() {
		return item22;
	}

	public void setItem22(String item22) {
		this.item22 = item22;
	}

	public String getItem23() {
		return item23;
	}

	public void setItem23(String item23) {
		this.item23 = item23;
	}

	public String getItem24() {
		return item24;
	}

	public void setItem24(String item24) {
		this.item24 = item24;
	}

	public String getItem25() {
		return item25;
	}

	public void setItem25(String item25) {
		this.item25 = item25;
	}

	public String getPadrao() {
		return Padrao;
	}

	public void setPadrao(String padrao) {
		Padrao = padrao;
	}

	public String getAjudeOMuseu() {
		return ajudeOMuseu;
	}

	public void setAjudeOMuseu(String ajudeOMuseu) {
		this.ajudeOMuseu = ajudeOMuseu;
	}

	public String getAcervo() {
		return acervo;
	}

	public void setAcervo(String acervo) {
		this.acervo = acervo;
	}

	public String getFlora() {
		return flora;
	}

	public void setFlora(String flora) {
		this.flora = flora;
	}

	public String getFauna() {
		return fauna;
	}

	public void setFauna(String fauna) {
		this.fauna = fauna;
	}	
}
