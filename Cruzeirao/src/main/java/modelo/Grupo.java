package modelo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Grupo {
	
	@Id
	@Column(name="Número")
	private int numero;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Fase")
	private Fase fase;
	
	@ManyToMany
	@JoinColumn(name = "grupo_id")
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
