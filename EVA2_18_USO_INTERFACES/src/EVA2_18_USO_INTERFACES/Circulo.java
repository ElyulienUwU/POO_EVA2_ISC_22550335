package EVA2_18_USO_INTERFACES;

public class Circulo implements Figuras, MostrarDatos{
	private double radio;
	
	
	public Circulo() {
		radio = 5;
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double CalArea() {
		// TODO Auto-generated method stub
		double i = Math.PI * Math.pow(radio, 2);
		return i;
	}

	@Override
	public double CalPerimetro() {
		// TODO Auto-generated method stub
		double i = Math.PI * (radio * 2);
		return i;
	}
	
	@Override
	public void ImprimirDatos() {
		// TODO Auto-generated method stub
		System.out.println("Radio: " + radio);
		System.out.println("Área: " + CalArea());
		System.out.println("Perimetro: " + CalPerimetro());
	}
}
