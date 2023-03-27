package EVA2_13_ABSTRACTAS_HRERNCIA;

public class Triangulo extends Figuras{
	private double altura;
	private double base;
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

	public Triangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public double CalcularArea() {
		double a = base * altura / 2;
		return a;
	}
	
	@Override
	public double CalcularPeri() {
		double H = Math.sqrt((base * base) + (altura * altura));
		double P = base + altura + H;
		return P;
	}
}