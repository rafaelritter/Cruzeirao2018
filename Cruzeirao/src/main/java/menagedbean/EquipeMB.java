package menagedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import modelo.Equipe;
import service.EquipeService;

@ManagedBean
@SessionScoped
public class EquipeMB {

	private EquipeService equipeService = new EquipeService();
	private Equipe equipeAtual = new Equipe();
	private Equipe equipeNova;
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