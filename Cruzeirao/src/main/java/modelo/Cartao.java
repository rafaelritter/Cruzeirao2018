package modelo;

public class Cartao {
	
	private Inscricao inscrito;
	
	private String tipo;
	
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
