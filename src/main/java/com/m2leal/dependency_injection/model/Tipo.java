package com.m2leal.dependency_injection.model;

public enum Tipo {
	
	ANTIGO("Antigo"),
	NOVO("Novo");
	
	private String descricao;
	
	private Tipo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}
