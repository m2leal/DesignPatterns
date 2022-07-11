package com.m2leal.strategy.seguradora.service.calculadora;

import com.m2leal.strategy.seguradora.model.Cliente;

public interface CalculadoraPremioSeguro {
	
	public double calcular(Cliente cliente, double valorVeiculo);
	
}
