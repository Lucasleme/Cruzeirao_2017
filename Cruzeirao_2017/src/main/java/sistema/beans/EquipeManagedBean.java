package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import sistema.modelos.Equipe;
import sistema.service.EquipeService;

public class EquipeManagedBean {
	
	private Equipe equipeNova = new Equipe();
	private EquipeService service = new EquipeService();
    private List<String> usuarios;
	
	
	public void salvar()
	{
		service.salvar(equipeNova);
		equipeNova = new Equipe();
		
	}

	public Equipe getEquipeNova() {
		return equipeNova;
	}

	public void setEquipeNova(Equipe equipeNova) {
		this.equipeNova = equipeNova;
	}

	public List<Equipe> getEquipes() {
		return service.getEquipes();
	}
     
    @PostConstruct
    public void init() {
    	usuarios = new ArrayList<String>();
    	usuarios.add("Lionel Messi");
    	usuarios.add("Cristiano Ronaldo");
    	usuarios.add("Kaka de oliveira");
    	usuarios.add("Neimar so cai");
    	usuarios.add("Marquinho da Vila");
    	usuarios.add("ScoobyDoo");

    }

	public List<String> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<String> usuarios) {
		this.usuarios = usuarios;
	}
}
