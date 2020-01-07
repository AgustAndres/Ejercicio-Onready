import java.text.DecimalFormat;

public class Moto extends Movil{
	private String cilindradas;
	
	public Moto(String marca, String modelo,String cilindradas , Float precio) {
		super(marca, modelo, precio);
		this.cilindradas=cilindradas;
	}
	
	@Override
	public String toString() {
		DecimalFormat formato1 = new DecimalFormat("#.00");
		return "Marca: " + marca + "// Modelo: " + modelo +"// Cilindradas: " + cilindradas + "// Precio: $" + formato1.format(precio);
	}
}
