package EVA2_17_INTERFACES_2;

public class EVA2_17_INTERFACES_2 {

	public EVA2_17_INTERFACES_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface IntA{
	void A();//equivale a public abstract void B();
}

interface IntB{
	public abstract void B();//equivale a void A();
}

interface IntC extends IntA, IntB{//no es una herencia, mas bien es como una suma
	//NO funciona el implements
	void C();
}

class Prueba implements IntC{

	@Override
	public void A() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void B() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void C() {
		// TODO Auto-generated method stub
		
	}
	
}