package br.edu.unoesc.trabalho.questaooito;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private Double valor;

	private List<Produto> produtos;

	public Double getValor() {
		return valor;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public List<Produto> getProdutosOrdemValorCrescente() {

		produtos.sort((b, a) -> b.getValor().compareTo(a.getValor()));
		return produtos;
	}

	public List<Produto> getProdutosOrdemValorDeCrescente() {

		produtos.sort((b, a) -> a.getValor().compareTo(b.getValor()));
		return produtos;
	}

	public void addProdutos(Produto produto) {
		this.valor += produto.getValor();
		this.getProdutos().add(produto);
	}

	public Carrinho() {
		this.produtos = new ArrayList<>();
		this.valor = new Double(0);
	}
}
