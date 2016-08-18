package curso;

public class Estoque {
	Produto[] produtos;
	
	int estoqueTotal;
	
	void listaProdutos() {
		System.out.println("Lista de produtos");
		System.out.println("--------------------");
		
		estoqueTotal = 0;
		
		for( int i = 0; i < produtos.length; i++) {
			produtos[i].descreve();
			estoqueTotal += produtos[i].quantidade;
		}

		System.out.println("--------------------");
		System.out.println("Quantidade total do estoque: " + estoqueTotal);

	}
}
