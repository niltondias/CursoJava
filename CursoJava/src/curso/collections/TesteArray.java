package curso.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteArray {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joaquina");
		Aluno a2 = new Aluno("Sandra");
		Aluno a3 = new Aluno("Marcos");
		Aluno a4 = new Aluno("Miguel");
		Aluno a5 = new Aluno("Jonas");
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		
		ImprimeAlunos( alunos );
	}
	
	public static void ImprimeAlunos( List<Aluno> alunos) {
		for( Aluno a : alunos) {
			System.out.println("Nome do aluno: " + a.getNome());
		}
	}

}
