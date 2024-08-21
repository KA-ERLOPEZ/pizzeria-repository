package proyecto.sistema.venta.pizzeria_api.validations.impl;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.ConflictException;
import proyecto.sistema.venta.pizzeria_api.dto.PersonaDto;
import proyecto.sistema.venta.pizzeria_api.validations.Validador;

public class PersonaValidadorFecha implements Validador<PersonaDto> {

	@Override
	public void validar(PersonaDto object) {
		
		LocalDate fechaNac = object.getPerFecNac().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Period period = Period.between(fechaNac, LocalDate.now());
		
		if(object.getPerFecNac().after(new Date())) {
			
			throw new ConflictException("Fecha de nacimiento tiene que ser anterior a la fecha actual");
		}
		
		if(period.getYears() < 15) {
			
			throw new ConflictException("Tienes que ser mayor de edad");
		}
		
		object.setPerNombre(object.getPerNombre().toUpperCase());
		object.setPerApellido(object.getPerApellido().toUpperCase());
		object.setPerDireccion(object.getPerDireccion().toUpperCase());
		object.setPerEmail(object.getPerEmail().toUpperCase());
		
	}
	

		
		
		

}
