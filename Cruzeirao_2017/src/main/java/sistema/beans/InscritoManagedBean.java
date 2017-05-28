package sistema.beans;

import java.util.List;

import sistema.modelos.Inscrito;
import sistema.service.InscritoService;



public class InscritoManagedBean {
	private Inscrito inscrito = new Inscrito();
	private InscritoService service = new InscritoService();
	
	
	public void salvar()
	{
		service.salvar(inscrito);
		inscrito = new Inscrito();
		
	}

	public Inscrito getInscrito() {
		return inscrito;
	}

	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}

	public List<Inscrito> getInscritos() {
		return service.getInscritos();
	}
}
