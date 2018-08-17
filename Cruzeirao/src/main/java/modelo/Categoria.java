package modelo;

import java.util.ArrayList;

public class Categoria {
	private String nome;
	private int NascidosAPartirDe;
	private Campeonato campeonato;
	private int minJogadores;
	private int maxJogadores;
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
