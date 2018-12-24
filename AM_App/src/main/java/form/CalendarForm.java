package form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class CalendarForm implements Serializable {
	
	@NotNull
	private String day;

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
}
