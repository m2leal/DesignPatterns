package com.m2leal.abstract_factory.operadora.cielo;

import java.math.BigDecimal;

import com.m2leal.abstract_factory.operadora.CapturaNaoAutorizadaException;
import com.m2leal.abstract_factory.operadora.Operadora;

public class Cielo implements Operadora {

	private Long codigoConfirmacao = -1L;

	@Override
	public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {
		if (cartao.startsWith("5555")) {
			throw new CapturaNaoAutorizadaException("Número de cartão inválido!");
		}
		
		this.codigoConfirmacao = (Long)Math.round(Math.random() * 1000);
	}
	
	@Override
	public Long confirmar() {
		System.out.println("Fazendo o débito na conta do cliente via Cielo");
		return this.codigoConfirmacao;
	}
	
}