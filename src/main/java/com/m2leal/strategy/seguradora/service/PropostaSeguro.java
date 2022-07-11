package com.m2leal.strategy.seguradora.service;

import com.m2leal.strategy.seguradora.model.Cliente;
import com.m2leal.strategy.seguradora.service.calculadora.CalculadoraPremioSeguro;

public class PropostaSeguro {
	
	private Cliente cliente;
	private CalculadoraPremioSeguro calculadora;
	
	public PropostaSeguro(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String gerar(double valorVeiculo) {
		return "Valor calculado para " + cliente.getNome() + ": " + calculadora.calcular(cliente, valorVeiculo);
	}
	
	public void setCalculadora(CalculadoraPremioSeguro calculadora) {
		this.calculadora = calculadora;
	}
	
	
}
