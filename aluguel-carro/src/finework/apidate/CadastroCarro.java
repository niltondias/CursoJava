package finework.apidate;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class CadastroCarro {
	public static void main(String[] args) {
		Carro renault = new Carro("Sandero", 15, Year.of(2012));
		Carro honda = new Carro("Civic", 20, Year.of(2011));
		Carro gm = new Carro("Celta", 10, Year.parse("2010"));
		
		List<Carro> carros = Arrays.asList(renault, honda, gm);
		
		
		carros.stream() 
			.filter(c -> c.getAnoFabricacao().isAfter(Year.of(2010)) )
			.forEach(System.out::println );		
	}

}
