package EVA2_19_POLIMORFISMO;

	public class Persona {
		private String nombre;
		private String apellido;
		private int edad;
		

		public Persona() {
			String nombre = "Julian";
			String apellido = "Ortiz";
			int edad = 18;
		}

		
		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		public int getEdad() {
			return edad;
		}


		public void setEdad(int edad) {
			this.edad = edad;
		}


		public Persona(String nombre, String apellido, int edad) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
		}


		public void ImprimirDatos() {
			System.out.print(this.nombre);
			System.out.println(" " + this.apellido);
			System.out.println(this.edad);	
		}
	}
