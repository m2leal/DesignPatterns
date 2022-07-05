package com.m2leal.abstract_method.boleto.cef;

import java.math.BigDecimal;
import java.util.List;

import com.m2leal.abstract_method.boleto.Boleto;
import com.m2leal.abstract_method.item.Item;

public class BoletoCaixa implements Boleto {
	
	@Override
	public void emitir(List<Item> itens, BigDecimal imposto) {
		System.out.println("Emitindo boleto da Caixa.");
	}
	
}