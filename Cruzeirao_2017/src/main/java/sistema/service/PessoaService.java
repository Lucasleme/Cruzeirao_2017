package sistema.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sistema.modelos.Pessoa;

public class PessoaService{
	
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	private final static String[] nivel;
         
    static {
        nivel = new String[10];
        nivel[0] = "Black";
        nivel[1] = "White";
        nivel[2] = "Green";
        nivel[3] = "Red";
        nivel[4] = "Blue";
        nivel[5] = "Orange";
        nivel[6] = "Silver";
        nivel[7] = "Yellow";
        nivel[8] = "Brown";
        nivel[9] = "Maroon";
    }
	
	public PessoaService()
	{
		
	}
	
	public void salvar(Pessoa pessoa)
	{
		pessoas.add(pessoa);
	}
	
	public List <Pessoa> getPessoas()
	{
		return pessoas;
	}

	public List<String> getNivel() {
		return Arrays.asList(nivel);
	}

}
