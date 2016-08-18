package curso;

import java.util.Scanner;

public class TestaProduto {
	
	public static void main(String[] args) {
		Estoque estoque = new Estoque();

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos produtos: ");
		
		int quantosProdutos = entrada.nextInt();
		
		entrada.nextLine();
		
		estoque.produtos = new Produto[quantosProdutos];
		
		System.out.println("Entrada de dados");
		System.out.println("------------------");
		for( int i = 0; i < estoque.produtos.length; i++ ) {
			
			estoque.produtos[i] = new Produto();
				
			System.out.print("Descricao: ");
			estoque.produtos[i].descricao = entrada.nextLine();
			
			System.out.print("Quantidade: ");
			estoque.produtos[i].quantidade = entrada.nextInt();
			
			entrada.nextLine();
		} 
		estoque.listaProdutos();
		
		entrada.close();
	} 
}
