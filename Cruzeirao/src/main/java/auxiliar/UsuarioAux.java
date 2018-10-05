package auxiliar;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Usuario;

public class UsuarioAux {
	
	private EntityManagerFactory emf;
	
	public UsuarioAux() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Usuario usuario)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
		em.persist(usuario);
		em.getTransaction().commit();	
	    em.close();
	}
	
	public void excluir(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		usuario = em.find(Usuario.class, usuario.getCpf());
		em.remove(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	public void alterar(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios() 
	{
		List <Usuario>usuario;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Usuario a");
		usuario = q.getResultList();
		em.close();
		
		return usuario;
	}
	
	public Usuario teste(String cpf) {
		
		EntityManager em = emf.createEntityManager();
		Usuario user = em.find(Usuario.class,cpf);
		em.close();
		return user;
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarioCPF(String cpf) {
		List<Usuario> usuarios;
		
		EntityManager em = emf.createEntityManager();
		usuarios = em.createNamedQuery("Usuario.findCPF").getResultList();
		em.setProperty("CPF", cpf);
		em.close();
		
		return usuarios;
	}
}
