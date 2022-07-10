package com.m2leal.decorator.cobranca.service;

import com.m2leal.decorator.cobranca.model.CartaoCredito;
import com.m2leal.decorator.cobranca.model.Cliente;

public interface AutorizadorCartaoCredito {

	public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor);

}