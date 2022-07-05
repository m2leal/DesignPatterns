package com.m2leal.abstract_method.nota_fiscal;

import java.math.BigDecimal;
import java.util.List;

import com.m2leal.abstract_method.item.Item;

public interface NotaFiscalEletronica {
	
	public void gerar(List<Item> itens, BigDecimal imposto);
	
}
