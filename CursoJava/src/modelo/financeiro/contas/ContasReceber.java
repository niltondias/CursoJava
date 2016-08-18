package modelo.financeiro.contas;

import modelo.financeiro.cliente.Cliente;

public class ContasReceber extends Conta {
	Cliente cliente;
	public ContasReceber( Cliente cliente, String dataVencimento, String descricao, double valor) {
		this.cliente = cliente;
		super.setConta(dataVencimento, descricao, valor);
	}

	public void exibirDetalhes( Conta conta ) {
		ContasReceber cr = (ContasReceber) conta;
		System.out.print("Receber Cliente: " + cr.cliente.getNome());
		conta.mostraConta(conta);
	}

}
