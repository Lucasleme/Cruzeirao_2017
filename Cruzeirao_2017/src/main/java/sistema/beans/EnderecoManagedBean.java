package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Endereco;
import sistema.service.EnderecoService;


 
@ManagedBean
@ViewScoped


public class EnderecoManagedBean {
	
	private EnderecoService service = new EnderecoService();
	private Endereco endereco = new Endereco();
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void salvar()
	{   
   		 service.salvar(endereco);
 	   	 endereco = new Endereco();
	}
	
	public List<Endereco> getEnderecos() {
		return service.getEnderecos();
	}
}
