package modelo;

import java.text.SimpleDateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.CascadeType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.primefaces.event.SelectEvent;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Campeonato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long campeonatoId;
	
	private String nome;
	private double valorTaxa;
	private Usuario usuario;
	
	@Temporal(TemporalType.DATE)
	private Date dataInicioInscricao;
	
	@Temporal(TemporalType.DATE)
	private Date dataFimInscricao;
	
	@Temporal(TemporalType.DATE)
	private Date dataInicioCampeonato;
	
	@Temporal(TemporalType.DATE)
	private Date dataFimCampeonato;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="campeonato")
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	
	@ManyToMany
	@JoinTable(name="tb_campeonato-usuario", 
	joinColumns=@JoinColumn(name="usuarioId"),
	inverseJoinColumns=@JoinColumn(name="campeonatoId"))
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }

	public long getCampeonatoId() {
		return campeonatoId;
	}

	public void setCampeonatoId(long campeonatoId) {
		this.campeonatoId = campeonatoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}

	public Date getDataFimInscricao() {
		return dataFimInscricao;
	}

	public void setDataFimInscricao(Date dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}

	public Date getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}

	public void setDataInicioCampeonato(Date dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}

	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}

	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}

	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}