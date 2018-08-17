package auxiliar;

import java.util.ArrayList;
import java.util.List;
import modelo.Equipe;

public class EquipeAux {
	
	private ArrayList<Equipe> equipes = Informacoes.Equipes;

	public void salvar(Equipe equipe) {
		equipes.add(equipe);
	}
	
	public List<Equipe> getEquipes() {
		return equipes;
	}
}
