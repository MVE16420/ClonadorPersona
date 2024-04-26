package utilidades;

import persona.Persona;
import persona.PersonaData;

public class ValidadorPersona {

	public static boolean isValid(Persona p) {
		if((p.getPeso()>=PersonaData.PESO_MIN) &&
		   (p.getPeso()<=PersonaData.PESO_MAX) &&
		   (p.getPeso()>=PersonaData.EDAD_MIN) &&
		   (p.getPeso()<=PersonaData.EDAD_MAX) &&
		   (p.getPeso()>=PersonaData.ALTURA_MIN) &&
		   (p.getPeso()<=PersonaData.ALTURA_MAX)) {
			
			return true;
		}
		return  false;
	}
}
