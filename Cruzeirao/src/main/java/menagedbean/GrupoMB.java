package menagedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Grupo;
import modelo.Rodada;

@ManagedBean
@SessionScoped
public class GrupoMB {
	
	private ArrayList<Grupo> lista = new ArrayList<Grupo>();
	private ArrayList<Rodada> listaRodadas = new ArrayList<Rodada>();
	private Grupo grupo = new Grupo();
	
	public String Salvar() {
		lista.add(grupo);
		grupo = new Grupo();
		return "Menu";
	}
	public ArrayList<Grupo> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Grupo> lista) {
		this.lista = lista;
	}
	public ArrayList<Rodada> getListaRodadas() {
		return listaRodadas;
	}
	public void setListaRodadas(ArrayList<Rodada> listaRodadas) {
		this.listaRodadas = listaRodadas;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}
