package com.m2leal.abstract_factory.gestor_de_risco.clearsale;

import java.math.BigDecimal;

import com.m2leal.abstract_factory.gestor_de_risco.AlertaDeRiscoException;
import com.m2leal.abstract_factory.gestor_de_risco.GestorDeRisco;

public class ClearSale implements GestorDeRisco {

	@Override
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if (cartao.startsWith("1111") && valorMuitoAlto(valor)) {
			throw new AlertaDeRiscoException("Valor muito alto para esse cartão");
		}
	}

	private boolean valorMuitoAlto(BigDecimal valor) {
		BigDecimal limite = new BigDecimal("5000");
		return limite.compareTo(valor) < 0;
	}

}