package modelo;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries ( {
	@NamedQuery(name="Inscricao.findId", query=" Select i From Inscricao i Where i.numero = :numero")
})
public class Inscricao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idInscricao;
	
	private long numero;
	private boolean pagamento;
	private boolean validada;
	
	@OneToMany(mappedBy="inscricao")
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	
	@ManyToOne
	private Equipe equipe;
	
	@ManyToOne
	private Categoria categoria;
	
	public void partidaNova(Partida partida) {
		partidas.add(partida);
	}

	public long getIdInscricao() {
		return idInscricao;
	}

	public void setIdInscricao(long idInscricao) {
		this.idInscricao = idInscricao;
	}

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

	public boolean isValidada() {
		return validada;
	}

	public void setValidada(boolean validada) {
		this.validada = validada;
	}

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}