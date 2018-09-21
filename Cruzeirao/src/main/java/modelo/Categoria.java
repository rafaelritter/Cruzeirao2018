package modelo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria {
	
	@Id
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Nascidos a partir de")
	private int NascidosAPartirDe;
	
	@Column(name="Campeonato")
	private Campeonato campeonato;
	
	@Column(name="Mínimo de Jogadores")
	private int minJogadores;
	
	@Column(name="Máximo de Jogadores")
	private int maxJogadores;
	
	@Column(name="Sexo")
	private String sexo;
	
	private ArrayList<Inscricao> listaInscricao = new ArrayList<Inscricao>();
	private ArrayList<Fase> listaFase = new ArrayList<Fase>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNascidosAPartirDe() {
		return NascidosAPartirDe;
	}
	public void setNascidosAPartirDe(int nascidosAPartirDe) {
		NascidosAPartirDe = nascidosAPartirDe;
	}
	public ArrayList<Inscricao> getListaInscricao() {
		return listaInscricao;
	}
	public void setListaInscricao(ArrayList<Inscricao> listaInscricao) {
		this.listaInscricao = listaInscricao;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public ArrayList<Fase> getListaFase() {
		return listaFase;
	}
	public void setListaFase(ArrayList<Fase> listaFase) {
		this.listaFase = listaFase;
	}
	public int getMinJogadores() {
		return minJogadores;
	}
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	public int getMaxJogadores() {
		return maxJogadores;
	}
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
