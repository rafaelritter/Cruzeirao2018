package auxiliar;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Usuario;

public class UsuarioAux {
	
	private EntityManagerFactory emf;
	private ArrayList <Usuario> usuarios = Informacoes.Usuarios;
	
	public UsuarioAux() {
		emf = Persistence.createEntityManagerFactory("ProjetoMavenJSFPrimeFaces");
	}
	
	public Usuario getUsuarioCPF(String cpfusuario) {
		
		for(int i=0; i< usuarios.size(); i++)
		{
			if(cpfusuario == usuarios.get(i).getCpf())
			{
				return usuarios.get(i);
			}
		}
		return null;
	}
	
	public void salvar(Usuario usuario)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
		em.persist(usuario);
		em.getTransaction().commit();	
	    em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios() 
	{
		List <Usuario>usuario;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Aluno a");
		usuario = q.getResultList();
		em.close();
		
		return usuario;
	}
}
