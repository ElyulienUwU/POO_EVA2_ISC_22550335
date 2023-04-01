package EVA2_18_USO_INTERFACES;

public class EVA2_18_USO_INTERFACES {

	public EVA2_18_USO_INTERFACES() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No se pueden crear objetos de interfaces
		//Figuras Fi = new Figuras ();
		//MostrarDatos MD = new MostrarDatos();
		
		Circulo c1 = new Circulo();
		c1.setRadio(48);
		c1.CalArea();
		c1.CalPerimetro();
		c1.ImprimirDatos();
		
		Triangulo T1 = new Triangulo(20, 20);
		T1.CalArea();
		T1.CalPerimetro();
		T1.ImprimirDatos();
	}

}
