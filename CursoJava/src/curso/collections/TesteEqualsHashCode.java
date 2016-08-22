package curso.collections;

import java.util.Set;

public class TesteEqualsHashCode {
	
	public static void main(String[] args) {
		
		// Criando um objeto do tipo aluno para ser buscado na HashSet de Alunos
		//
		Aluno alunoSorteado = new Aluno("Sandra");
		
		// Criando a lista de Alunos  
		//
		Set<Aluno> alunos = SimuladorAlunos.buscaAluno();
		
		// Verificando se a lista alunos contem o objeto alunoSorteado
		// Este metodo alunos.contains utiliza o meto equals do objeto
		//
		if(alunos.contains(alunoSorteado)) {
			System.out.println("Parabens " + alunoSorteado.getNome() + " voce foi sorteado(a)!");
		} else {
			System.out.println("Nenhum aluno encontrado!");
		}
	}
}
