package menagedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import modelo.Campeonato;
import modelo.Categoria;
import modelo.Usuario;
import auxiliar.CampeonatoAux;

@ManagedBean
@SessionScoped
public class CampeonatoMB {

	private CampeonatoAux campeonatoAux = new CampeonatoAux();
	private Campeonato campeonatoNovo = new Campeonato();
	private Campeonato campeonatoAtual;
	private Categoria categoriaNova;
	
	public CampeonatoAux getCampeonatoAux() {
		return campeonatoAux;
	}

	public void setCampeonatoAux(CampeonatoAux campeonatoAux) {
		this.campeonatoAux = campeonatoAux;
	}

	public Campeonato getCampeonatoNovo() {
		return campeonatoNovo;
	}

	public void setCampeonatoNovo(Campeonato campeonatoNovo) {
		this.campeonatoNovo = campeonatoNovo;
	}

	public Campeonato getCampeonatoAtual() {
		return campeonatoAtual;
	}

	public void setCampeonatoAtual(Campeonato campeonatoAtual) {
		this.campeonatoAtual = campeonatoAtual;
	}

	public Categoria getCategoriaNova() {
		return categoriaNova;
	}

	public void setCategoriaNova(Categoria categoriaNova) {
		this.categoriaNova = categoriaNova;
	}

	public List <Campeonato> getCampeonatos() {
		return campeonatoAux.getAll(Campeonato.class);
	}
	
	public String mostrarCategorias(Campeonato campeonato) {
		campeonatoAtual = (Campeonato)campeonatoAux.getById(Campeonato.class,campeonatoAtual.getNome());
		return "Categoria-Campeonato";
	}
	
	public String mostrarNomeCategorias(String nome) {
		campeonatoAtual = (Campeonato)campeonatoAux.getById(Campeonato.class,campeonatoAtual.getNome());
		return "Categoria-Campeonato";
	}
	
	public String criarCategorias() {
		categoriaNova = new Categoria();
		return "CadastroCategoria";
	}
	
	public String salvarCategoria() {
		campeonatoAtual.addCategorias(categoriaNova);
		categoriaNova.setCampeonato(campeonatoAtual);
		return "Categoria-Campeonato";
	}
	
	public String salvar() {
		campeonatoAux.save(campeonatoNovo);
		campeonatoNovo = new Campeonato();
		return "Menu";
	}
}
