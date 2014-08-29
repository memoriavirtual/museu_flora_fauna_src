package museu.fachadas;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import museu.entidades.Acesso;
import museu.entidades.Configuracao;
import museu.entidades.Slide;
import museu.entidades.Usuario;
import museu.fachadas.remoto.BancoRemote;

@Stateless
public class Banco implements BancoRemote,Serializable{
	
	private static final long serialVersionUID = 4297257314181091525L;
	
	@PersistenceContext(unitName="museu")
	private EntityManager em;
	
	@Override
	public Usuario getUsuario(String email) {
		Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.email=:email");
		q.setParameter("email", email);
		Usuario u = null;
		if (q.getResultList().size() > 0)
			u = (Usuario) q.getSingleResult();

		return u;
	}

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> getUsuarios() {
		Query q = em.createQuery("SELECT u FROM Usuario u");
		return q.getResultList();
	}
	
	@Override
	public void salvaUsuario(Usuario usuario) {
		em.persist(usuario);
	};
	
	@Override
	public void salvarConfiguracoes(Configuracao configuracao) {
		em.merge(configuracao);
	}

	@Override
	public Configuracao getConfiguracao() {
		Query q = em.createQuery("SELECT c FROM Configuracao c WHERE c.id=:id");
		q.setParameter("id", "Padrao");
        Configuracao c = null;
        if (q.getResultList().size() > 0)
                c = (Configuracao) q.getSingleResult();
        else{
        	c = new Configuracao();
        	c.setId("Padrao");
        	em.persist(c);
        }
        em.refresh(c);
        return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Slide> getSlides() {
		Query q = em.createQuery("SELECT s FROM Slide s ORDER BY s.ordem DESC");
		return q.getResultList();
	}

	@Override
	public Slide getSlide(String id) {
		Query q = em.createQuery("SELECT s FROM Slide s WHERE s.id=:id");
		q.setParameter("id", id);
        Slide s = null;
        if (q.getResultList().size() > 0)
                s = (Slide) q.getSingleResult();

        return s;
	}
	
	@Override
	public void persistirSlide(Slide s) {
		em.persist(s);
		em.flush();
	}
	
	@Override
	public void updateSlide(Slide s) {
		em.merge(s);
		em.flush();
	}

	@Override
	public void removerSlide(String id) {
		Slide slide = em.find(Slide.class,id);
		em.remove(slide);
	}

	@Override
	public void persistirAcesso(Acesso a) {
		em.persist(a);
	}
	
	@Override
	public Slide getSlideByOrdem(Integer ordem){
		Query q = em.createQuery("Select s from Slide s where s.ordem =:ordem");
		q.setParameter("ordem", ordem);
		return (Slide) q.getResultList().get(0);
	}
	
	@Override
	public Integer getMaiorOrdemDeSlide() {
		Query q = em.createQuery("Select s from Slide s order by a.ordem DESC");
		Slide s = (Slide) q.getResultList().get(0);
		return s.getOrdem();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Acesso> getAcessos(int pagina,int tamanho) {
		Query q = em.createQuery("SELECT a FROM Acesso a");
		q.setFirstResult(pagina*tamanho);
		q.setMaxResults(tamanho);
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Acesso> pesquisarAcessos(Date date, int pagina,int tamanho) {
		Query q = em.createQuery("SELECT a FROM Acesso a where a.AcessDate=:date");
		q.setParameter("date", date);
		q.setFirstResult(pagina*tamanho);
		q.setMaxResults(tamanho);
		return q.getResultList();
	}

	@Override
	public Long getTotalAcessos() {
		Query q = em.createQuery("SELECT count(a.id) FROM Acesso a");
		return (Long) q.getSingleResult();
	}

	@Override
	public Long getTotalAcessosDia(Date date) {
		Query q = em.createQuery("SELECT count(a.id) FROM Acesso a where a.AcessDate=:date");
		q.setParameter("date", date);
		return (Long) q.getSingleResult();
	}
}
