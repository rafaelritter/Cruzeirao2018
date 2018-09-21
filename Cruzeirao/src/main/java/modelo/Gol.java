package modelo;

import javax.persistence.Column;

public class Gol {
	
	@Column(name="Inscrito")
	private Inscricao inscrito;
	
	@Column(name="Tempo")
	private int tempo;
	
	@Column(name="Penalte")
	private boolean penalty;
	
	public Inscricao getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscricao inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public boolean isPenalty() {
		return penalty;
	}
	public void setPenalty(boolean penalty) {
		this.penalty = penalty;
	}
}
