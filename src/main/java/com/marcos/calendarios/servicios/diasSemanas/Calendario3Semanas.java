package com.marcos.calendarios.servicios.diasSemanas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Service;
import com.marcos.calendarios.beans.*;


@Service
public class Calendario3Semanas {

	
	public List<Dia> getDias() {
		
		List<Dia> listaDias = new ArrayList<Dia>();
		
		
		// el día de hoy ayudado por Calendar
		Calendar diaDeHoy = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		// voy a crear una lista con los 21 días siguientes
		for(int i=0;i<21;i++) {
			
			// creo un día y lo añado a la lista de dias ayudado por Calendar
			Dia dia = new Dia();
			dia.setFecha(formato.format(diaDeHoy.getTime()));
			listaDias.add(dia);

			// avanzamos el día en el calendario Calendar de java
			diaDeHoy.add(Calendar.DATE, 1);

		}
		
		return listaDias;
	}
}
