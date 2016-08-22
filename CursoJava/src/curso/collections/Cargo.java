package curso.collections;

import java.math.BigDecimal;

public class Cargo {
	private String descricao;
	private BigDecimal valor;
	
	public Cargo( String descricao, BigDecimal valor ) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getSalario() {
		return valor;
	}
	public void setSalario(BigDecimal salario) {
		this.valor = salario;
	}

}
