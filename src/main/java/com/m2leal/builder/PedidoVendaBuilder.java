package com.m2leal.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.m2leal.builder.model.Cliente;
import com.m2leal.builder.model.ItemPedido;
import com.m2leal.builder.model.PedidoVenda;

public class PedidoVendaBuilder {
	
	private PedidoVenda instancia;
	
	public PedidoVendaBuilder() {
		this.instancia = new PedidoVenda();
	}
	
	public PedidoVendaBuilder comClienteVip(String nome) {
		definirCliente(nome, true);
		return this;
	}
	
	public PedidoVendaBuilder comClienteNormal(String nome) {
		definirCliente(nome, false);
		return this;
	}
	
	private void definirCliente(String nome, boolean vip) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setVip(vip);
		this.instancia.setCliente(cliente);
	}
	
	public PedidoVendaBuilder comItem(String nome, Integer quantidade, String valorUnitario) {
		ItemPedido item = new ItemPedido();
		item.setNome(nome);
		item.setQuantidade(quantidade);
		item.setValorUnitario(new BigDecimal(valorUnitario));
		
		if(this.instancia.getItensPedido() == null) {
			this.instancia.setItensPedido(new ArrayList<ItemPedido>());
		}
		
		this.instancia.getItensPedido().add(item);

		return this;
	}
	
	public PedidoVendaBuilderValido comNumero(String numero) {
		this.instancia.setNumero(numero);
		return new PedidoVendaBuilderValido(instancia); // Obriga a passar pelo método comNumero() pra retornar um objeto;
	}
	
}
