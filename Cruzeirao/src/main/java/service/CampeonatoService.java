package service;

import java.util.List;
import dao.CampeonatoDAO;
import modelo.Campeonato;

public class CampeonatoService {
	
	CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
	
	public Campeonato salvar(Campeonato campeonato) {
		campeonato = campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();
		return campeonato;
	}
	
	public void alterar(Campeonato campeonato) {
		campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();
	}
	
	public void remover(Campeonato campeonato) {
		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getIdCampeonato());
		campeonatoDAO.remove(campeonato);
		campeonatoDAO.closeEntityManager();
	}
	
	public List<Campeonato> getCampeonatos() {
		List<Campeonato> list = campeonatoDAO.getAll(Campeonato.class);
		campeonatoDAO.closeEntityManager();
		return list;
	}
	
	public Campeonato getCampeonatoById(long id) {
		Campeonato c;
		c = campeonatoDAO.getById(Campeonato.class, id);
		return c;
	}
}