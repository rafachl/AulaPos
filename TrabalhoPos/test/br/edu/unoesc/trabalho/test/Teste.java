package br.edu.unoesc.trabalho.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.edu.unoesc.trabalho.questaooito.Bebidas;
import br.edu.unoesc.trabalho.questaooito.Carrinho;
import br.edu.unoesc.trabalho.questaooito.Produto;
import br.edu.unoesc.trabalho.questaooito.Vestiario;

class Teste {

	@Test
	void test() {
		Carrinho carrinho = new Carrinho();

		Bebidas bebidas = new Bebidas();
		bebidas.setDescricao("Chop");
		bebidas.setValor(10, 2);

		Vestiario vestiario = new Vestiario();
		vestiario.setDescricao("Chop");
		vestiario.setValor(100, 2);

		carrinho.addProdutos(bebidas);
		carrinho.addProdutos(vestiario);
		Produto deCrecente = carrinho.getProdutosOrdemValorDeCrescente().get(0);
		Produto crecente = carrinho.getProdutosOrdemValorCrescente().get(0);

		assertTrue(carrinho.getValor() == 169);
		assertTrue(deCrecente.getValor() == 150);
		assertTrue(crecente.getValor() == 19);

	}

}
