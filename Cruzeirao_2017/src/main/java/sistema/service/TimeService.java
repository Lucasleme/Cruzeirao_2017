package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Time;

public class TimeService {

	private ArrayList <Time> times = new ArrayList<Time>();
	
	public TimeService()
	{

	}
	
	public void salvar(Time time)
	{
		int a = 0;
		for(int i=0;i<times.size(); i++){
			if(time.getNome() == times.get(i).getNome())
				a++;
		}
		if(a==0)
	    times.add(time);
	}
	

	public List <Time> getTimes()
	{
		
		return times;
		
	}
	
	
}
