package sistema.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Time;
import sistema.service.TimeService;


@ManagedBean
@SessionScoped

public class TimeManagedBean {

	private Time time = new Time();
	private List<Time> times;
	private TimeService service = new TimeService();
	private List<String> jogadores;
	
	public void onRowEdit(RowEditEvent event) {

		Time t = ((Time) event.getObject());
		service.alterar(t);
	}
	
	 @PostConstruct
		 public List<String> getJogadores() {
				if (jogadores == null)
					jogadores = service.getJogadores();

				return jogadores;
			}
		 

	public void salvar() {
		service.salvar(time);

		if (times != null)
			times.add(time);

		time = new Time();
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time= time;
	}

	public List<Time> getTimes() {
		if (times == null)
			times = service.getTimes();

		return times;
	}

	public void remover(Time time) {
		service.remover(time);
		times.remove(time);

	}


}
