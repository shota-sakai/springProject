package controller.calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import form.CalendarForm;

@Controller
public class CalendarController {
	
	@ModelAttribute
	public CalendarForm setUpCalendarForm() {
		CalendarForm calendarForm = new CalendarForm();
		return calendarForm;
	}

	@RequestMapping("/calendar")
	public String index(Model model) {
		return "calendar/calendar";
	}

}
