package modelo.financeiro.contas;

import modelo.financeiro.fornecedor.Fornecedor;

public class ContasPagar extends Conta {
	Fornecedor fornecedor;

	public ContasPagar(Fornecedor fornecedor, String dataVencimento, String descricao, double valor) {
		this.fornecedor = fornecedor;
		super.setConta(dataVencimento, descricao, valor);
	}
	
	public void exibirDetalhes( Conta conta ) {
		ContasPagar cp = (ContasPagar) conta;
		System.out.print("Pagar Fornecedor: " + cp.fornecedor.getNome());
		conta.mostraConta(conta);
	}


}
