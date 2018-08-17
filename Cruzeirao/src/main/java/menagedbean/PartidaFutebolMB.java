package menagedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Cartao;
import modelo.Gol;
import modelo.PartidaFutebol;

@ManagedBean
@SessionScoped
public class PartidaFutebolMB {
	
	private ArrayList<PartidaFutebol> lista = new ArrayList<PartidaFutebol>();
	private ArrayList<Gol> golMandantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsVisitantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsPenaltesMandantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsPenaltesVisitantes = new ArrayList<Gol>();
	private ArrayList<Cartao> cartoesMandantes = new ArrayList<Cartao>();
	private ArrayList<Cartao> CartoesVisitantes = new ArrayList<Cartao>();
	private PartidaFutebol partidaFutebol;
	
	public String Salvar() {
		lista.add(partidaFutebol);
		partidaFutebol = new PartidaFutebol();
		return "Menu";
	}
	
	public ArrayList<PartidaFutebol> getLista() {
		return lista;
	}
	public void setLista(ArrayList<PartidaFutebol> lista) {
		this.lista = lista;
	}
	public ArrayList<Gol> getGolMandantes() {
		return golMandantes;
	}
	public void setGolMandantes(ArrayList<Gol> golMandantes) {
		this.golMandantes = golMandantes;
	}
	public ArrayList<Gol> getGolsVisitantes() {
		return golsVisitantes;
	}
	public void setGolsVisitantes(ArrayList<Gol> golsVisitantes) {
		this.golsVisitantes = golsVisitantes;
	}
	public ArrayList<Gol> getGolsPenaltesMandantes() {
		return golsPenaltesMandantes;
	}
	public void setGolsPenaltesMandantes(ArrayList<Gol> golsPenaltesMandantes) {
		this.golsPenaltesMandantes = golsPenaltesMandantes;
	}
	public ArrayList<Gol> getGolsPenaltesVisitantes() {
		return golsPenaltesVisitantes;
	}
	public void setGolsPenaltesVisitantes(ArrayList<Gol> golsPenaltesVisitantes) {
		this.golsPenaltesVisitantes = golsPenaltesVisitantes;
	}
	public ArrayList<Cartao> getCartoesMandantes() {
		return cartoesMandantes;
	}
	public void setCartoesMandantes(ArrayList<Cartao> cartoesMandantes) {
		this.cartoesMandantes = cartoesMandantes;
	}
	public ArrayList<Cartao> getCartoesVisitantes() {
		return CartoesVisitantes;
	}
	public void setCartoesVisitantes(ArrayList<Cartao> cartoesVisitantes) {
		CartoesVisitantes = cartoesVisitantes;
	}
	public PartidaFutebol getPartidaFutebol() {
		return partidaFutebol;
	}
	public void setPartidaFutebol(PartidaFutebol partidaFutebol) {
		this.partidaFutebol = partidaFutebol;
	}
}
