package curso.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoItensPedido {
	public static void main(String[] args) {
		// Carregando o arquivo via classe Scanner para a variavel "scanner"
		try(Scanner scanner = new 
				Scanner(new BufferedReader( new FileReader( "itens_pedido.txt")))) {
			
			// Definindo o delimitador de campos do arquivo
			scanner.useDelimiter(";");
			
			// Criando um objeto de localidade para o Brasil
			Locale localeBrasil = new Locale("pt", "BR");
			
			// Setando a localidade para ao scanner
			scanner.useLocale(localeBrasil);
			
			// Criando um objeto de fomatação para formatar os numeros
			// na localidade Brasil
			//
			NumberFormat formatar = NumberFormat.getCurrencyInstance(localeBrasil);
			
			// Faça enquanto houver proxima linha
			//
			while( scanner.hasNext() ) {
				String produto = scanner.next();
				int quandidade = scanner.nextInt();
				double preco = scanner.nextDouble();

				// carregando o resto da linha evitando truncar as linhas
				scanner.nextLine();
				System.out.printf("Produto: %s  Quantidade %d  Preço: %s\n", 
							produto, quandidade, formatar.format(preco));
			}
			
			
		} catch( IOException e ) {
			System.err.println("Erro a ler o arquivo: " + e.getMessage());
		}
		
	}

}
