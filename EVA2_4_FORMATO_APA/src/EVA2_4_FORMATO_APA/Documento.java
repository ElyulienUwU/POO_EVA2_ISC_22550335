package EVA2_4_FORMATO_APA;

public class Documento {
	private String director;
	private String titulo;
	private int año;
	private String mes;
	private int dia;
	
	/*
	 * subclases
	 * herdar de documento y agrefar dos atributos adicionales
	 * Libro
	 * articulo
	 * informe
	 * sitio web
	 */

	public Documento() {
		// TODO Auto-generated constructor stub
	}

	public String getDirector() {
		return director;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAño() {
		return año;
	}

	public String getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Documento(String director, String titulo, int año, String mes, int dia) {
		super();
		this.director = director;
		this.titulo = titulo;
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}
	

}
