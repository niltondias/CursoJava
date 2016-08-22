package curso.collections;

import java.util.HashSet;
import java.util.Set;

//
// Returna um HasSet do tipo Aluno
//
public class SimuladorAlunos {
	public static Set<Aluno> buscaAluno() {
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Miguel"));
		alunos.add(new Aluno("Sandra"));
		alunos.add(new Aluno("Mauricio"));
		alunos.add(new Aluno("Isaque"));
		alunos.add(new Aluno("Sandra"));
		
		return alunos;
		
	}

}
