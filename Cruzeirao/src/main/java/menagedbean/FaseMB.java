package menagedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Fase;

@ManagedBean
@SessionScoped
public class FaseMB {
	
	private ArrayList<Fase> lista = new ArrayList<Fase>();
	private Fase fase = new Fase();
	
	public String Salvar() {
		lista.add(fase);
		fase = new Fase();
		return "Menu";
	}
	public ArrayList<Fase> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Fase> lista) {
		this.lista = lista;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
}
