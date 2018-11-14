package menagedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import modelo.Campeonato;
import service.CampeonatoService;

@ManagedBean
@SessionScoped
public class CampeonatoMB {

	private CampeonatoService campeonatoService = new CampeonatoService();
	private Campeonato campeonatoNovo = new Campeonato();
	private Campeonato campeonatoAtual;
	private List<Campeonato> campeonatos;
	
	public String salvar() {
		campeonatoService.salvar(campeonatoNovo);
		campeonatoNovo = new Campeonato();
		return "Menu";
	}
	
	public void remover(Campeonato campeonato) {
		campeonatoService.remover(campeonato);
		campeonatos.remove(campeonato);
	}
	
	public List <Campeonato> getCampeonatos() {
		if(campeonatos == null)
		{
			campeonatos = campeonatoService.getCampeonatos();
		}
		
		return campeonatos;
	}
	
	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public CampeonatoService getCampeonatoService() {
		return campeonatoService;
	}

	public void setCampeonatoService(CampeonatoService campeonatoService) {
		this.campeonatoService = campeonatoService;
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
}