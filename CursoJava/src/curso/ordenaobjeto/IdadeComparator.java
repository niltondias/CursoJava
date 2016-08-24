package curso.ordenaobjeto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/***
 * 
 * @author nilton
 * Testar os metodos de organizar objetos
 * Organizando pessoas pela idade
 */

public class IdadeComparator implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		if( p1.getIdade() < p2.getIdade()) {
			return -1;	
		} else if( p1.getIdade() > p2.getIdade() ) {
			return 1;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Maria", 21);
		Pessoa p2 = new Pessoa("Adriana", 25);
		Pessoa p3 = new Pessoa("Jose", 27);
		Pessoa p4 = new Pessoa("Amauri", 30);
		
		// Criando a lista de objetos do tipo pessoa
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4);
		
		// Instanciando a classe Comparator para ser usado no sort
		IdadeComparator idadeComparator = new IdadeComparator();

		Collections.sort(pessoas, idadeComparator);  // comparando por idade
		
		for( Pessoa pessoa : pessoas ) {
			System.out.println(pessoa);
		}
	}

}
