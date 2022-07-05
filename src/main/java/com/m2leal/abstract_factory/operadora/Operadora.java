package com.m2leal.abstract_factory.operadora;

import java.math.BigDecimal;

public interface Operadora {
	
	public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException;
	
	public Long confirmar();
	
}
