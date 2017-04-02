package sistema.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import sistema.modelos.Pessoa;
import sistema.service.PessoaService;
 
@ManagedBean
@ViewScoped

public class PessoaManagedBean {
	
	
	
	private PessoaService service = new PessoaService();
	private Pessoa pessoa = new Pessoa();

    public List<String> getNivel() {
        return service.getNivel();
    }
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void salvar()
	{   
   		 service.salvar(pessoa);
 	   	 pessoa = new Pessoa();
	     FacesMessage msg = new FacesMessage("Successful", "Welcome :" + pessoa.getNome());
	     FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public List<Pessoa> getPessoas() {
		return service.getPessoas();
	}
	
}
