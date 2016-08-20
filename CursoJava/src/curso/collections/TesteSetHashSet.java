package curso.collections;

import java.util.HashSet;
import java.util.Set;

//
// Testando a interface set classe HashSet
// a HashSet é gravada aleatoriamente e, diferente 
// da classe ArrayList não é possível gravar objetos duplicados.
//
public class TesteSetHashSet {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Silvia");
		a1.setIdade(39);

		Aluno a2 = new Aluno("Nilton");
		a2.setIdade(39);
		
		Aluno a3 = new Aluno("Maria");
		a3.setIdade(10);
		
		Aluno a4 = new Aluno("Jose");
		a4.setIdade(50);
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4); // gravando o objeto a4 duplicado de proposito
		alunos.add(a4); // para comprovar que nao aceita objetos duplicados.
		
		// Imprime todos os objetos da collection
		ImprimeAlunos(alunos);
		
	}

	private static void ImprimeAlunos(Set<Aluno> alunos) {
		// For avançado - percorre toda a collection
		for( Aluno a : alunos ) { 
			System.out.println("Nome do aluno: " + a.getNome() );
			System.out.println("Idade: " + a.getIdade() + " anos");
			System.out.println("");
		}
		
	}

}
