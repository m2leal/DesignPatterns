package com.m2leal.strategy.seguradora.service.calculadora;

import com.m2leal.strategy.seguradora.model.Cliente;

public class CalcularPremioSeguroParaCarro implements CalculadoraPremioSeguro {

	@Override
	public double calcular(Cliente cliente, double valorVeiculo) {
		double taxaPorSexo = cliente.getSexo().getTaxa(valorVeiculo);
		double valorPorVeiculo = valorVeiculo * 0.05;
		return (taxaPorSexo + valorPorVeiculo);
	}

}
