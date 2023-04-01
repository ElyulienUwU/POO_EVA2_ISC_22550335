package EVA2_21_POLIMORFISMO_VEHICULOS;

public class EVA2_21_POLIMORFISMO_VEHICULOS {

	public EVA2_21_POLIMORFISMO_VEHICULOS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil A1 = new Automovil("Toyta","Corolla",2009,0);
		ModificarVel(A1, 45);
		Bicicleta B1 = new Bicicleta("Montaña","Apache",0);
		ModificarVel(B1, 15);
		
	}
	public static void ModificarVel(ControlarDatos datos, int Vel) {
		datos.CambiarVelocidad(Vel);
		datos.tablero();
		
	}

}
class Vehiculo{
	private String marca;
	protected int velocidad;
	
	public Vehiculo(){
		marca = "Toyota";
		velocidad = 80;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public Vehiculo(String marca, int velocidad) {
		this.marca = marca;
		this.velocidad = velocidad;
	}

}

interface ControlarDatos{
	void CambiarVelocidad(int cambio);
	void tablero();
}


class Automovil extends Vehiculo implements ControlarDatos{
	private String modelo;
	private int año;
	
	public Automovil() {
		modelo = "No ce";
		año = 2009;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public Automovil(String modelo, String marca, int año, int velocidad) {
		super(marca, velocidad);
		this.modelo = modelo;
		this.año = año;
	}

	@Override
	public void CambiarVelocidad(int cambio) {
		// TODO Auto-generated method stub
		int Vel = velocidad + cambio;
		if ( Vel >= 0);
		velocidad = Vel;
	}

	@Override
	public void tablero() {
		// TODO Auto-generated method stub
		System.out.println("Automovil:");
		System.out.println("Velocidad: " + velocidad);
		System.out.println("Combustible: Pendietne");
		System.out.println("Revoluciones: Pendietne");
		
	}
	
}

class Bicicleta extends Vehiculo implements ControlarDatos{
	private String tipo;

	public Bicicleta(){
		tipo = "quien sabe?";
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Bicicleta(String tipo, String marca, int año) {
		super(marca,año);
		this.tipo = tipo;
	}

	@Override
	public void CambiarVelocidad(int cambio) {
		// TODO Auto-generated method stub
		int Vel = velocidad + cambio;
		if ( Vel >= 0);
		velocidad = Vel;
	}

	@Override
	public void tablero() {
		// TODO Auto-generated method stub
		System.out.println("Bicicleta: ");
		System.out.println("Velocidad: " + velocidad);
	}
	
}



