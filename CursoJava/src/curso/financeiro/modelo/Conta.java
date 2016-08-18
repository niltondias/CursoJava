package curso.financeiro.modelo;

public class Conta {

	protected String descricao;
	protected double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	Conta() {
		situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public SituacaoConta getSituacaoConta() {
		return this.situacaoConta;

	}

	public void cancelar() {
		if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Esta conta ja esta´ cancelada! Nao e´ possivel cancelar novamente!  " +		
	    "DESCRICAO: " + this.getDescricao());
		} else if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Esta conta esta paga e nao pode ser cancelada! " + 
					"DESCRICAO: " + this.getDescricao());
		} else {
			System.out.println("Cancelando conta: " + this.getDescricao());
		
			// alterando a situacao da conta
			this.situacaoConta = SituacaoConta.CANCELADA;
		}

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
}

	


