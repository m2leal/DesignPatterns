package com.m2leal.abstract_method.boleto;

import java.math.BigDecimal;
import java.util.List;

import com.m2leal.abstract_method.item.Item;

public interface Boleto {
	
	public void emitir(List<Item> itens, BigDecimal imposto);
	
}
