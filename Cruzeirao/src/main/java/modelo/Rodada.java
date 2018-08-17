package modelo;

import java.util.ArrayList;

public class Rodada {
	private int numero;
	private Grupo grupo;
	
	private ArrayList<Partida> listaPartida = new ArrayList<Partida>();

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public ArrayList<Partida> getListaPartida() {
		return listaPartida;
	}
	public void setListaPartida(ArrayList<Partida> listaPartida) {
		this.listaPartida = listaPartida;
	}
}
