package modelo;

public class Gol {
	private Inscricao inscrito;
	private int tempo;
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
