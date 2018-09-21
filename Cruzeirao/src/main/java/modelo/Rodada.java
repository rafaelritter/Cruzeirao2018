package modelo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rodada {
	
	@Id
	@Column(name="Numero")
	private int numero;
	
	@Column(name="Grupo")
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
