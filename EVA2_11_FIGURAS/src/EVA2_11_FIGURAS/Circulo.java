package EVA2_11_FIGURAS;

public class Circulo extends Figuras{
	private double radio;

	public Circulo (){
		radio = 5;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double CalcularArea() {
		double a = Math.PI * (radio * radio);
		return a;
	}
	
	public double CalcularPeri() {
		double P = Math.PI * (radio * 2);
		return P;
	}

	public String toString() {
		String D = "Datos: \nRadio: " + radio
				+ "\nArea: " + CalcularArea() + 
				"\nPerimetro: " + CalcularPeri() + "\n";
		return D;
	}
}

