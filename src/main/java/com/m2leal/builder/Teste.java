package com.m2leal.builder;

import com.m2leal.builder.model.PedidoVenda;

public class Teste {
	public static void main(String[] args) {
				
		PedidoVenda pedidoVenda = new PedidoVendaBuilder()
										.comClienteVip("M2Leal")
										.comItem("Shampoo", 2, "10.15")
										.comItem("Item2", 1, "1.99")
										.comNumero("123456")
										.construir();
		
		System.out.println(pedidoVenda);
	}
}
