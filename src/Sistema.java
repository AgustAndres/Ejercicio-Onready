import java.util.*;

public class Sistema implements ObtenerVehiculo{
	private Set<Movil> listaNormal;
	private Set<Movil> listaOrdenadaPrecio;
	
	
	public Sistema() {
		listaNormal = new HashSet<Movil>();
		listaOrdenadaPrecio = new TreeSet<Movil>();
		
		Movil numero1 = new Auto("Peugeot", "206",4, 200000.f);
		Movil numero2 = new Moto("Honda", "Titan","125c", 60000.f);
		Movil numero3 = new Auto("Peugeot", "208",5, 250000.f);
		Movil numero4 = new Moto("Yamaha", "YBR","160c", 80500.50f);	
		
		listaNormal.add(numero1);
		listaNormal.add(numero2);
		listaNormal.add(numero3);
		listaNormal.add(numero4);
		
		listaOrdenadaPrecio.addAll(listaNormal);
	}
	
	public void imprimirListaNormal() {
		for (Movil movil : listaNormal) {
			System.out.println(movil);
		}
		System.out.println("=============================");
	}
	
	public void imprimirListaOrdenada() {
		System.out.println("=============================");
		for (Movil movil : listaOrdenadaPrecio) {
			System.out.println(movil.getMarca() +" "+ movil.getModelo());
		}
	}

	@Override
	public void masCaro(){
		Movil masCaro = ((TreeSet<Movil>) listaOrdenadaPrecio).last();
		System.out.println("Vehículo más caro: " + masCaro.getMarca() + " " + masCaro.getModelo());
	}

	@Override
	public void masBarato(){
		Movil masBarato = ((TreeSet<Movil>) listaOrdenadaPrecio).first();
		System.out.println("Vehículo más barato: " + masBarato.getMarca() + " " + masBarato.getModelo());
	}

	@Override
	public void vehiculoLetraY() {
		for (Movil movil : listaNormal) {
			if(movil.getMarca().contains("Y")) {
				System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + movil.print());
			};
		}
	}
	
	
}
