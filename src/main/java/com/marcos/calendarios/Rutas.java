package com.marcos.calendarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.marcos.calendarios.servicios.diasSemanas.Calendario2Semanas;
import com.marcos.calendarios.servicios.diasSemanas.Calendario3Semanas;



@Controller
public class Rutas {
	

	@Autowired
	Calendario3Semanas calendario21;
	

	@Autowired
	Calendario2Semanas calendario15;
	
		
	
	
	
	@GetMapping("/21dias")
	@ResponseBody
	public ModelAndView calendario21() {
	
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("21dias");
		
		mav.addObject("dias", calendario21.getDias());		
		
		return  mav;
		
	}	
	
	
	
	
	
	@GetMapping("/15dias")
	@ResponseBody
	public ModelAndView calendario15() {
	
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("14dias");
		
		mav.addObject("dias", calendario15.getDias());		
		
		return mav;
		
	}		
	
}
