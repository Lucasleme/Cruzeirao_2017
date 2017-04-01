package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Time;
import sistema.service.TimeService;

@ManagedBean
@SessionScoped
public class TimeManagedBean {
	
	private Time time = new Time();
	private TimeService service = new TimeService();
	
	
	public void salvar()
	{
		service.salvar(time);
		time = new Time();
		
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public List<Time> getTimes() {
		return service.getTimes();
	}
	
	public List<Time> createCars(int size) {
        List<Time> list = new ArrayList<Time>();
        for(int i = 0 ; i < size ; i++) {
            list.add(time);
        }
         
        return list;
    }
     

	
	
	

}
