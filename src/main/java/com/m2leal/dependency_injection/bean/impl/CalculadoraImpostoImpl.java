package com.m2leal.dependency_injection.bean.impl;

import java.math.BigDecimal;

import com.m2leal.dependency_injection.bean.CalculadoraImposto;

public class CalculadoraImpostoImpl implements CalculadoraImposto {

	@Override
	public BigDecimal calcular(BigDecimal valor) {
		return valor.multiply(new BigDecimal("0.15"));
	}

}
