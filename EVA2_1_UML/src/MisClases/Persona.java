package MisClases;
/*
 * Persona
 * ID
 * Nombre
 * Edad
 * get y set
 * Imprimir Datos
 */
public class Persona {
	private String ID;
	private String nombre;
	private int edad;
	
	public Persona() {
		ID = "22550335";
		nombre = "Julian Ortiz";
		edad = 19;
	}
	
	public void setID(String x) {
		ID = x;
	}
	public void setNombre(String x) {
		nombre = x;
	}
	public void setNombre(int x) {
		edad = x;
	}
	
	public String getID() {
		return ID;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public void ImprimirDatos() {
		System.out.println(ID);
		System.out.println(nombre);
		System.out.println(edad);
	}
}
