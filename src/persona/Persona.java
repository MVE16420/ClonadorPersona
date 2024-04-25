package persona;

public class Persona {
	
	private String nombre;
	private int edad;
	private int peso;
	private int altura;
	
	/**
	 * Getter del atributo nombre
	 * @return el nombre con su valor
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Seteamos el nombre del clon
	 * @param nombre String que queremos poner al clon
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public Persona(String nombre, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	/**
	 * ToString que muestra como saldran por pantalla los datos
	 */
	@Override
	public String toString() {
		return "[" + nombre + ", " + edad + "años, " + peso + "kg, " + altura + "cm]";
	}


}
