import java.text.DecimalFormat;

public abstract class Movil implements Comparable<Movil>{
	protected String marca;
	protected String modelo;
	protected Float precio;
	
	public Movil(String marca, String modelo, Float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	public String print() {
		DecimalFormat formato1 = new DecimalFormat("#.00");
		return marca + " " + modelo + " $" + formato1.format(precio);
	}

	public int compareTo(Movil o) {
		return -1 *(this.precio.compareTo(o.getPrecio()));
	}
}
