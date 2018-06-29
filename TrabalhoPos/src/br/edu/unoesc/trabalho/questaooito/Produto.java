package br.edu.unoesc.trabalho.questaooito;

public abstract class Produto {

	private Double valor=new Double(0);
	private String descricao;
	private int quantidade;

	public abstract float calculoValor(float valor,int quantidade);

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(float valor,int quantidade) {
		this.quantidade=quantidade;
		this.valor += calculoValor(valor,quantidade);
	}

}
