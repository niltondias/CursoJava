package modelo.financeiro;

import modelo.financeiro.fornecedor.Fornecedor;
import modelo.financeiro.cliente.Cliente;
import modelo.financeiro.contas.Conta;
import modelo.financeiro.contas.ContasPagar;
import modelo.financeiro.contas.ContasReceber;
import modelo.financeiro.contas.RelatorioContas;

public class Principal {
	public static void main(String[] args) {
		
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor( "Imobiliaria Novo Lar" );
		Fornecedor mercado = new Fornecedor("Vendinha do Jose");
		
		// instanciando clientes
		Cliente cliente1 = new Cliente("Macelina");
		Cliente cliente2 = new Cliente("Marcelo");
		
		// instanciando contas a pagar
		ContasPagar contaP1 = new ContasPagar(imobiliaria, "15/08/2016", "Aluguel", 2250);
		ContasPagar contaP2 = new ContasPagar(mercado, "20/09/2016", "Mercado mensal", 700);
		
		// instanciando contas a Receber;
		ContasReceber contaR1 = new ContasReceber(cliente1, "01/02/2017", "Faturamento 001", 8000);
		ContasReceber contaR2 = new ContasReceber(cliente2, "25/07/2016", "Faturamento 025", 7580);
		
		// Classe que exibe as contas
		RelatorioContas relatorio = new RelatorioContas();
		
		// Criando o array com todas as contas
		Conta[] contas = new Conta[]{contaP1,contaP2,contaR1, contaR2};
		
		// Exibindo as contas
		relatorio.listar(contas);
	}

}
