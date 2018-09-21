package modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import java.util.ArrayList;

@Entity
@Table(name="Usuario")
public class Usuario {

	@Id
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="e-Mail")
	private String email;
	
	@Column(name="Nome")
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Data de Nascimento")
	private Date dataNascimento;
	
	@Column(name="Telefone Fixo")
	private String telefoneFixo;
	
	@Column(name="Telefone Movel")
	private String telefoneMovel;
	
	@Column(name="Endereço")
	private String endereco;
	
	@Column(name="RG")
	private String rg;
	
	@Column(name="Sexo")
	private String sexo;
	
	@OneToMany
	private ArrayList <Equipe> equipes = new ArrayList <Equipe>();
	
	@OneToMany
	private ArrayList <Campeonato> campeonatos = new ArrayList <Campeonato>();

	public void addEquipes(Equipe equipe) {
		equipes.add(equipe);
	}
	
	public void addCampeonatos(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	
	public String getTelefoneMovel() {
		return telefoneMovel;
	}
	
	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}

	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
}
