package curso.collections;

public class Aluno {
	private String nome;
	private int idade;

	//O metodo HashSet é utilizado para criar um id unico para o objeto
	//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	// Sobrescrevemos o metodo equals para definir que um objeto e´ comparado baseado
	// na propriedade nome 
	//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}   

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Aluno( String nome) {
		this.nome = nome;
	}

}
