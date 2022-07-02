package com.m2leal.factory_method;

import com.m2leal.factory_method.creator.ConsoleLogCreator;
import com.m2leal.factory_method.logger.Logger;

public class CalculadoraDeImpostos {

	private Logger logger;

	public CalculadoraDeImpostos(Logger logger) {
		this.logger = logger;
	}

	public void calcular(double valor) {
		// Aqui teria uma lógica para calcular impostos sobre o valor passado

		// no fim, o programador gostaria de deixar registrado o valor calculado
		logger.log("Imposto calculado para o valor R$" + valor);
	}
	
	public static void main(String[] args) {
		Logger logger = new ConsoleLogCreator();
		CalculadoraDeImpostos ci = new CalculadoraDeImpostos(logger);
		ci.calcular(50);
	}

}
