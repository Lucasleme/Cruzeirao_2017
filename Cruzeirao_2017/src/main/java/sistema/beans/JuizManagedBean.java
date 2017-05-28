package sistema.beans;

import java.util.List;

import sistema.modelos.Juiz;
import sistema.service.JuizService;

public class JuizManagedBean {
	private Juiz juiz = new Juiz();
	private JuizService service = new JuizService();

	public void salvar() {
		service.salvar(juiz);
		juiz = new Juiz();

	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public List<Juiz> getJuizes() {
		return service.getJuizes();
	}
}
