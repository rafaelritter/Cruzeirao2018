package modelo;

import java.util.ArrayList;

public class Grupo {
	private String nome;
	private Fase fase;
	private int numero;
	
	private ArrayList<Rodada> listaRodada = new ArrayList<Rodada>();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public ArrayList<Rodada> getListaRodada() {
		return listaRodada;
	}
	public void setListaRodada(ArrayList<Rodada> listaRodada) {
		this.listaRodada = listaRodada;
	}
}
