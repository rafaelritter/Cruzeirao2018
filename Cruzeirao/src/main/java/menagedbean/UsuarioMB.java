package menagedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import modelo.Usuario;
import modelo.Campeonato;
import modelo.Equipe;
import auxiliar.UsuarioAux;

@ManagedBean
@SessionScoped
public class UsuarioMB {
	
	private UsuarioAux usuarioAux = new UsuarioAux();
	private Equipe equipeNova;
	private Campeonato campeonatoNovo;
	private Usuario usuarioAtual;
	private Usuario usuarioNovo = new Usuario();
	private List<Usuario> usuarios;
	
	public List <Usuario> getUsuarios()
	{
		if(usuarios == null)
			usuarios = usuarioAux.getAll(Usuario.class);
		
		return usuarios;
		
	}
	
	public UsuarioAux getUsuarioAux() {
		return usuarioAux;
	}

	public void setUsuarioAux(UsuarioAux usuarioAux) {
		this.usuarioAux = usuarioAux;
	}

	public Usuario getUsuarioNovo() {
		return usuarioNovo;
	}

	public void setUsuarioNovo(Usuario usuarioNovo) {
		this.usuarioNovo = usuarioNovo;
	}

	public Equipe getEquipeNova() {
		return equipeNova;
	}

	public void setEquipeNova(Equipe equipeNova) {
		this.equipeNova = equipeNova;
	}

	public Campeonato getCampeonatoNovo() {
		return campeonatoNovo;
	}

	public void setCampeonatoNovo(Campeonato campeonatoNovo) {
		this.campeonatoNovo = campeonatoNovo;
	}

	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}

	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}

	public String mostrarCPFCampeonatos(String cpf) {
		usuarioAtual = (Usuario)usuarioAux.getById(Usuario.class,usuarioAtual.getCpf());
		return "Campeonato-Usuario";
	}
	
	public String mostrarCampeonatos(String cpf) {
		usuarioAtual = (Usuario) usuarioAux.getById(Usuario.class,usuarioAtual.getCpf());
		return "Campeonato-Usuario";
	}
	
	public String mostrarCPFEquipes(String cpf) {
		usuarioAtual = (Usuario)usuarioAux.getById(Usuario.class,usuarioAtual.getCpf());
		return "Equipe-Usuario";
	}
	
	public String mostrarEquipes(Usuario usuario) {
		usuarioAtual = (Usuario)usuarioAux.getById(Usuario.class,usuarioAtual.getCpf());
		return "Equipe-Usuario";
	}
	
	public void salvar() {
		usuarioAux.save(usuarioNovo);
		
		if(usuarios != null) {
			usuarios.add(usuarioNovo);
		}
		
		usuarioNovo = new Usuario();
	}
	
	public void excluir(Usuario usuario) {
		usuarioAux.remove(usuario);
		usuarios.remove(usuario);
	}
	
	public String criarCampeonatos() {
		campeonatoNovo = new Campeonato();
		return "CadastroCampeonato";
	}
	
	public String salvarCampeonato() {
		usuarioAtual.addCampeonatos(campeonatoNovo);
		campeonatoNovo.setUsuario(usuarioAtual);
		return "Campeonato-Usuario";
	}
	
	public String criarEquipes() {
		equipeNova = new Equipe();
		return "CadastroEquipe";
	}
	
	public String salvarEquipe() {
		usuarioAtual.addEquipes(equipeNova);
		equipeNova.setUsuario(usuarioAtual);
		return "Equipe-Usuario";
	}
}
