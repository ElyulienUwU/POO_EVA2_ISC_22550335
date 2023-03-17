package EVA2_4_FORMATO_APA;

public class Pelicula extends Documento{
	private String productora;
	private String distribuidora;

	public Pelicula() {
		// TODO Auto-generated constructor stub
	}

	public String getProductora() {
		return productora;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public Pelicula(String productora, String distribuidora) {
		super();
		this.productora = productora;
		this.distribuidora = distribuidora;
	}
	

}
