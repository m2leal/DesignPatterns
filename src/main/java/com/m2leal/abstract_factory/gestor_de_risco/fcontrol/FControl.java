package com.m2leal.abstract_factory.gestor_de_risco.fcontrol;

import java.math.BigDecimal;

import com.m2leal.abstract_factory.gestor_de_risco.AlertaDeRiscoException;
import com.m2leal.abstract_factory.gestor_de_risco.GestorDeRisco;

public class FControl implements GestorDeRisco {

	@Override
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if (cartao.startsWith("7777")) {
			throw new AlertaDeRiscoException("Cartão suspeito.");
		}
	}

}