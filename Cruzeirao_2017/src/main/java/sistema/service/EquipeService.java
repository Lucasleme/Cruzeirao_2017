package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Equipe;

public class EquipeService {

private ArrayList <Equipe> equipes = new ArrayList<Equipe>();
	
	public EquipeService()
	{

	}
	
	public void salvar(Equipe equipeNova)
	{
		int a = 0;
		for(int i=0;i<equipes.size(); i++){
			if(equipeNova.getNome() == equipes.get(i).getNome())
				a++;
		}
		if(a==0)
	    equipes.add(equipeNova);
	}
	

	public List <Equipe> getEquipes()
	{
		
		return equipes;
		
	}
	
}
