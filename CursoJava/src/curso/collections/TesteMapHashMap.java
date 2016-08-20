package curso.collections;

import java.util.HashMap;
import java.util.Map;

//
// A interface Map HashMap é composto de uma chave o conteudo da colection ( objeto )
public class TesteMapHashMap {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joaquina");
		Aluno a2 = new Aluno("Sandra");
		Aluno a3 = new Aluno("Marcos");
		Aluno a4 = new Aluno("Miguel");
		Aluno a5 = new Aluno("Jonas");
		
	//	   <Key,    value>  - chave/conteudo
		Map<String, Aluno> alunos = new HashMap<String,Aluno>();
		
		// PUT - metodo que adciona itens na collection Map
		// Nao pode repitir a chave mas duas chaves podem apontar para o mesmo objeto
		//
		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);
		alunos.put("5", a5);
		alunos.put("6", a5);
		
		ImprimeAlunos(alunos);
		
		// Recuperando um objeto através da chave
		//
		Aluno recuperaAluno = alunos.get("4");
		System.out.println("Aluno recuperado 4: " + recuperaAluno.getNome());

	}

	private static void ImprimeAlunos(Map<String, Aluno> alunos) {
		
		// 
		// Varrendo toda a collecion usando o metodo values
		for( Aluno a : alunos.values() ) {  
			System.out.println("Nome do aluno: " + a.getNome());
		}
	}

}
