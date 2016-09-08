package curso.serializar.objeto;

import java.io.Serializable;

// Enviando objetos pela rede

public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	private long codigo;
	private String descricao;
	private int quantidade;
	private double valor;
	
	public Pedido() {
		
	}
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
