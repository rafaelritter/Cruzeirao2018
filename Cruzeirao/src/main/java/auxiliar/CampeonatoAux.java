package auxiliar;

import java.util.ArrayList;
import java.util.List;
import modelo.Campeonato;

public class CampeonatoAux {
	
	private ArrayList<Campeonato> campeonatos = Informacoes.Campeonatos;
	
	public Campeonato getNomeCampeonato(String nome) {
		
		for(int i=0; i< campeonatos.size(); i++)
		{
			if(nome == campeonatos.get(i).getNome())
			{
				return campeonatos.get(i);
			}
		}
		return null;
	}
	
	public void salvar(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}
	
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
}
