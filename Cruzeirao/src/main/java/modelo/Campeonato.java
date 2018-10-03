package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.primefaces.event.SelectEvent;

@Entity
public class Campeonato {
	
	@Id
	@Column(name="Nome")
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Data de início de inscrição")
	private Date dataInicioInscricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Data de fim de inscrição")
	private Date dataFimInscricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Data de início do campeonato")
	private Date dataInicioCampeonato;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Data de fim de campeonato")
	private Date dataFimCampeonato;
	
	@Column(name="Valor da Taxa")
	private double valorTaxa;
	
	private Usuario usuario;
	
	
	//@ManyToMany
	//@JoinTable(name = "campeonato_categorias", joinColumns = { @JoinColumn(name = "campeonato_id") }, inverseJoinColumns = {
	//@JoinColumn(name = "categoria_id") })
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	
	//@ManyToMany
	//@JoinTable(name = "campeonato_usuarios", joinColumns = { @JoinColumn(name = "campeonato_id") }, inverseJoinColumns = {
	//@JoinColumn(name = "usuarios_id") })
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }

	public void addCategorias(Categoria categoria) {
		categorias.add(categoria);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
