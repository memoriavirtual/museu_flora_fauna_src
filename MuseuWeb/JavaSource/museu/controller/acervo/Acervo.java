package museu.controller.acervo;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.controller.Mapa;
import museu.fachadas.remoto.MuseuRemote;
import museu.util.Constants;
import museu.util.FacesUtil;

import org.ol4jsf.component.api.FeatureVector;
import org.ol4jsf.util.WKTFeaturesCollection;

import br.usp.memoriavirtual.servicos.soap.BemPatrimonial;

import com.bkahlert.devel.wpws.model.Page;

public class Acervo implements Serializable,Mapa {

	private static final int tamanhoPaginaDefaultAcervo = 4;
	
	private static final long serialVersionUID = -3685611350450753145L;

	private String stringBusca = "";
	
	private List<BemPatrimonial> resultados = null;

	private int pagina = 1;
	
	private boolean ultimaPagina;
	
	private Page page; //relacionado a pagina no Wordpress, de apresentação do acervo

	@EJB
	private MuseuRemote museu;
	
	@PostConstruct
	public void run() {
		System.out.println("Carregando Acervo");
		if(FacesUtil.getRequestParameter("chave") != null){
			stringBusca = FacesUtil.getRequestParameter("chave");
		}
		try {
			page = museu.getPage(Integer.parseInt(museu.getConfiguracao().getAcervo()));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		buscar(stringBusca);
		System.out.println("Acervo Carregado");
	}
	
	public String getWkts() {
		WKTFeaturesCollection features = new WKTFeaturesCollection();

		Map<String, String> a = new HashMap<String, String>();
		a.put("string", "local_3");
		features.addFeature(new FeatureVector(
				"POLYGON((-47.89503451786122 -22.00629303877323,-47.89509889087757 -22.00638753678161,-47.89501842460758 -22.00645716685292,-47.89509889087757 -22.006591453321466,-47.89437469444407 -22.006954523508266,-47.894369330025896 -22.007063941738064,-47.89402600727142 -22.007068915292116,-47.89399918518143 -22.0070241533011,-47.89500233135304 -22.00629801235433,-47.89503451786122 -22.00629303877323))",
				a));

		Map<String, String> b = new HashMap<String, String>();
		b.put("string", "local_8");
		features.addFeature(new FeatureVector(
				"POLYGON((-47.895080115414395 -22.00640680939401, -47.8951552172662 -22.006362047193093, -47.89525714120891 -22.00650130732654, -47.895541455365205 -22.0067748536172, -47.89554681978249 -22.00717273818993, -47.89555218420067 -22.007381627143417, -47.89548244676613 -22.007376653600346, -47.8954663535125 -22.0071876588401, -47.89525177679163 -22.00719263238897, -47.89519276819255 -22.007277182705565, -47.89503720006986 -22.007262262064824, -47.89503720006986 -22.006953901813002, -47.895096208668036 -22.006934007580476, -47.8951283951762 -22.006590831625456, -47.89502647123349 -22.00645157157994, -47.895080115414395 -22.00640680939401))",
				b));

		Map<String, String> c = new HashMap<String, String>();
		c.put("string", "local_1");
		features.addFeature(new FeatureVector(
				"POLYGON((-47.894473936177235 -22.007660145269547, -47.894473936177235 -22.00771485412268, -47.89443638525088 -22.007749668836627, -47.89443638525088 -22.007869033504818, -47.893588807201965 -22.007869033504818, -47.893588807201965 -22.007675065867556, -47.89367463789013 -22.007620356999066, -47.89370682439831 -22.00766511880267, -47.89383557043101 -22.00768998646486, -47.89383020601284 -22.007535806887972, -47.8938623925219 -22.007535806887972, -47.893857028103724 -22.007660145269547, -47.894473936177235 -22.007660145269547))",
				c));

		Map<String, String> d = new HashMap<String, String>();
		d.put("string", "local_6");
		features.addFeature(new FeatureVector(
				"POLYGON((-47.8944846650127 -22.007650198202768, -47.89516058168437 -22.007650198202768, -47.89530542097162 -22.00780935118329, -47.895294692135266 -22.007844165874033, -47.895246412373446 -22.00789887465614, -47.89444711408634 -22.00788892760613, -47.8944846650127 -22.007650198202768))",
				d));

		Map<String, String> e = new HashMap<String, String>();
		e.put("string", "local_7");
		features.addFeature(new FeatureVector(
				"POLYGON((-47.89554681978249 -22.007376653600346, -47.895536090947026 -22.007908821705477, -47.895273234463446 -22.007903848180902, -47.89533224306162 -22.007784483542025, -47.89517667493891 -22.007630304067945, -47.895144488430745 -22.00747115088641, -47.89464559755358 -22.007481097965748, -47.89473679265992 -22.007217500134864, -47.89498355588986 -22.007217500134864, -47.89503720006986 -22.007277182705565, -47.89521422586527 -22.007277182705565, -47.89526250562709 -22.007197605938494, -47.8954395314225 -22.007197605938494, -47.895477082348854 -22.00739157422904, -47.89554681978249 -22.007376653600346))",
				e));

		Map<String, String> f = new HashMap<String, String>();
		f.put("string", "local_2");
		features.addFeature(new FeatureVector(
				"POLYGON((-47.89394285879189 -22.007073267151245, -47.893524434185615 -22.00743136256289, -47.893588807201965 -22.00766511880267, -47.893680002308315 -22.007605436395284, -47.89370682439831 -22.007446283185832, -47.89384093484919 -22.007436336104043, -47.89384093484919 -22.007510939198745, -47.89442029199635 -22.007540780425472, -47.89441492757816 -22.007491045043558, -47.89427545271001 -22.007481097965748, -47.89427545271001 -22.007376653600346, -47.89437201223453 -22.007376653600346, -47.89437201223453 -22.007351785883195, -47.89412524900458 -22.00734681233908, -47.89412524900458 -22.007267235611916, -47.89395358762825 -22.00725231497013, -47.89395895204643 -22.007083214258497, -47.89394285879189 -22.007073267151245))",
				f));

		Map<String, String> g = new HashMap<String, String>();
		g.put("string", "local_5");
		features.addFeature(new FeatureVector(
				"POLYGON((-47.89451685152087 -22.00709813491808, -47.89464023313539 -22.00709316136506, -47.89465096197175 -22.007257288517565, -47.894715334988106 -22.00725231497013, -47.89461877546358 -22.007530833350323, -47.894602682209936 -22.007371680057098, -47.8944310208327 -22.007376653600346, -47.8944310208327 -22.00734681233908, -47.8945114871027 -22.007341838794787, -47.8945114871027 -22.007292103343904, -47.89459195337358 -22.007292103343904, -47.89459195337358 -22.0071876588401, -47.894527580357234 -22.00717273818993, -47.89451685152087 -22.00709813491808))",
				g));

		Map<String, String> h = new HashMap<String, String>();
		h.put("string", "local_4");
		features.addFeature(new FeatureVector(
				"POLYGON((-47.89509084424985 -22.006610725906135, -47.89509084424985 -22.00680469499887, -47.894854809857165 -22.00680469499887, -47.89483335218445 -22.00719263238897, -47.89466169080811 -22.00719263238897, -47.89464559755358 -22.007068293598174, -47.89438274106999 -22.007078240704942, -47.89438274106999 -22.0069588753709, -47.89509084424985 -22.006610725906135))",
				h));

		return features.toMap();
	}

	public void selecionarAreaMapa() {
		String local = FacesUtil.getRequestParameter("param1");
		stringBusca = local;
		buscar(local);
	}
	
	public void listarUltimos(){
		pagina = 1;
		stringBusca = "";
		buscar(stringBusca);
	}
	
	public void novaBusca(String novaChave){
		pagina = 1;
		stringBusca = novaChave;
		buscar(stringBusca);
	}
	
	public void buscar(String chave) {
		try {
			resultados = museu.getBens(chave,pagina,tamanhoPaginaDefaultAcervo);
			if(museu.getBens(chave, pagina+1,tamanhoPaginaDefaultAcervo)==null)
				ultimaPagina = true;
			else
				ultimaPagina = false;			
		} catch (Exception e) {
			FacesUtil
					.addMessage(
							"Erro ao comunicador com servidor de dados: Memória Virtual",
							"Erro ao comunicador com servidor de dados: Memória Virtual",
							Constants.ERROR);
			e.printStackTrace();
		}
	}

	public void proxPagina(){
		pagina++;
		buscar(stringBusca);
		
	}
	
	public void pagAnterior(){
		pagina--;
		buscar(stringBusca);	
	}
	
	public List<BemPatrimonial> getResultados() {
		return resultados;
	}

	public void setResultados(List<BemPatrimonial> resultados) {
		this.resultados = resultados;
	}

	public String getStringBusca() {
		return stringBusca;
	}

	public void setStringBusca(String stringBusca) {
		this.stringBusca = stringBusca;
	}

	public Page getPage() {
		return page;
	}

	public MuseuRemote getMuseu() {
		return museu;
	}

	public void setMuseu(MuseuRemote museu) {
		this.museu = museu;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public boolean isUltimaPagina() {
		return ultimaPagina;
	}

	public void setUltimaPagina(boolean ultimaPagina) {
		this.ultimaPagina = ultimaPagina;
	}

	@Override
	public void confirmarSelecaoMapa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelarSelecaoMapa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNomeLocal(String local) {
		// TODO Auto-generated method stub
		return null;
	}

}
