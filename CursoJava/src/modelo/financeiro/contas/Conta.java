package modelo.financeiro.contas;

public abstract class Conta {
	private double valor;
	private String dataVencimento;
	private String descricao;
	
	public abstract void exibirDetalhes(Conta conta);
	
	public void mostraConta( Conta conta ) {
		System.out.println(" Descricao: " + conta.getDescricao() + " vencimento:" + 
				conta.getDataVencimento() + " valor: R$ " + conta.getValor());
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setConta( String dataVencimento, String descricao, double valor ) {
		this.setDataVencimento(dataVencimento);
		this.setDescricao(descricao);
		this.setValor(valor);
	}
}
