package modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;

@Entity
@NamedQueries 
({
	@NamedQuery(name="Usuario.findCPF", 
			query=" Select u From Usuario u Where u.cpf = :cpf")
})
public class Usuario {

	@Id
	private String cpf;
	
	private String email;
	
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	private String telefoneFixo;
	
	private String telefoneMovel;
	
	private String endereco;
	
	private String rg;
	
	private String sexo;
	
	private Usuario usuario;
	
	@ManyToMany(mappedBy="usuarios")
	private ArrayList <Equipe> equipes = new ArrayList <Equipe>();
	
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="TBLUserCamp", 
	joinColumns=@JoinColumn(name="id_usuario"),
	inverseJoinColumns=@JoinColumn(name="id_campeonato"))
	private List<Campeonato> campeonatos = new ArrayList<Campeonato>();


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

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	
}
