package curso;

public class Caminhada {
	public void andar( Pessoa pessoa ) {
		System.out.println("Eu \"" + pessoa.nome +  "\"" + " estou andando com meu cachorro \"" 
						+ pessoa.cachorro.nome + "\"");
	}

}
