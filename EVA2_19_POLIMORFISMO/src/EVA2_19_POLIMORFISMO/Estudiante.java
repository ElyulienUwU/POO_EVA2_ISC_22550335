package EVA2_19_POLIMORFISMO;

//CLASE derivada extends CLASEBSE
//CLASE hijo extends CLASE PADRE
//SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {
	private String noControl;
	
	public Estudiante() {
		noControl = "22550335";
	}

	public Estudiante(String nombre, String apellido, int edad, String noControl) {
		// TODO Auto-generated constructor stub
		super(nombre, apellido, edad);
		this.noControl = noControl;
		}

	public String getNoControl() {
		return noControl;
	}

	public void setNoControl(String noControl) {
		this.noControl = noControl;
	}
	@Override
	public void ImprimirDatos() {
		super.ImprimirDatos();
		System.out.println("No de Control: " + noControl);
	}

}
