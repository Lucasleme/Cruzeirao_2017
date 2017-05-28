package sistema.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateService {
	private ArrayList<Date> dates = new ArrayList<Date>();

	public DateService() {

	}

	public void salvar(Date date) {
		dates.add(date);
	}

	public List<Date> getDates() {
		return dates;
	}
}
