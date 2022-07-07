package com.m2leal.observer.model;

public enum TipoLancamento {
	
	DESPESA("Despesa"),
	RECEITA("Receita");
	
	private String descricao;

	private TipoLancamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
