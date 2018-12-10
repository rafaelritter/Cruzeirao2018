package service;

import java.util.List;

import dao.FaseDAO;
import modelo.Fase;

public class FaseService {
	
	private FaseDAO faseDAO = new FaseDAO();
	
	public Fase salvar(Fase fase) {
		fase = faseDAO.save(fase);
		faseDAO.closeEntityManager();
		return fase;
	}
	
	public void remover(Fase fase) {
		fase = faseDAO.getById(Fase.class, fase.getIdFase());
		faseDAO.remove(fase);
		faseDAO.closeEntityManager();
	}
	
	public List<Fase> getFases() {
		List<Fase> list = faseDAO.getAll(Fase.class);
		faseDAO.closeEntityManager();
		return list;
	}
	
	public Fase getFaseById(long id) {
		Fase f;
		f = faseDAO.getById(Fase.class, id);
		return f;
	}

}
