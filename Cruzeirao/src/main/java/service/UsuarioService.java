package service;

import java.util.List;
import dao.CampeonatoDAO;
import dao.EquipeDAO;
import dao.UsuarioDAO;
import modelo.Campeonato;
import modelo.Equipe;
import modelo.Usuario;

public class UsuarioService {
	
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
	EquipeDAO equipeDAO = new EquipeDAO();
	
	public Usuario salvar(Usuario usuario) {
		usuario = usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
		return usuario;
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
	
	public List<Usuario> getUsuarios() {
		List<Usuario> list = usuarioDAO.getAll(Usuario.class);
		usuarioDAO.closeEntityManager();
		return list;
	}
	
	public Usuario getUsuarioById(long id) {
		Usuario u;
		u = usuarioDAO.getById(Usuario.class, id);
		return u;
	}
	
	public List<Campeonato> getCampeonatos() {
		List<Campeonato> list = campeonatoDAO.getAll(Campeonato.class);
		campeonatoDAO.closeEntityManager();
		return list;
	}
	
	public List<Equipe> getEquipes() {
		List<Equipe> list = equipeDAO.getAll(Equipe.class);
		equipeDAO.closeEntityManager();
		return list;
	}
	
	public Usuario getCampeonatosUsuario(Usuario u) {
		u = usuarioDAO.getById(Usuario.class, u.getIdUsuario());
		u.getCampeonatos().size();
		usuarioDAO.closeEntityManager();
		return u;
	}
	
	public Usuario getEquipesUsuario(Usuario u) {
		u = usuarioDAO.getById(Usuario.class,  u.getIdUsuario());
		u.getEquipes().size();
		usuarioDAO.closeEntityManager();
		return u;
	}
}