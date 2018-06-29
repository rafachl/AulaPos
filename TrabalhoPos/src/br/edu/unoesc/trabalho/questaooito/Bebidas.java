package br.edu.unoesc.trabalho.questaooito;

public  class Bebidas extends Produto{

	@Override
	public float calculoValor(float valor,int quantidade) {

		
		return (float) (valor*quantidade-valor*quantidade/100.0*5);
	}

	


	
}
