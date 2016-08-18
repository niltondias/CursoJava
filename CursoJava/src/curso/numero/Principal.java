package curso.numero;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		System.out.println("Informe o preco de produto: ");
		Scanner entrada = new Scanner(System.in);
		double valor = entrada.nextDouble();
		DecimalFormat formata = new DecimalFormat("R$ ###,###,###0.00");
		BigDecimal valor2 = new BigDecimal(valor);
		BigDecimal acrecimo = new BigDecimal(1.10d);
		BigDecimal valor3 = valor2.multiply(acrecimo);
		
		System.out.println("Valor com acrecimo de 10%  ==> ");
		System.out.println(formata.format((valor3)));
		entrada.close();
		
		
	}

}
