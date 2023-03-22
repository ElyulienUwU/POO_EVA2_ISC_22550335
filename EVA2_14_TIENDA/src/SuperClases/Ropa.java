package SuperClases;


public abstract class Ropa extends Productos{
	private String talla;
	private String marca;
	private String color;
	
	public Ropa() {
		talla = "XL";
		marca = "No c";
		color = "Blanco";
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Ropa(double precio, String talla, String marca, String color, String marca2, String color2) {
		super();
		this.talla = talla;
		this.marca = marca;
		this.color = color;
	}

}
