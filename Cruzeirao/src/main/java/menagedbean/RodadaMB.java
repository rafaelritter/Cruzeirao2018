package menagedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Partida;
import modelo.Rodada;

@ManagedBean
@SessionScoped
public class RodadaMB {
	
	private ArrayList<Rodada> lista = new ArrayList<Rodada>();
	private ArrayList<Partida> listaPartida = new ArrayList<Partida>();
	private Rodada rodada = new Rodada();
	
	public String Salvar() {
		lista.add(rodada);
		rodada = new Rodada();
		return "Menu";
	}
	
	public ArrayList<Rodada> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Rodada> lista) {
		this.lista = lista;
	}
	public ArrayList<Partida> getListaPartida() {
		return listaPartida;
	}
	public void setListaPartida(ArrayList<Partida> listaPartida) {
		this.listaPartida = listaPartida;
	}
	public Rodada getRodada() {
		return rodada;
	}
	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}
}
