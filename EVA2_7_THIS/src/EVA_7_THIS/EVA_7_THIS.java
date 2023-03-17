package EVA_7_THIS;

public class EVA_7_THIS {

	public EVA_7_THIS() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args) {
		
	}

}
class Persona{
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}	
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
