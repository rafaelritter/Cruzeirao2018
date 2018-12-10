package menagedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Cartao;

@ManagedBean
@SessionScoped
public class CartaoMB{
	
	private ArrayList<Cartao> lista = new ArrayList<Cartao>();
	private Cartao cartao = new Cartao();
	
	public String Salvar() {
		lista.add(cartao);
		cartao = new Cartao();
		return "Menu"; 
	}

	public ArrayList<Cartao> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Cartao> lista) {
		this.lista = lista;
	}
	public Cartao getCartao() {
		return cartao;
	}
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
}
