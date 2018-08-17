package menagedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Partida;

@ManagedBean
@SessionScoped
public class PartidaMB {
	
	private ArrayList<Partida> lista = new ArrayList<Partida>();
	private Partida partida = new Partida();
	
	public String Salvar() {
		lista.add(partida);
		partida = new Partida();
		return "Menu";
	}
	public ArrayList<Partida> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Partida> lista) {
		this.lista = lista;
	}
	public Partida getPartida() {
		return partida;
	}
	public void setPartida(Partida partida) {
		this.partida = partida;
	}
}
