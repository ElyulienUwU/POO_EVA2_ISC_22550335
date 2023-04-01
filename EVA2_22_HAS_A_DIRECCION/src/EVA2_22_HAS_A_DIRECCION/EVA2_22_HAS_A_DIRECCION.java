package EVA2_22_HAS_A_DIRECCION;

public class EVA2_22_HAS_A_DIRECCION {

	public EVA2_22_HAS_A_DIRECCION() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona P1 =  new Persona();
	P1.setNombre("Julian");
	P1.setApellido("Ortiz Lerma");
	P1.setEdad(19);
	
/*	Direccion direc = new Direccion();
	direc.setCalle("Av. Industrias");
	direc.setNumero(11101);
	direc.setColonia("Complejo Industrial Chihuahua");
	direc.setCp("No c");
	direc.setCiudad("Chihuahua");
	direc.setEstado("Chihuahua");
	
	P1.setDireccion(direc);*/
	P1.ImprimirDatos();
	}

}

class Direccion{
	private String calle;
	private int numero;
	private String colonia;
	private String cp;
	private String ciudad;
	private String estado;
	
	public Direccion() {
		calle = "______";
		numero = 0;
		colonia = "____";
		cp = "____";
		ciudad = "_____";
		estado = "_____";
	}
	
	
	public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
		this.calle = calle;
		this.numero = numero;
		this.colonia = colonia;
		this.cp = cp;
		this.ciudad = ciudad;
		this.estado = estado;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void ImprimirDatos() {
		System.out.println("Direccion: ");
		System.out.println(calle + " #" + numero + ", " + colonia + ", " + cp + ", " + ciudad + ", " + estado);
	}
}

class Persona{
	private String nombre;
	private String apellido;
	private int edad;
	private Direccion direccion; // Persona has_a (tiene_una) direccion
	
	public Persona() {
		this.nombre = "____";
		this.apellido = "____";
		this.edad = 0;
		this.direccion = null; //La direccion no existe	
	}

	public Persona(String nombre, String apellido, int edad, Direccion direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
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
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public void ImprimirDatos() {
		System.out.println("Persona: ");
		System.out.println(nombre + " " + apellido + ", " + edad + " años");
		if(direccion == null)
			System.out.println("No hay direccion");
		else
			direccion.ImprimirDatos();
	}

}
