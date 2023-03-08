package MisClases;
/*
 *  * Automovil
 * marca
 * modelo
 * año
 * get y set
 * imprimir datos
 */
public class Automovil {
	private String marca;
	private String modelo;
	private int año;
	
	public Automovil() {
		// TODO Auto-generated constructor stub
	}
	public void setMarca(String x) {
		marca = x;
	}
	public void setModelo(String x) {
		modelo = x;
	}
	public void setAño(int x) {
		año = x;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAño() {
		return año;
	}
	
	public void ImprimirDatos() {
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(año);
	}
}