package EVA2_16_INTERFACES;

public class Persona implements MostrarDatos{
	private String nombre;
	private int edad;
	
	public Persona() {
		this.nombre = "yo";
		this.edad = 19;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public void imprimirDatos() {
		// TODO Auto-generated method stub
		
	}
}