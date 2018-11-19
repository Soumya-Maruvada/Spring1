package com.cg.ctrl;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		DateFormat dateFormat =  DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,locale);
		Date date = new Date();
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime",formattedDate);
		return "index";
	}
}
