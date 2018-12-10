package menagedbean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Partida;
import service.PartidaService;

@ManagedBean
@SessionScoped
public class PartidaMB {
	
	private PartidaService partidaService = new PartidaService();
	private Partida partidaNova = new Partida();
	private Partida partidaAtual;
	private List<Partida> partidas;
	
	public String salvar() {
		partidaService.salvar(partidaNova);
		partidaNova = new Partida();
		return "Menu";
	}
	
	public void remover(Partida partida) {
		partidaService.remover(partida);
		partidas.remove(partida);
	}
	
	public List<Partida> getPartidas() {
		if(partidas == null) {
			partidas = partidaService.getPartidas();
		}
		
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

	public PartidaService getPartidaService() {
		return partidaService;
	}

	public void setPartidaService(PartidaService partidaService) {
		this.partidaService = partidaService;
	}

	public Partida getPartidaNova() {
		return partidaNova;
	}

	public void setPartidaNova(Partida partidaNova) {
		this.partidaNova = partidaNova;
	}

	public Partida getPartidaAtual() {
		return partidaAtual;
	}

	public void setPartidaAtual(Partida partidaAtual) {
		this.partidaAtual = partidaAtual;
	}
}
