package service;

import java.util.List;
import dao.EquipeDAO;
import modelo.Equipe;

public class EquipeService {
	
	EquipeDAO equipeDAO = new EquipeDAO();
	
	public Equipe salvar(Equipe equipe) {
		equipe = equipeDAO.save(equipe);
		equipeDAO.closeEntityManager();
		return equipe;
	}
	
	public void alterar(Equipe equipe) {
		equipeDAO.save(equipe);
		equipeDAO.closeEntityManager();
	}
	
	public void remover(Equipe equipe) {
		equipe = equipeDAO.getById(Equipe.class, equipe.getIdEquipe());
		equipeDAO.remove(equipe);
		equipeDAO.closeEntityManager();
	}
	
	public List<Equipe> getEquipes() {
		List<Equipe> list = equipeDAO.getAll(Equipe.class);
		equipeDAO.closeEntityManager();
		return list;
	}
	
	public Equipe getEquipeById(long id) {
		Equipe e;
		e = equipeDAO.getById(Equipe.class, id);
		return e;
	}
}