package EVA2_19_POLIMORFISMO;

public class EVA2_19_POLIMORFISMO {

	public EVA2_19_POLIMORFISMO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Docente D1 = new Docente("Juan","Granizo",33,"Medio Tiempo");
		D1.ImprimirDatos();
		
		Estudiante E1 = new Estudiante("Julian","Ortiz",19,"22550335");
		E1.ImprimirDatos();
		
		//En resumen, esto es polimorfismo:
		Persona P1 = D1;
		P1.ImprimirDatos();
		
		Persona p2 = E1;
		p2.ImprimirDatos();
	//	Ahora Al reves
	//	No se puede hacer conversion de super clase a subclase
	//	En este caso. No existe PLAZA
		Persona Pe = new Persona();
	//	Docentes D2 = Pe;
	}

}
