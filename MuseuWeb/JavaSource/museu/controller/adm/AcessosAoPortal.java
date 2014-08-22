package museu.controller.adm;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import museu.entidades.Acesso;
import museu.fachadas.remoto.BancoRemote;
import museu.util.Constants;
import museu.util.FacesUtil;

public class AcessosAoPortal implements Serializable {

	private static final long serialVersionUID = -579870784791720167L;

	private List<Acesso> acessos;

	private Integer paginaAtualAcesso = 0;

	private Integer tamanhoPaginaAcessos = 20;

	private boolean ultimaPagina = false;

	private String tipoDePaginacaoAcesso = "";

	private Date dataBusca;

	private Long totalAcessosBusca;

	@EJB
	private BancoRemote banco;

	public AcessosAoPortal() {

	}

	@PostConstruct
	public void init() {
		novaListagemAcessos();
	}

	public void novaListagemAcessos() {
		paginaAtualAcesso = 0;
		listarTodosAcessos();
	}

	public void novaPesquisaPorData() {
		paginaAtualAcesso = 0;
		pesquisarAcessoPorData();
	}

	public void listarTodosAcessos() {
		acessos = banco.getAcessos(paginaAtualAcesso, tamanhoPaginaAcessos);
		if (banco.getAcessos(paginaAtualAcesso + 1, tamanhoPaginaAcessos)
				.size() == 0)
			ultimaPagina = true;
		else
			ultimaPagina = false;

		tipoDePaginacaoAcesso = "lista";
		totalAcessosBusca = banco.getTotalAcessos();
	}

	public void pesquisarAcessoPorData() {
		if (dataBusca != null) {
			java.sql.Date dataEmSQL = new java.sql.Date(dataBusca.getTime());
			acessos = banco.pesquisarAcessos(dataEmSQL, paginaAtualAcesso,
					tamanhoPaginaAcessos);
			if (banco.pesquisarAcessos(dataEmSQL,paginaAtualAcesso + 1, tamanhoPaginaAcessos)
					.size() == 0)
				ultimaPagina = true;
			else
				ultimaPagina = false;

			tipoDePaginacaoAcesso = "data";
			totalAcessosBusca = banco.getTotalAcessosDia(dataEmSQL);
		} else {
			FacesUtil.addMessage("Campo Data em Branco", "", Constants.INFO);
		}
	}

	public void proximaPaginaAcesso() {
		paginaAtualAcesso++;
		if (banco.getAcessos(paginaAtualAcesso + 1, tamanhoPaginaAcessos)
				.size() == 0)
			ultimaPagina = true;

		if (tipoDePaginacaoAcesso.equals("data"))
			pesquisarAcessoPorData();
		else
			listarTodosAcessos();

		System.out.println("teste:" + ultimaPagina);
	}

	public void paginaAnteriorAcesso() {
		paginaAtualAcesso--;
		if (banco.getAcessos(paginaAtualAcesso + 1, tamanhoPaginaAcessos)
				.size() == 0)
			ultimaPagina = true;
		else
			ultimaPagina = false;

		if (tipoDePaginacaoAcesso.equals("data"))
			pesquisarAcessoPorData();
		else
			listarTodosAcessos();
	}

	public List<Acesso> getAcessos() {
		return acessos;
	}

	public void setAcessos(List<Acesso> acessos) {
		this.acessos = acessos;
	}

	public Integer getPaginaAtualAcesso() {
		return paginaAtualAcesso;
	}

	public void setPaginaAtualAcesso(Integer paginaAtualAcesso) {
		this.paginaAtualAcesso = paginaAtualAcesso;
	}

	public Integer getTamanhoPaginaAcessos() {
		return tamanhoPaginaAcessos;
	}

	public void setTamanhoPaginaAcessos(Integer tamanhoPaginaAcessos) {
		this.tamanhoPaginaAcessos = tamanhoPaginaAcessos;
	}

	public boolean isUltimaPagina() {
		return ultimaPagina;
	}

	public void setUltimaPagina(boolean ultimaPagina) {
		this.ultimaPagina = ultimaPagina;
	}

	public String getTipoDePaginacaoAcesso() {
		return tipoDePaginacaoAcesso;
	}

	public void setTipoDePaginacaoAcesso(String tipoDePaginacaoAcesso) {
		this.tipoDePaginacaoAcesso = tipoDePaginacaoAcesso;
	}

	public Date getDataBusca() {
		return dataBusca;
	}

	public void setDataBusca(Date dataBusca) {
		this.dataBusca = dataBusca;
	}

	public Long getTotalAcessosBusca() {
		return totalAcessosBusca;
	}

	public void setTotalAcessosBusca(Long totalAcessosBusca) {
		this.totalAcessosBusca = totalAcessosBusca;
	}
}
