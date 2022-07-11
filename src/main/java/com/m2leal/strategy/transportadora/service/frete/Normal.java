package com.m2leal.strategy.transportadora.service.frete;

import com.m2leal.strategy.transportadora.service.Frete;

public class Normal implements Frete {
	
	@Override
	public double calcularPreco(int distancia) {
		return distancia * 1.25 + 10;
	}
	
}
