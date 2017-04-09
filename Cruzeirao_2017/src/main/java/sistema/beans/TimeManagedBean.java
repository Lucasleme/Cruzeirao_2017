package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Time;
import sistema.service.TimeService;

@ManagedBean
@SessionScoped
public class TimeManagedBean {
	
	private Time timeNovo = new Time();
	private TimeService service = new TimeService();
    private List<String> jogadores;
	
	
	public void salvar()
	{
		service.salvar(timeNovo);
		timeNovo = new Time();
		
	}

	public Time getTimeNovo() {
		return timeNovo;
	}

	public void setTimeNovo(Time timeNovo) {
		this.timeNovo = timeNovo;
	}

	public List<Time> getTimes() {
		return service.getTimes();
	}
     
    @PostConstruct
    public void init() {
    	jogadores = new ArrayList<String>();
    	jogadores.add("Lionel Messi");
    	jogadores.add("Cristiano Ronaldo");
        jogadores.add("Kaka de oliveira");
        jogadores.add("Neimar so cai");
        jogadores.add("Marquinho da Vila");
        jogadores.add("ScoobyDoo");

    }

	public List<String> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<String> jogadores) {
		this.jogadores = jogadores;
	}
 
	

}
