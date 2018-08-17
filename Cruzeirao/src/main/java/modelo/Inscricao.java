package modelo;

import java.util.ArrayList;

public class Inscricao {
	private long numero;
	private boolean pagamento;
	private boolean validada;
	private Categoria categoria;
	
	private ArrayList<Partida> listaPartida = new ArrayList<Partida>();
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public ArrayList<Partida> getListaPartida() {
		return listaPartida;
	}
	public void setListaPartida(ArrayList<Partida> listaPartida) {
		this.listaPartida = listaPartida;
	}
	public boolean isValidada() {
		return validada;
	}
	public void setValidada(boolean validada) {
		this.validada = validada;
	}
}
