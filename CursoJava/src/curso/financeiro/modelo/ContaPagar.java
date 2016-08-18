package curso.financeiro.modelo;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;

	public ContaPagar( Fornecedor fornecedor, String descricao, double valor, String dataVencimento ) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public ContaPagar() {
		
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void pagar() {
		if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Esta conta esta cancelada! Nao e´ possivel pagar: " + this.getDescricao());
			
		} else if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Esta conta ja esta paga. Nao e´ possivel pagar novamente!");
			
		} else {
			
			System.out.println("Pagando conta ==> Fornecedor: " +  this.fornecedor.getNome() + 
					" | Descricao: " + this.descricao + " | Valor: " + this.valor + 
					" | Vencimento: " + this.dataVencimento);
			
			// altera a situacao da conta paga
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

}
