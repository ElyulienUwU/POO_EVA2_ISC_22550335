package EVA2_2_HERENCIA;

public class Estudiantes {
	private String nombre;
	private String apellido;
	private int edad;
	private String numControl;

	public Estudiantes() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNumControl() {
		return numControl;
	}

	public void setNumControl(String numControl) {
		this.numControl = numControl;
	}
	

	public Estudiantes(String nombre, String apellido, int edad, String numControl) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.numControl = numControl;
	}
	

}
