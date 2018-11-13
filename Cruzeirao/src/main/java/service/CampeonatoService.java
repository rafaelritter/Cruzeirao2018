package service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Campeonato;

public class CampeonatoService {
	
	private EntityManagerFactory emf;
	
	public CampeonatoService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Campeonato campeonato)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(campeonato);
		em.getTransaction().commit();
		em.close();
	}
	
	public void alterar(Campeonato campeonato) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(campeonato);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Campeonato campeonato) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		campeonato = em.find(Campeonato.class, campeonato.getCampeonatoId());
		em.remove(campeonato);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Campeonato> getCampeonatos()
	{
		List<Campeonato> campeonatos;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select c from Campeonato c");
		campeonatos = q.getResultList();
		em.close();
		
		return campeonatos;
	}
	
	

	public Campeonato getCampeonatoById(long id) {
		EntityManager em = emf.createEntityManager();
		Campeonato c = em.find(Campeonato.class, id);
		em.close();
		return c;
	}

}
