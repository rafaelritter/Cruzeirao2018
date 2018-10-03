package modelo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Inscricao {
	
	@Id
	@Column(name="Número")
	private long numero;
	
	@Column(name="Pagamento")
	private boolean pagamento;
	
	@Column(name="Validada")
	private boolean validada;
	
	@Column(name="Categoria")
	private Categoria categoria;
	
	@ManyToMany
	@JoinColumn(name = "partida_id")
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
