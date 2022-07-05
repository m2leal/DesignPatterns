package com.m2leal.abstract_factory.gestor_de_risco;

import java.math.BigDecimal;

public interface GestorDeRisco {

	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException;
	
}