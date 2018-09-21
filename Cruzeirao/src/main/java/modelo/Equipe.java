package modelo;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.primefaces.event.SelectEvent;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Entity
public class Equipe {
	
	@Id
	@Column(name="Nome")
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Data de Fundação")
	private Date dataFundacao;
	
	@Column(name="Cidade")
	private String cidade;
	
	@Column(name="Usuário")
	private Usuario usuario;
	
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuarioAtual) {
		this.usuario = usuarioAtual;
		
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
}
