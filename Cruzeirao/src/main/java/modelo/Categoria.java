package modelo;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries ( {
	@NamedQuery(name="Categoria.findId", query=" Select ca From Categoria ca Where ca.nome = :nome")
})
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCategoria;
	
	private String nome;
	private int NascidosAPartirDe;
	private int minJogadores;
	private int maxJogadores;
	private String sexo;
	
	private ArrayList<Inscricao> inscricoes = new ArrayList<>();
	
	@ManyToOne
	private Campeonato campeonato;
	
	private ArrayList<Fase> fases = new ArrayList<Fase>();

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

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

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public ArrayList<Fase> getFases() {
		return fases;
	}

	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
}