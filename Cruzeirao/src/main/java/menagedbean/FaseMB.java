package menagedbean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Fase;
import service.FaseService;

@ManagedBean
@SessionScoped
public class FaseMB {
	
	private FaseService faseService = new FaseService();
	private Fase faseNova = new Fase();
	private Fase faseAtual;
	private List<Fase> fases;
	
	public String salvar() {
		faseService.salvar(faseNova);
		faseNova = new Fase();
		return "Menu";
	}
	
	public void remover(Fase fase) {
		faseService.remover(fase);
		fases.remove(fase);
	}
	
	public List<Fase> getFases() {
		if (fases == null) {
			fases = faseService.getFases();
		}
		
		return fases;
	}

	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}

	public FaseService getFaseService() {
		return faseService;
	}

	public void setFaseService(FaseService faseService) {
		this.faseService = faseService;
	}

	public Fase getFaseNova() {
		return faseNova;
	}

	public void setFaseNova(Fase faseNova) {
		this.faseNova = faseNova;
	}

	public Fase getFaseAtual() {
		return faseAtual;
	}

	public void setFaseAtual(Fase faseAtual) {
		this.faseAtual = faseAtual;
	}
}
