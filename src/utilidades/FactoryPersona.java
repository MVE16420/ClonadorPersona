package utilidades;

import persona.Persona;
import persona.PersonaData;

public class FactoryPersona {

	public static Persona getPersona (String  nombre) throws Exception {
		
		Persona p = new Persona();
	
		    p.setNombre(nombre);
			int edad =	(int)(Math.random()*100);
			if(edad<PersonaData.EDAD_MIN || edad>=PersonaData.EDAD_MAX) {
				throw new Exception("Edad no valido");
			}
			p.setEdad(edad);
			
			int peso =(int)(Math.random()*101);
			if(edad<PersonaData.PESO_MIN || edad>=PersonaData.PESO_MAX) {
				throw new Exception("Peso no valido");
			}
			p.setPeso(peso);
			
			int altura = (int)(Math.random()*201);
			if(edad<PersonaData.ALTURA_MIN || edad>=PersonaData.ALTURA_MAX) {
				throw new Exception("Altura no valido");
			}
			p.setAltura(altura);
			return p;
	}
}
