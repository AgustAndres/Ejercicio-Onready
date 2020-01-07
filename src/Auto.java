import java.text.DecimalFormat;

public class Auto extends Movil{
	protected Integer puertas;
	
	public Auto(String marca, String modelo, Integer puertas, Float precio) {
		super(marca, modelo, precio);
		this.puertas=puertas;
	}

	@Override
	public String toString() {
		DecimalFormat formato1 = new DecimalFormat("#.00");
		return "Marca: " + marca + "// Modelo: " + modelo +"// Puertas: " + puertas + "// Precio: $" + formato1.format(precio);
	}
	
	
}
