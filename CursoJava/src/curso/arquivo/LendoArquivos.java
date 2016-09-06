package curso.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivos {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("emails2.txt"))) {
			
			String email = null;
			while( ( email = reader.readLine() ) != null ) {
				System.out.println("Enviando email para: " + email);
			}

		} catch (IOException e) {
			System.err.print("Não foi possível ler o arquivo " + e.getMessage());
		}
	}

}
