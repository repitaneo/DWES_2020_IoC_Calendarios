package com.marcos.calendarios.servicios.diasSemanas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Service;
import com.marcos.calendarios.beans.*;


@Service
public class Calendario2Semanas {

	
	public List<Dia> getDias() {
		
		List<Dia> listaDias = new ArrayList<Dia>();
		
		
		// el día de hoy ayudado por Calendar
		Calendar diaDeHoy = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		
		// retocedemos hasta el lunes
		int diaDeLaSemana = diaDeHoy.get(Calendar.DAY_OF_WEEK);
		int retroceso=(diaDeLaSemana==1)?6:diaDeLaSemana-2;
		// retocedemos
		for(int i=0;i<retroceso;i++) {
			diaDeHoy.add(Calendar.DATE, -1);
		}
		

		// voy a crear una lista con los 21 días siguientes
		for(int i=0;i<14;i++) {
			
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
