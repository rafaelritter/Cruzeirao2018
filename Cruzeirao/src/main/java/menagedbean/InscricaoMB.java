package menagedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Inscricao;
import modelo.Partida;

@ManagedBean
@SessionScoped
public class InscricaoMB {
	
	private ArrayList<Inscricao> lista = new ArrayList<Inscricao>();
	private ArrayList<Partida> listaPartida = new ArrayList<Partida>();
	private Inscricao inscricao = new Inscricao();
	
	public String Salvar() {
		lista.add(inscricao);
		inscricao = new Inscricao();
		return "Menu";
	}
	public ArrayList<Inscricao> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Inscricao> lista) {
		this.lista = lista;
	}
	public Inscricao getInscricao() {
		return inscricao;
	}
	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
	public ArrayList<Partida> getListaPartida() {
		return listaPartida;
	}
	public void setListaPartida(ArrayList<Partida> listaPartida) {
		this.listaPartida = listaPartida;
	}
}
