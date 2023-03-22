package EVA2_16_INTERFACES;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

}
