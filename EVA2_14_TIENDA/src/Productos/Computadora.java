package Productos;

import SuperClases.Electronica;

public final class Computadora extends Electronica{
	 private int memoria;
	    private double tamaPantalla;
	    private double discoDuro;
	    private String procesador;

	    public Computadora() {
	        super();
	        this.memoria = 0;
	        this.tamaPantalla = 0;
	        this.discoDuro = 0;
	        this.procesador = "";
	    }

	    public Computadora(int memoria, double tamaPantalla, double discoDuro, String procesador, String fabricante, String modelo, int garantia, double Precio, String nombre, String unidadVenta) {
	        super(fabricante, modelo, garantia, Precio, nombre, unidadVenta);
	        this.memoria = memoria;
	        this.tamaPantalla = tamaPantalla;
	        this.discoDuro = discoDuro;
	        this.procesador = procesador;
	    }

	    public int getMemoria() {
	        return memoria;
	    }

	    public void setMemoria(int memoria) {
	        this.memoria = memoria;
	    }

	    public double getTamaPantalla() {
	        return tamaPantalla;
	    }

	    public void setTamaPantalla(double tamaPantalla) {
	        this.tamaPantalla = tamaPantalla;
	    }

	    public double getDiscoDuro() {
	        return discoDuro;
	    }

	    public void setDiscoDuro(double discoDuro) {
	        this.discoDuro = discoDuro;
	    }

	    public String getProcesador() {
	        return procesador;
	    }

	    public void setProcesador(String procesador) {
	        this.procesador = procesador;
	    }
	    
	    
	    
	    @Override
	    public double precioVenta(int cant) {
	       //antes de cierta cantidad manejamos precio normal
	        //despues de cierta cantidad hay descuento
	        if(cant <= 10)
	            return getPrecio() * cant;
	        else
	            return (getPrecio() * 0.8) * cant;
	    }
	    
	}
//final --> no se puede heredar de una clase con final
//class Laptop extends Computadora{
	
//}