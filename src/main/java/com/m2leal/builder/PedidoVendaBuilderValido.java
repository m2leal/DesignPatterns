package com.m2leal.builder;

import com.m2leal.builder.model.PedidoVenda;

public class PedidoVendaBuilderValido {
	
	private PedidoVenda instancia;
	
	public PedidoVendaBuilderValido(PedidoVenda instancia) {
		this.instancia = instancia;
	}
	
	public PedidoVenda construir() {
		return this.instancia;
	}
	
}
