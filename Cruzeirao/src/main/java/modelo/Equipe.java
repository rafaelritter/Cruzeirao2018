package modelo;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.primefaces.event.SelectEvent;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Entity
public class Equipe {
	
	@Id
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataFundacao;
	
	private String cidade;
	
	private Usuario usuario;
	
	@ManyToMany
	@JoinTable(name="TBL_UsuarioEquipe",
	joinColumns = @JoinColumn(name="idEquipe"),
	inverseJoinColumns = @JoinColumn(name="idUsuario"))
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="equipe")
	private ArrayList<Inscricao> inscricoes = new ArrayList<Inscricao>();
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
