package finework.apidate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CadastroCliente {
	public static void main(String[] args) {
		// Data de nascimento do cliente
		Cliente cliente = new Cliente("Joao da Silva", LocalDate.of(1999, Month.AUGUST, 17));

		// Data de hoje
		//
		LocalDate hoje = LocalDate.now();
		
		// Retornando o periodo comparando duas datas e retornando a diferença em anos
		//
		int idade = Period.between(cliente.getDataNascimento(), hoje).getYears();
		
		if ( idade >= 18 ) {
			System.out.printf("OK, cadastro autorizado. Idade: %d", idade);
		} else {
			System.err.printf("Não pode ser cadastrado. Usa idade é %d", idade);
		}
	}

}
