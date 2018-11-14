package service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Equipe;

public class EquipeService {
	
	private EntityManagerFactory emf;
	
	public EquipeService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Equipe equipe) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(equipe);
		em.getTransaction().commit();
		em.close();
	}
	
	public void alterar(Equipe equipe) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(equipe);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Equipe equipe) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		equipe = em.find(Equipe.class, equipe.getIdEquipe());
		em.remove(equipe);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Equipe> getEquipes(){
		List<Equipe> equipes;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select e from Equipe e");
		equipes = q.getResultList();
		em.close();
		
		return equipes;
	}
	
	public Equipe getEquipeById(long id) {
		EntityManager em = emf.createEntityManager();
		Equipe e = em.find(Equipe.class, id);
		em.close();
		return e;
	}

}
