package EVA2_13_ABSTRACTAS_HRERNCIA;

public class Circulo extends Figuras{
	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double CalcularArea() {
		double a = Math.PI * (radio * radio);
		return a;
	}
	
	@Override
	public double CalcularPeri() {
		double P = Math.PI * (radio * 2);
		return P;
	}

	public Circulo(double radio) {
		this.radio = radio;
	}
	
		
}
