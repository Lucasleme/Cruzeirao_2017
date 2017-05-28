package sistema.beans;

import java.util.Date;
import java.util.List;

import sistema.service.DateService;

public class DateManagedBean {
	private Date date = new Date();
	private DateService service = new DateService();
	
	
	public void salvar()
	{
		service.salvar(date);
		date = new Date();
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date= date;
	}

	public List<Date> getDates() {
		return service.getDates();
	}

}
