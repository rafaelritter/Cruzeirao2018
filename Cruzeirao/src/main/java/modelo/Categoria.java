package modelo;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
	
	@Id
	private String nome;
	
	private int NascidosAPartirDe;
	
	private int minJogadores;
	
	private int maxJogadores;
	
	private String sexo;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="categoria")
	private ArrayList<Inscricao> inscricoes = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="idCampeonato")
	private Campeonato campeonato;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="categoria")
	private ArrayList<Fase> fases = new ArrayList<Fase>();
	
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
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
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
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public ArrayList<Fase> getFases() {
		return fases;
	}
	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
}
