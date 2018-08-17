package menagedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Categoria;
import modelo.Fase;
import modelo.Inscricao;

@ManagedBean
@SessionScoped
public class CategoriaMB {
	
	private ArrayList<Categoria> lista = new ArrayList<Categoria>();
	private ArrayList<Inscricao> listaInscricao = new ArrayList<Inscricao>();
	private ArrayList<Fase> listaFase = new ArrayList<Fase>();
	private Categoria categoria = new Categoria();
	
	public String Salvar() {
		lista.add(categoria);
		categoria = new Categoria();
		return "Menu";
	}
	
	public ArrayList<Categoria> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Categoria> lista) {
		this.lista = lista;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public ArrayList<Inscricao> getListaInscricao() {
		return listaInscricao;
	}
	public void setListaInscricao(ArrayList<Inscricao> listaInscricao) {
		this.listaInscricao = listaInscricao;
	}
	public ArrayList<Fase> getListaFase() {
		return listaFase;
	}
	public void setListaFase(ArrayList<Fase> listaFase) {
		this.listaFase = listaFase;
	}
}
