package menagedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import modelo.Usuario;
import modelo.Campeonato;
import modelo.Equipe;
import service.CampeonatoService;
import service.EquipeService;
import service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioMB {
	
	private UsuarioService usuarioService = new UsuarioService();
	private CampeonatoService campeonatoService = new CampeonatoService();
	private EquipeService equipeService = new EquipeService();
	
	private Usuario usuarioNovo = new Usuario();
	private Campeonato campeonatoNovo = new Campeonato();
	private Equipe equipeNova = new Equipe();
	
	private Usuario usuarioAtual;
	private List<Usuario> usuarios;
	
	public void salvar() {
		usuarioService.salvar(usuarioNovo);
		if(usuarios != null) 
		{
			usuarios.add(usuarioNovo);
		}
		usuarioNovo = new Usuario();
	}
	
	public void remover(Usuario usuario) {
		usuarioService.remover(usuario);
		usuarios.remove(usuario);
	}
	
	public List <Usuario> getUsuarios() {
		if(usuarios == null)
		{
			usuarios = usuarioService.getUsuarios();
		}
		return usuarios;
	}
	
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public String mostrarCampeonatos(Usuario usuario)
	{
		usuarioAtual = usuarioService.getCampeonatosUsuario(usuario);
		return "Campeonato-Usuario";
	}
	
	public String mostrarEquipes(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioById(usuario.getUsuarioId());
		return "Equipe-Usuario";
	}
	
	public void getCampeonatos(Usuario usuario) {
		usuarioAtual = usuarioService.getCampeonatosUsuario(usuario);
	}
	
	public String criarEquipes()
	{
		equipeNova = new Equipe();
		return "CadastroEquipe";
	}
	
	public String criarCampeonatos()
	{
		campeonatoNovo = new Campeonato();
		return "CadastroCampeonato";
	}
	
	public String salvarEquipe()
	{
		equipeService.salvar(equipeNova);
		usuarioAtual.equipeNova(equipeNova);
		equipeNova.setUsuario(usuarioAtual);
		return "Equipe-Usuario";
	}
	
	public String salvarCampeonato() {
		usuarioAtual.campeonatoNovo(campeonatoNovo);
		campeonatoNovo.setUsuario(usuarioAtual);
		campeonatoService.salvar(campeonatoNovo);
		campeonatoNovo = new Campeonato();
		return "Campeonato-Usuario";
	}
	
	public Usuario getUsuarioAtual() {
		usuarioAtual = usuarioService.getCampeonatosUsuario(usuarioAtual);
		return usuarioAtual;
	}

	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public CampeonatoService getCampeonatoService() {
		return campeonatoService;
	}

	public void setCampeonatoService(CampeonatoService campeonatoService) {
		this.campeonatoService = campeonatoService;
	}

	public EquipeService getEquipeService() {
		return equipeService;
	}

	public void setEquipeService(EquipeService equipeService) {
		this.equipeService = equipeService;
	}

	public Usuario getUsuarioNovo() {
		return usuarioNovo;
	}

	public void setUsuarioNovo(Usuario usuarioNovo) {
		this.usuarioNovo = usuarioNovo;
	}

	public Campeonato getCampeonatoNovo() {
		return campeonatoNovo;
	}

	public void setCampeonatoNovo(Campeonato campeonatoNovo) {
		this.campeonatoNovo = campeonatoNovo;
	}

	public Equipe getEquipeNova() {
		return equipeNova;
	}

	public void setEquipeNova(Equipe equipeNova) {
		this.equipeNova = equipeNova;
	}
}