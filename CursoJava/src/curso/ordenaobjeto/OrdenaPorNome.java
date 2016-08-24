package curso.ordenaobjeto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * 
 * @author nilton
 * Testar os metodos de organizar objetos
 * Organizando Pessoas pelo nome
 */

public class OrdenaPorNome {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Maria", 21);
		Pessoa p2 = new Pessoa("Adriana", 25);
		Pessoa p3 = new Pessoa("Jose", 27);
		Pessoa p4 = new Pessoa("Amauri", 30);
		
		// Criando a lista de objetos do tipo pessoa
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4);
		
		// Ordenando a lista atraves da classe Collections.
		// Necessario que a Classe Pessoa implemente a interface Comparable
		Collections.sort(pessoas);
		
		for( Pessoa pessoa : pessoas ) {
			System.out.println(pessoa);
		}
	}

}
