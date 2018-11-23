package service;

import java.util.List;
import dao.InscricaoDAO;
import dao.PartidaDAO;
import modelo.Inscricao;
import modelo.Partida;

public class InscricaoService {
	
	InscricaoDAO inscricaoDAO = new InscricaoDAO();
	PartidaDAO partidaDAO = new PartidaDAO();
	
	public Inscricao salvar(Inscricao inscricao) {
		inscricao = inscricaoDAO.save(inscricao);
		inscricaoDAO.closeEntityManager();
		return inscricao;
	}
	
	public void alterar(Inscricao inscricao) {
		inscricaoDAO.save(inscricao);
		inscricaoDAO.closeEntityManager();
	}
	
	public void remover(Inscricao inscricao) {
		inscricao = inscricaoDAO.getById(Inscricao.class, inscricao.getIdInscricao());
		inscricaoDAO.remove(inscricao);
		inscricaoDAO.closeEntityManager();
	}
	
	public List<Inscricao> getInscricoes() {
		List<Inscricao> list = inscricaoDAO.getAll(Inscricao.class);
		inscricaoDAO.closeEntityManager();
		return list;
	}
	
	public Inscricao getInscricaoById(long Id) {
		Inscricao i;
		i = inscricaoDAO.getById(Inscricao.class, Id);
		return i;
	}
	
	public List<Partida> getPartidas() {
		List<Partida> list = partidaDAO.getAll(Partida.class);
		partidaDAO.closeEntityManager();
		return list;
	}
	
	public Inscricao getPartidaInscricao(Inscricao i) {
		i = inscricaoDAO.getById(Inscricao.class, i.getIdInscricao());
		i.getPartidas().size();
		System.out.println(i.getPartidas());
		inscricaoDAO.closeEntityManager();
		return i;
	}
}