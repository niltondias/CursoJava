package curso.serializar.objeto;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializandoObjeto {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Marcela de Souza");
		p.setIdade(39);
		p.setProfissao("Engenheira");
		
		try (ObjectOutput out = new ObjectOutputStream( new FileOutputStream("pessoa.txt") ) ) {
			out.writeObject(p);
			System.out.println("Objeto salvo com sucesso! " + p.getNome());
		} catch(IOException e) {
			System.err.println("Erro salvando objeto no arquivo. " + e.getMessage());
			e.getStackTrace();
		}
			
		}

}
