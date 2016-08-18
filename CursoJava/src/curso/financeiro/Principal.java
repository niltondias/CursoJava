package curso.financeiro;

import curso.financeiro.modelo.ContaPagar;
import curso.financeiro.modelo.ContaReceber;
import curso.financeiro.modelo.Fornecedor;
import curso.financeiro.modelo.Cliente;

public class Principal {
	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Aluguia Empreendimentos");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercadinho da Esquina");
		
		ContaPagar contaPag1 = new ContaPagar(imobiliaria, "Aluguel", 2500.55, "15/06/2016");
		ContaPagar contaPag2 = new ContaPagar();
		
		contaPag2.setDescricao("acougue");
		contaPag2.setFornecedor(mercado);
		contaPag2.setValor(300.70d);
		contaPag2.setDataVencimento("25/07/2016");
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Fulano da Silva");
		
		ContaReceber contaRec1 = new ContaReceber(cliente1, "Nota fiscal de venda", 50030.45d, "20/07/2016");
		
		//contaPag1.pagar();
		
		contaPag2.pagar();
		
		contaPag1.cancelar();
		
		//contaPag1.pagar();
		
		contaRec1.receber();
		contaRec1.cancelar();
		
	}

}
