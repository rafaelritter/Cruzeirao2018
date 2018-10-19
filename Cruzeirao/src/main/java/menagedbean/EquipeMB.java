package menagedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import modelo.Equipe;
import auxiliar.EquipeAux;

@ManagedBean
@SessionScoped
public class EquipeMB {

	private EquipeAux equipeAux = new EquipeAux();
	private Equipe equipe = new Equipe();
	private Equipe equipeNova;
	
	public EquipeAux getEquipeAux() {
		return equipeAux;
	}

	public void setEquipeAux(EquipeAux equipeAux) {
		this.equipeAux = equipeAux;
	}

	public Equipe getEquipeNova() {
		return equipeNova;
	}

	public void setEquipeNova(Equipe equipeNova) {
		this.equipeNova = equipeNova;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List <Equipe> getEquipes() {
		return equipeAux.getAll(Equipe.class);
	}
	
	public String salvar() {
		equipeAux.save(equipeNova);
		equipeNova = new Equipe();
		return "Menu";
	}
}
