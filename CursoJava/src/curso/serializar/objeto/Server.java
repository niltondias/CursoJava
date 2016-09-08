package curso.serializar.objeto;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// Enviado objetos pela rede

public class Server {
	public static void main(String[] args) throws Exception {
		
		// Criando o Server sockect
		// É possivel informar qual interface (placa de rede ) receber a conexão
		//
		ServerSocket server = new ServerSocket(3333);
		
		// Esperendo a conexão
		//
		System.out.println("Aguardando conexão...");
		Socket socket = server.accept();
		
		// Conexao efetuada
		//
		System.out.println("Conectado a " + socket.getRemoteSocketAddress());
		
		// Recebendo a entrada do sockect
		//
		InputStream entrada = socket.getInputStream();
		
		// Colocando a entrada em um objeto
		//
		ObjectInput objectStream = new ObjectInputStream(entrada);
		
		// Convertendo o objeto em na classe pedido 
		//
		Pedido pedido = (Pedido) objectStream.readObject();
		
		// Exibindo os dados o objeto
		//
		System.out.println("Codigo: " + pedido.getCodigo());
		System.out.println("Descrição: " + pedido.getDescricao());
		System.out.println("Quantidade: " + pedido.getQuantidade());
		System.out.println("Valor: " + pedido.getValor());
		
		// Retornando informações para o client
		// utilizando a saida do mesmo socket
		//
		OutputStream saida = socket.getOutputStream();
		DataOutput dataOutput = new DataOutputStream(saida);
		dataOutput.writeUTF("Recebido com sucesso!");
		
		// Fechando a conexão
		server.close();
	}

}
