package curso.serializar.objeto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializandoObjeto {
	public static void main(String[] args) {
		try(ObjectInput in = new ObjectInputStream( new FileInputStream("pessoa.txt"))) {
			Pessoa p = (Pessoa) in.readObject();
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			System.out.println("Profissão: " + p.getProfissao());
			
		} catch(IOException e) {
			System.err.println("Não foi possível ler o arquivo. " + e.getMessage());
			System.out.println(e.getStackTrace());
		} catch(ClassNotFoundException e) {  // readObjet lança esta excessao
			System.err.println("Erro convertendo para a classe Pessoa");
			System.out.println(e.getStackTrace());
		}
	}

}
