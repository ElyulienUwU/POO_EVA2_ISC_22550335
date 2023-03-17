package EVA2_8_SUPER;

public class EVA2_8_SUPER {

	public EVA2_8_SUPER() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A1 = new Animal(100);
		mamifero M1 = new mamifero("Negro", 50);
		Perros P1 = new Perros();
	}

}

class Animal{
	private int peso;
	
	public Animal() {
		System.out.println("Animal: Its Alive!!");
	}
	public Animal(int peso) {
		this.peso = peso;
		System.out.println("Animal: Its Alive!!: Construcor 2");
	}	
	public void respirar() {
		System.out.println("Estoy Respirando");
	}	
	public void comer() {
		System.out.println("Estoy comiendo");
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	
}

class mamifero extends Animal {
	private String cPelo;
	
	public String getcPelo() {
		return cPelo;
	}

	public void setcPelo(String cPelo) {
		this.cPelo = cPelo;
	}

	public mamifero() {
		super();//Llamada al construcotr de la super clase
		// en nuestro caso, llama a animal ()
		//siempre debemos llamar primero al constructor de la superclase
	System.out.println("Soy mamifero");	
	}

	public mamifero(String cPelo, int peso) {
		super(peso);
		this.cPelo = cPelo;
		System.out.println("soy un mamifero!! Constructor 2");
	}
	
	
}

	class Perros extends mamifero{
	public Perros() {
		//Siempre hay que invocar al constructor de la superclase
		super();
		System.out.println("Soy sultan soy un perrito :3");
	}
	
}
