package service;

import java.util.List;
import dao.CampeonatoDAO;
import dao.UsuarioDAO;
import modelo.Campeonato;
import modelo.Usuario;

public class UsuarioService {
	
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
	
	public Usuario salvar(Usuario usuario)
	{
		usuario = usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
		return usuario;
	}
	
	public List<Usuario> getUsuarios()
	{
		List<Usuario> list = usuarioDAO.getAll(Usuario.class);
		usuarioDAO.closeEntityManager();
		return list;
	}
	
	public List<Campeonato> getCampeonato()
	{
		List<Campeonato> list = campeonatoDAO.getAll(Campeonato.class);
		campeonatoDAO.closeEntityManager();
		return list;
	}
	
	public Usuario getCampeonatosUsuario(Usuario u) {
		u = usuarioDAO.getById(Usuario.class, u.getIdUsuario());
		u.getCampeonatos().size();
		System.out.println(u.getCampeonatos());
		usuarioDAO.closeEntityManager();
		return u;
	}
	
	public Usuario getEquipesUsuario(Usuario u) {
		u = usuarioDAO.getById(Usuario.class,  u.getIdUsuario());
		u.getEquipes().size();
		System.out.println(u.getEquipes());
		usuarioDAO.closeEntityManager();
		return u;
	}

	public Usuario getUsuarioById(long id)
	{
		Usuario u;
		u = usuarioDAO.getById(Usuario.class, id);
		return u;
		
	}
	
	public void alterar(Usuario usuario) {
		usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
	}
	
	public void remover(Usuario usuario) {
		usuario = usuarioDAO.getById(Usuario.class, usuario.getIdUsuario());
		usuarioDAO.remove(usuario);
		usuarioDAO.closeEntityManager();
	}

}
