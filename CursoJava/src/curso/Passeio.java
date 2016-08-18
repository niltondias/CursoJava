package curso;

public class Passeio {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Silvia";
		p1.cachorro = new Cachorro();
		p1.cachorro.idade = 2;
		p1.cachorro.nome = "Magui";
		
		Caminhada caminhada = new Caminhada();
		caminhada.andar(p1);
	}

}
