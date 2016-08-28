package curso.xml;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class TesteXML {

	public static void main(String[] args) throws Exception {
		// Criando o objeto XML
		//
		XStream xstream = new XStream(new DomDriver());
		
		// Criando os alias - Associando as classes às tags do XML
		//
		xstream.alias("produto", Produto.class);
		xstream.alias("fornecedor", Fornecedor.class);

		// Criando a lista de fornecedores de cada produto
		//
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		List<Fornecedor> fornecedores2 = new ArrayList<Fornecedor>();
		
		// Adicionando os fornecedores à lista
		//
		fornecedores.add(new Fornecedor(1L, "Walmart"));
		fornecedores.add(new Fornecedor(2L, "Extra"));
		
		// Criando o primeiro produto
		//
		Produto produto1 = new Produto(100L, "Coca-Cola", new BigDecimal("5.45"),fornecedores);
		
		// Lista de fornecedores para o segundo produto
		//
		fornecedores2.add(new Fornecedor(3L, "Assai"));
		Produto produto2 = new Produto(200L, "Guarana Antartica", new BigDecimal("6.05"),fornecedores2);
		
		// Criando o objeto carrinho como uma lista de produtos
		//
		List<Produto> carrinho = new ArrayList<Produto>();
		
		// Adcionando os produtos ao carrinho
		//
		carrinho.add(produto1);
		carrinho.add(produto2);
		
		// Convertendo o primeiro produto para XML 
		//
		String xml = xstream.toXML(produto1);
		
		// Imprimindo o primeiro produto como XML
		//
		System.out.println(xml);
		
		// Criando o alias associnando o carrinho a uma lista - Isto vai gerar a tag carrinho no arquivo XML
		//
		xstream.alias("carrinho", List.class);
		
		// Criando o atributo codigo dentro do XML associando a classe ao seu atributo codigo
		//
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		// Criando um objeto saida de arquivo para gravar o arquivo XML. OutputStream = saida do resulta para arquivo 
		// InputStream = receber o resultado de um arquivo
		//
		OutputStream file = new FileOutputStream("./carrinho.xml");
		
		// Salvando o arquivo XML passando o objeto carrinho e o objeto file com parametros
		//
		xstream.toXML(carrinho, file);
		
		InputStream fale2 = new FileInputStream("./carrinho.xml");
		
		// Carregando o carrinho do XML para o objeto carrinho2
		//
		@SuppressWarnings("unchecked")  // Retirando o aleta do Eclipse
		List<Produto> carrinho2 = (List<Produto>) xstream.fromXML(fale2, carrinho);
		
		// Exibindo os produtos do carrinho que foi carrego do arquivo xml
		//
		System.out.println("Exibindo produtos o carrinho2 carregado do xml");
		System.out.println("-------------------------------------");
		for( Produto x : carrinho2 ) {
			System.out.printf("Cod Produto: %s | Descricao: %s | Preco: %s\n"
							, x.getCodigo(), x.getDescricao(), x.getPreco() );
		}

		System.out.println("-------------------------------------");

	}

}
