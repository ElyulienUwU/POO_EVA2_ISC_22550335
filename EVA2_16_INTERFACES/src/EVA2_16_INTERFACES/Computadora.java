package EVA2_16_INTERFACES;

public class Computadora extends Producto implements MostrarDatos {
					//Heredamos de clases  / Implementamos Interfaces
	private String marca;
	private String procesador;
	
	public Computadora() {
		// TODO Auto-generated constructor stub
	}

	public Computadora(String marca, String procesador, String nombre, double precio) {
		super(nombre, precio);
		this.marca = marca;
		this.procesador = procesador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	@Override
	public void imprimirDatos() {
		// TODO Auto-generated method stub
		System.out.println("Nombre: " + getNombre());
		System.out.println("Precio: " + getPrecio());
		System.out.println("Marca: " + marca);
		System.out.println("Procesador: " + procesador);
	}
	
}
