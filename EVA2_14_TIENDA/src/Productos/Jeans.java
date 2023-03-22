package Productos;

import SuperClases.Ropa;

public class Jeans extends Ropa{
	private String estilo;
	private String material;
	
	public Jeans() {
		estilo = "hogado";
		material = "mesclilla";
	}
	
	public double precioVenta(int cant) {
		  if(cant <= 10)
	            return getPrecio() * cant;
	        else
	            return (getPrecio() * 0.8) * cant;
	}

	public Jeans(String estilo, String material, double Precio, String nombre, String unidadVenta, String talla, String marca, String color) {
		super(Precio, nombre, unidadVenta, talla, marca, color);
		this.estilo = estilo;
		this.material = material;
	}
	
}
