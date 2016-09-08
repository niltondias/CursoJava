package curso.serializar.objeto;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		// Criando a conexao com o servidor
		//
		Socket socket = new Socket("192.168.20.104", 3333);
		
		// Pegando a saida do socket
		//
		OutputStream saida = socket.getOutputStream();
		
		// Pegando o objetdo da saida do socket
		//
		ObjectOutput objectOutput = new ObjectOutputStream(saida);
		
		// gerando um novo objeto pedido
		//
		Pedido pedido = new Pedido();
		pedido.setCodigo(1L);
		pedido.setDescricao("pasta de dente");
		pedido.setQuantidade(12);
		pedido.setValor(10d);
		
		// Gravando o objeto na saida do socket enviando par ao servidor 
		// 
		objectOutput.writeObject(pedido);
		
		InputStream entrada = socket.getInputStream();
		DataInputStream dataInput = new DataInputStream(entrada);
		System.out.println("Recebeu do servidor: " + dataInput.readUTF());
		
		socket.close();
		
	}
	

}
