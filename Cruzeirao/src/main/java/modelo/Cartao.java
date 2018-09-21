package modelo;

import javax.persistence.Column;

public class Cartao {
	
	@Column(name="Inscrito")
	private Inscricao inscrito;
	
	@Column(name="Tipo")
	private String tipo;
	
	@Column(name="Tempo")
	private int tempo;
	
	public Inscricao getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscricao inscrito) {
		this.inscrito = inscrito;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
