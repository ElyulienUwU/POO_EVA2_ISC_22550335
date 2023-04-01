package EVA2_19_POLIMORFISMO;

public class Docente extends Persona {
	private String plaza;

	public Docente() {
		// TODO Auto-generated constructor stub
		plaza = " ";
	}

	public String getPlaza() {
		return plaza;
	}

	public void setPlaza(String plaza) {
		this.plaza = plaza;
	}

	public Docente(String nombre, String apellido, int edad, String plaza) {
		super(nombre, apellido, edad);
		this.plaza = plaza;
	}
	@Override
	public void ImprimirDatos() {
		super.ImprimirDatos();
		System.out.println("Plaza: " + this.plaza);
	}

}
