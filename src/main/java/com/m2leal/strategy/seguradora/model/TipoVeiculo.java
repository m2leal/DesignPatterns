package com.m2leal.strategy.seguradora.model;

import com.m2leal.strategy.seguradora.service.calculadora.CalculadoraPremioSeguro;
import com.m2leal.strategy.seguradora.service.calculadora.CalcularPremioSeguroParaCarro;
import com.m2leal.strategy.seguradora.service.calculadora.CalcularPremioSeguroParaMoto;

public enum TipoVeiculo {
	CARRO {
		@Override
		public CalculadoraPremioSeguro getCalculadoraPremioSeguro() {
			return new CalcularPremioSeguroParaCarro();
		}
	},
	MOTO {
		@Override
		public CalculadoraPremioSeguro getCalculadoraPremioSeguro() {
			return new CalcularPremioSeguroParaMoto();
		}
	};
	
	public abstract CalculadoraPremioSeguro getCalculadoraPremioSeguro();
}
