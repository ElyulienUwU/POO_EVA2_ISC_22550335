package EVA2_20_POLIMORFISMO_FIGURAS;

public class Triangulo implements Figuras, MostrarDatos{
	private double base;
	private double altura;
	
	public Triangulo() {
		// TODO Auto-generated constructor stub
		base = 5;
		altura = 5;
	}

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double CalArea() {
		// TODO Auto-generated method stub
		return (base * altura);
	}

	@Override
	public double CalPerimetro() {
		// TODO Auto-generated method stub
		double hip = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		return base + altura + hip;
	}

	@Override
	public void ImprimirDatos() {
		// TODO Auto-generated method stub
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Area: " + CalArea());
		System.out.println("Perimetro: " + CalPerimetro());
	}
	
}
