package menagedbean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Categoria;
import service.CategoriaService;

@ManagedBean
@SessionScoped
public class CategoriaMB {
	
	private CategoriaService categoriaService = new CategoriaService();
	private Categoria categoriaNova = new Categoria();
	private Categoria categoriaAtual;
	private List<Categoria> categorias;
	
	public String salvar() {
		categoriaService.salvar(categoriaNova);
		categoriaNova = new Categoria();
		return "Menu";
	}
	
	public void remover(Categoria categoria) {
		categoriaService.remover(categoria);
		categorias.remove(categoria);
	}
	
	public List<Categoria> getCategorias() {
		if(categorias == null) 
		{
			categorias = categoriaService.getCategorias();
		}
		return categorias;
	}
	
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public CategoriaService getCategoriaService() {
		return categoriaService;
	}

	public void setCategoriaService(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	public Categoria getCategoriaNova() {
		return categoriaNova;
	}

	public void setCategoriaNova(Categoria categoriaNova) {
		this.categoriaNova = categoriaNova;
	}

	public Categoria getCategoriaAtual() {
		return categoriaAtual;
	}

	public void setCategoriaAtual(Categoria categoriaAtual) {
		this.categoriaAtual = categoriaAtual;
	}
}