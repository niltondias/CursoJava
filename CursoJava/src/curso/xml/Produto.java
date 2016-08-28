package curso.xml;

import java.math.BigDecimal;
import java.util.List;

public class Produto {
	private Long codigo;
	private String descricao;
	private BigDecimal preco;
	private List<Fornecedor> fornecedores; 

	public Produto() {
		
	}
	
	public Produto(Long codigo, String descricao, BigDecimal preco, List<Fornecedor> fornecedores) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.fornecedores = fornecedores;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
