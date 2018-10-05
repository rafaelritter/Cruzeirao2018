package auxiliar;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import modelo.Campeonato;

public class CampeonatoAux {
	
	/*private ArrayList<Campeonato> campeonatos = Informacoes.Campeonatos;
	
	public Campeonato getNomeCampeonato(String nome) {
		
		for(int i=0; i< campeonatos.size(); i++)
		{
			if(nome == campeonatos.get(i).getNome())
			{
				return campeonatos.get(i);
			}
		}
		return null;
	}
	
	public void salvar(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}
	
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}*/
	
	private EntityManagerFactory emf;
	
	public void salvar(Campeonato campeonato)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(campeonato);
		em.getTransaction();
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
	
	@SuppressWarnings("unchecked")
	public List<Campeonato> getNomeCampeonato(String nome) {
		List<Campeonato> campeonatos;
		
		EntityManager em = emf.createEntityManager();
		campeonatos = em.createNamedQuery("Campeonato.findNome").getResultList();
		em.setProperty("nome", nome);
		em.close();
		
		return campeonatos;
	}
}
