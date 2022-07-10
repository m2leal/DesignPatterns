package com.m2leal.decorator.cobranca.service;

import java.time.YearMonth;

import com.m2leal.decorator.cobranca.exception.RiscoCreditoException;
import com.m2leal.decorator.cobranca.model.CartaoCredito;
import com.m2leal.decorator.cobranca.model.Cliente;

public class AnalisadorDeRiscoClearSale implements AutorizadorCartaoCredito {

	private AutorizadorCartaoCredito autorizador;
	
	public AnalisadorDeRiscoClearSale(AutorizadorCartaoCredito autorizador) {
		this.autorizador = autorizador;
	}

	@Override
	public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor) {
		if (cliente.getCpf().startsWith("111") || cartaoCredito.getVencimento().isBefore(YearMonth.now())
				|| valor > 500) {
			throw new RiscoCreditoException("Possível fraude, negando pagamento!");
		}
		
		autorizador.autorizar(cliente, cartaoCredito, valor);
	}

}