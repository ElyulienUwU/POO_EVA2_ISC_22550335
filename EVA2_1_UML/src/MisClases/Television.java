package MisClases;
/*
 *  * Television
 * canal
 * volument
 * power
 * get y set
 * Imprimir datos
 * 
 */
public class Television {
	private int canal;
	private int volumen;
	private boolean power;
	
	public Television() {
		// TODO Auto-generated constructor stub
	}
	public void setCanal(int x) {
		canal = x;
	}
	public void setVolumen(int x) {
		volumen = x;
	}
	public void setPower(boolean x) {
		power = x;
	}
	
	public int getCanal() {
		return canal;
	}
	public int getVolumen() {
		return volumen;
	}
	public boolean getPower() {
		return power;
	}
	
	public void ImprimirDatos() {
		System.out.println(canal);
		System.out.println(volumen);
		System.out.println(power);
	}
}
