package service;

import java.util.List;
import dao.CampeonatoDAO;
import dao.CategoriaDAO;
import modelo.Campeonato;
import modelo.Categoria;

public class CampeonatoService {
	
	CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
	CategoriaDAO categoriaDAO = new CategoriaDAO();
	
	public Campeonato salvar(Campeonato campeonato) {
		campeonato = campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();
		return campeonato;
	}
	
	public void alterar(Campeonato campeonato) {
		campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();
	}
	
	public void remover(Campeonato campeonato) {
		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getIdCampeonato());
		campeonatoDAO.remove(campeonato);
		campeonatoDAO.closeEntityManager();
	}
	
	public List<Campeonato> getCampeonatos() {
		List<Campeonato> list = campeonatoDAO.getAll(Campeonato.class);
		campeonatoDAO.closeEntityManager();
		return list;
	}
	
	public Campeonato getCampeonatoById(long id) {
		Campeonato c;
		c = campeonatoDAO.getById(Campeonato.class, id);
		return c;
	}
	
	public List<Categoria> getCategorias() {
		List<Categoria> list = categoriaDAO.getAll(Categoria.class);
		categoriaDAO.closeEntityManager();
		return list;
	}
	
	public Campeonato getCategoriaCampeonato(Campeonato c) {
		c = campeonatoDAO.getById(Campeonato.class, c.getIdCampeonato());
		c.getCategorias().size();
		System.out.println(c.getCategorias());
		campeonatoDAO.closeEntityManager();
		return c;
	}
}