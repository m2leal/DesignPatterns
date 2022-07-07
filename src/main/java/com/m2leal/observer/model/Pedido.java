package com.m2leal.observer.model;

import java.math.BigDecimal;

public class Pedido {
	
	private String descricao;
	private BigDecimal valor;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Pedido [descricao=" + descricao + ", valor=" + valor + "]";
	}
}
