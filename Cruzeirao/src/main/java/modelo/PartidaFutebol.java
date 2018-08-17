package modelo;

import java.util.ArrayList;

public class PartidaFutebol extends Partida{
	
	private ArrayList<Gol> golMandantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsVisitantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsPenaltesMandantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsPenaltesVisitantes = new ArrayList<Gol>();
	private ArrayList<Cartao> cartoesMandantes = new ArrayList<Cartao>();
	private ArrayList<Cartao> CartoesVisitantes = new ArrayList<Cartao>();
	
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
}
