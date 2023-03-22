package SuperClases;

public abstract class Productos {
	 private double Precio;
	    private String nombre;
	    private String unidadVenta;
	    
	    public Productos() {
	        this.Precio = 0;
	        this.nombre = "";
	        this.unidadVenta = "";
	    }

	    public Productos(double Precio, String nombre, String unidadVenta) {
	        this.Precio = Precio;
	        this.nombre = nombre;
	        this.unidadVenta = unidadVenta;
	    }

	    public double getPrecio() {
	        return Precio;
	    }

	    public void setPrecio(double Precio) {
	        this.Precio = Precio;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getUnidadVenta() {
	        return unidadVenta;
	    }

	    public void setUnidadVenta(String unidadVenta) {
	        this.unidadVenta = unidadVenta;
	    }
	    
	    public abstract double precioVenta(int cant);
	}
