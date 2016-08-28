package curso.javadoc;

/*
 * Para gerar o Java doc deve configurar o Eclipse para ecoding=UF8
 * Clicar em Project, Generate Javadoc
 * Utilizar os parametros abaixo na tela para gerar o javadoc
 * VM options -J-Dfile.encoding=UTF-8
 */

public class TesteJavadoc {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João Silva", 3000);
		
		System.out.println(funcionario.adiatamentoViagem(5, true));
	}
	
}