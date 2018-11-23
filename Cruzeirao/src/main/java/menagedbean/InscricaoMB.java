package menagedbean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Inscricao;
import service.InscricaoService;

@ManagedBean
@SessionScoped
public class InscricaoMB {
	
	private InscricaoService inscricaoService = new InscricaoService();
	//private PartidaService partidaService = new PartidaService();
	
	private Inscricao inscricaoNova = new Inscricao();
	//private Partida partidaNova = new Partida();
	
	private Inscricao inscricaoAtual;
	private List<Inscricao> inscricoes;
	
	public String salvar() {
		inscricaoService.salvar(inscricaoNova);
		inscricaoNova = new Inscricao();
		return "Menu";
	}
	
	public void remover(Inscricao inscricao) {
		inscricaoService.remover(inscricao);
		inscricoes.remove(inscricao);
	}
	
	public List<Inscricao> getInscricoes() {
		if(inscricoes == null)
		{
			inscricoes = inscricaoService.getInscricoes();
		}
		return inscricoes;
	}
	
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	
	/*
	public String mostrarPartidas(Inscricao inscricao) {
		inscricaoAtual = inscricaoService.getPartidaInscricao(inscricao);
		return "Partida-Inscricao";
	}
	
	public void getPartidas(Inscricao inscricao) {
		inscricaoAtual = inscricaoService.getPartidaInscricao(inscricao);
	}
	
	public String criarPartidas() {
		partidaNova = new Partida();
		return "CadastroPartida";
	}
	
	public String salvarPartida() {
		inscricaoAtual.partidaNova(partidaNova);
		partidaNova.setInscricao(inscricaoAtual);
		partidaService.salvar(partidaNova);
		partidaNova = new Partida();
		return "Partida-Inscricao";
	}
	*/

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

	public Inscricao getInscricaoAtual() {
		return inscricaoAtual;
	}

	public void setInscricaoAtual(Inscricao inscricaoAtual) {
		this.inscricaoAtual = inscricaoAtual;
	}
}