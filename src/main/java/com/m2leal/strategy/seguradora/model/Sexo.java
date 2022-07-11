package com.m2leal.strategy.seguradora.model;

public enum Sexo {
	
	MASCULINO {
		@Override
		public double getTaxa(double valorVeiculo) {
			return valorVeiculo * 0.05;
		}
	},
	FEMININO {
		@Override
		public double getTaxa(double valorVeiculo) {
			return valorVeiculo * 0.02;
		}
	};
	
	public abstract double getTaxa(double valorVeiculo);
}
