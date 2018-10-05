package auxiliar;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Equipe;

public class EquipeAux {
	
	/*private ArrayList<Equipe> equipes = Informacoes.Equipes;

	public void salvar(Equipe equipe) {
		equipes.add(equipe);
	}
	
	public List<Equipe> getEquipes() {
		return equipes;
	}*/
	
	private EntityManagerFactory emf;
	
	public EquipeAux() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Equipe equipe) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(equipe);
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
	
}
