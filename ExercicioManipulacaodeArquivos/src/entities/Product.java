package entities;

public class Product {
	String nome;
	Double preco;
	Integer quantidade;

	public Product(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double valorFinal () {
		return quantidade*preco;
	}

	@Override
	public String toString() {
		return nome+","+String.format("%.2f", valorFinal());
	}

}
