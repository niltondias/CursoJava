package curso.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class LendoArquivoProperties  {
	public static void main(String[] args) throws Exception {
		// Classe Properties
		//
		Properties prop = new Properties();
		
		// Carregando as configurações do arquivo
		//
		prop.load(new FileInputStream("./config/config.properties"));
		
		// Carregando as propriedades da class para as variaveis
		//
		String url = prop.getProperty("banco.servidor");
		String usuario = prop.getProperty("banco.usuario");
		String senha = prop.getProperty("banco.senha");
		
		System.out.printf("Estabelecendo a conexão...\n");
		System.out.printf("Servidor: %s\n", url);
		System.out.printf("Usuario: %s", usuario);
		
		// Mudando a senha
		//
		senha = "minha senha";
		prop.setProperty("banco.senha", senha);
		
		// Salvando as propriedades no arquivo.
		//
		FileOutputStream file = new FileOutputStream("./config/config.properties");
		prop.store(file, "Configurações");
	}
}
