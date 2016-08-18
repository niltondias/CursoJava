package modelo.financeiro.contas;

public class RelatorioContas {
	// Metodo para exibir os detalhes das contas
	public void listar( Conta contas[] ) {
		for( Conta conta : contas ) {
			conta.exibirDetalhes(conta);
		}
	}

}
