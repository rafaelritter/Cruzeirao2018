package service;

import java.util.List;

import dao.PartidaDAO;
import modelo.Partida;

public class PartidaService {
	
	private PartidaDAO partidaDAO = new PartidaDAO();
	
	public Partida salvar(Partida partida) {
		partida = partidaDAO.save(partida);
		partidaDAO.closeEntityManager();
		return partida;
	}
	
	public void remover (Partida partida) {
		partida = partidaDAO.getById(Partida.class, partida.getIdPartida());
		partidaDAO.remove(partida);
		partidaDAO.closeEntityManager();
	}
	
	public List<Partida> getPartidas() {
		List<Partida> list = partidaDAO.getAll(Partida.class);
		partidaDAO.closeEntityManager();
		return list;
	}
	
	public Partida getPartidaById(long Id) {
		Partida p;
		p = partidaDAO.getById(Partida.class, Id);
		return p;
	}

}
