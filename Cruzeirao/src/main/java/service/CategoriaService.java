package service;

import java.util.List;

import dao.CategoriaDAO;
import modelo.Categoria;

public class CategoriaService {
	
	CategoriaDAO categoriaDAO = new CategoriaDAO();
	
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
}