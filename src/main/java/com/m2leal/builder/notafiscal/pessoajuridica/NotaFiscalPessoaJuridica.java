package com.m2leal.builder.notafiscal.pessoajuridica;

import java.math.BigDecimal;

import com.m2leal.builder.notafiscal.Item;
import com.m2leal.builder.notafiscal.NotaFiscal;

public class NotaFiscalPessoaJuridica extends NotaFiscal {
	
	@Override
	public BigDecimal calculaImposto() {
		BigDecimal valorTotal = BigDecimal.ZERO;
		
		for(Item i : this.getItens()) {
			BigDecimal valor = i.getValorUnitario();
			BigDecimal quantidade = new BigDecimal(i.getQuantidade());
			valorTotal = valorTotal.add(valor.multiply(quantidade));
		}
		
		return valorTotal.multiply(new BigDecimal("0.04"));
	}

}