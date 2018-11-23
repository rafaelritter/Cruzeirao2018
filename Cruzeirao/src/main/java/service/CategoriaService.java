package service;

import java.util.List;

import dao.CategoriaDAO;
import dao.FaseDAO;
import dao.InscricaoDAO;
import modelo.Categoria;
import modelo.Fase;
import modelo.Inscricao;

public class CategoriaService {
	
	CategoriaDAO categoriaDAO = new CategoriaDAO();
	InscricaoDAO inscricaoDAO = new InscricaoDAO();
	FaseDAO faseDAO = new FaseDAO();
	
	public Categoria salvar(Categoria categoria) {
		categoria = categoriaDAO.save(categoria);
		categoriaDAO.closeEntityManager();
		return categoria;
	}
	
	public void alterar (Categoria categoria) {
		categoriaDAO.save(categoria);
		categoriaDAO.closeEntityManager();
	}
	
	public void remover (Categoria categoria) {
		categoria = categoriaDAO.getById(Categoria.class, categoria.getIdCategoria());
		categoriaDAO.remove(categoria);
		categoriaDAO.closeEntityManager();
	}
	
	public List<Categoria> getCategorias() {
		List<Categoria> list = categoriaDAO.getAll(Categoria.class);
		categoriaDAO.closeEntityManager();
		return list;
	}
	
	public Categoria getCategoriaById(long Id) {
		Categoria ca;
		ca = categoriaDAO.getById(Categoria.class, Id);
		return ca;
	}
	
	public List<Inscricao> getInscricoes() {
		List<Inscricao> list = inscricaoDAO.getAll(Inscricao.class);
		inscricaoDAO.closeEntityManager();
		return list;
	}
	
	public List<Fase> getFases() {
		List<Fase> list = faseDAO.getAll(Fase.class);
		faseDAO.closeEntityManager();
		return list;
	}
	
	public Categoria getInscricaoCategoria(Categoria c) {
		c = categoriaDAO.getById(Categoria.class, c.getIdCategoria());
		c.getInscricoes().size();
		System.out.println(c.getInscricoes());
		categoriaDAO.closeEntityManager();
		return c;
	}
	
	public Categoria getFaseCategoria(Categoria c) {
		c = categoriaDAO.getById(Categoria.class, c.getIdCategoria());
		c.getFases().size();
		System.out.println(c.getFases());
		categoriaDAO.closeEntityManager();
		return c;
	}
}