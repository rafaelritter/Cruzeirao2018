package menagedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import modelo.Equipe;
import modelo.Inscricao;
import service.EquipeService;
import service.InscricaoService;

@ManagedBean
@SessionScoped
public class EquipeMB {

	private EquipeService equipeService = new EquipeService();
	private InscricaoService inscricaoService = new InscricaoService();
	
	private Equipe equipeNova = new Equipe();
	private Inscricao inscricaoNova = new Inscricao();
	
	private Equipe equipeAtual;
	private List<Equipe> equipes;
	
	public String salvar() {
		equipeService.salvar(equipeNova);
		equipeNova = new Equipe();
		return "Menu";
	}
	
	public void remover(Equipe equipe) {
		equipeService.remover(equipe);
		equipes.remove(equipe);
	}
	
	public List<Equipe> getEquipes() {
		if(equipes == null)
		{
			equipes = equipeService.getEquipes();
		}
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
	
	public String mostrarInscricoes(Equipe equipe) {
		equipeAtual = equipeService.getInscricaoEquipe(equipe);
		return "Inscricao-Equipe";
	}
	
	public String criarInscricao() {
		inscricaoNova = new Inscricao();
		return "CadastroInscricao";
	}
	
	public String salvarInscricao() {
		equipeAtual.inscricaoNova(inscricaoNova);
		inscricaoNova.setEquipe(equipeAtual);
		inscricaoService.salvar(inscricaoNova);
		inscricaoNova = new Inscricao();
		return "Inscricao-Equipe";
	}
	
	public void getInscricoes(Equipe equipe) {
		equipeAtual = equipeService.getInscricaoEquipe(equipe);
	}

	public EquipeService getEquipeService() {
		return equipeService;
	}

	public void setEquipeService(EquipeService equipeService) {
		this.equipeService = equipeService;
	}

	public Equipe getEquipeAtual() {
		return equipeAtual;
	}

	public void setEquipeAtual(Equipe equipeAtual) {
		this.equipeAtual = equipeAtual;
	}

	public Equipe getEquipeNova() {
		return equipeNova;
	}

	public void setEquipeNova(Equipe equipeNova) {
		this.equipeNova = equipeNova;
	}
}