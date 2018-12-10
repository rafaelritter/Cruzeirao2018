package menagedbean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Categoria;
import modelo.Fase;
import modelo.Inscricao;
import service.CategoriaService;
import service.FaseService;
import service.InscricaoService;

@ManagedBean
@SessionScoped
public class CategoriaMB {
	
	private CategoriaService categoriaService = new CategoriaService();
	private InscricaoService inscricaoService = new InscricaoService();
	private FaseService faseService = new FaseService();
	
	private Categoria categoriaNova = new Categoria();
	private Inscricao inscricaoNova = new Inscricao();
	private Fase faseNova = new Fase();
	
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
	
	public String mostrarInscricoes(Categoria categoria) {
		categoriaAtual = categoriaService.getInscricaoCategoria(categoria);
		return "Inscricao-Categoria";
	}
	
	public String mostrarFases(Categoria categoria) {
		categoriaAtual = categoriaService.getFaseCategoria(categoria);
		return "Fase-Categoria";
	}
	
	public void getInscricoes(Categoria categoria) {
		categoriaAtual = categoriaService.getInscricaoCategoria(categoria);
	}
	
	public void getFases(Categoria categoria) {
		categoriaAtual = categoriaService.getFaseCategoria(categoria);
	}
	
	public String criarInscricao() {
		inscricaoNova = new Inscricao();
		return "CadastroInscricao";
	}
	
	public String criarFase() {
		faseNova = new Fase();
		return "CadastroFase";
	}
	
	public String salvarInscricao() {
		categoriaAtual.inscricaoNova(inscricaoNova);
		inscricaoNova.setCategoria(categoriaAtual);
		inscricaoService.salvar(inscricaoNova);
		inscricaoNova = new Inscricao();
		return "Inscricao-Categoria";
	}
	
	public String salvarFase() {
		categoriaAtual.faseNova(faseNova);
		faseNova.setCategoria(categoriaAtual);
		faseService.salvar(faseNova);
		faseNova = new Fase();
		return "Fase-Categoria";
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

	public InscricaoService getInscricaoService() {
		return inscricaoService;
	}

	public void setInscricaoService(InscricaoService inscricaoService) {
		this.inscricaoService = inscricaoService;
	}

	public Inscricao getInscricaoNova() {
		return inscricaoNova;
	}

	public void setInscricaoNova(Inscricao inscricaoNova) {
		this.inscricaoNova = inscricaoNova;
	}

	public FaseService getFaseService() {
		return faseService;
	}

	public void setFaseService(FaseService faseService) {
		this.faseService = faseService;
	}

	public Fase getFaseNova() {
		return faseNova;
	}

	public void setFaseNova(Fase faseNova) {
		this.faseNova = faseNova;
	}
}