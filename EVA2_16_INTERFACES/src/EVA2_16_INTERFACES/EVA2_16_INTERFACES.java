package EVA2_16_INTERFACES;

public class EVA2_16_INTERFACES {

	public EVA2_16_INTERFACES() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MostrarDatos obj = new MostrarDatos(); no se puede insanciar
		Persona pe = new Persona("Julian",19);
		pe.imprimirDatos();
		Computadora compu = new Computadora("Acer","Intel i8","Mauricio ",89);
		compu.imprimirDatos();
		
	}

}
