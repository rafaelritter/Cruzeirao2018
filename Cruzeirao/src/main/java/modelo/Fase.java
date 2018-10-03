package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.primefaces.event.SelectEvent;

@Entity
public class Fase {
	
	@Id
	@Column(name="Número")
	private int numero;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Data de Início")
	private Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data de Fim")
	private Date dataFim;
	
	@Column(name="Categoria")
	private Categoria categoria;
	
	@ManyToMany
	@JoinColumn(name = "fase_id")
	private ArrayList<Grupo> listaGrupo = new ArrayList<Grupo>();
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public ArrayList<Grupo> getListaGrupo() {
		return listaGrupo;
	}
	public void setListaGrupo(ArrayList<Grupo> listaGrupo) {
		this.listaGrupo = listaGrupo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
