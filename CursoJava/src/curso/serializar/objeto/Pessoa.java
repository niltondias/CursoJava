package curso.serializar.objeto;

import java.io.Serializable;

public class Pessoa implements Serializable {
	// Serve para controlar a versao da classe Serializable
	// Se a versao da classe estiver diferente da versao do arquivo
	// nao conseguirá descelerizar
	//
	private static final long serialVersionUID = 2L;

	private String nome;
	private int idade;
	private String profissao;
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
