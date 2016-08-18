package curso.financeiro.modelo;

public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	public ContaReceber( Cliente cliente, String descricao, double valor, String dataVencimento ) {
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
		this.getDescricao();
	}
	
	public void receber() {
		if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Esta conta esta cancelada! Nao e´ possivel receber: " + this.getDescricao());
			
		} else if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Esta conta ja foi recebida. Nao e´ possivel receber novamente!");
			
		} else {
			
			System.out.println("Recebendo conta ==> Cliente: " +  this.cliente.getNome() + 
					" | Descricao: " + this.descricao + " | Valor: " + this.valor + 
					" | Vencimento: " + this.dataVencimento);
			
			// altera a situacao da conta recebida
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	
	public void cancelar() {
		if( this.valor > 50000 ) {
			System.out.println("Titulo a receber " + this.getDescricao() + "cliente: " + this.cliente + " valor: " + this.getValor() + 
					" maior que R$ 50.000,00 nao pode ser cancelado!");
		} else {
			super.cancelar();
		}
	}

}
