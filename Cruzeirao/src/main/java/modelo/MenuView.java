package modelo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class MenuView {
 
    public void save() {
        addMessage("Successo", "Informa��o Salva!");
    }
 
    public void update() {
        addMessage("Successo", "Informa��o Atualizada!");
    }
 
    public void delete() {
        addMessage("Successo", "Informa��o Apagada!");
    }
 
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}