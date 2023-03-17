package EVA2_3_EXTENDS;

public class EVA2_3_EXTENDS {

	public EVA2_3_EXTENDS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante A1 = new Estudiante ();	
		A1.setNombre("Julian");
		A1.setApellido("Ortiz");
		A1.setEdad(19);
		A1.setNoControl("22550335");
		
		System.out.println(A1.getNombre());
		System.out.println(A1.getApellido());
		System.out.println(A1.getEdad());
		System.out.println(A1.getNoControl());
		
		Docente D1 = new Docente();
		D1.setNombre("Elian");
		D1.setApellido("Vargas");
		D1.setEdad(18);
		D1.setPlaza("adhjs");
	}

}
