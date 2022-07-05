package com.m2leal.abstract_method;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.m2leal.abstract_method.item.Item;
import com.m2leal.abstract_method.venda.LojaFactory;
import com.m2leal.abstract_method.venda.ModuloVendaFactory;
import com.m2leal.abstract_method.venda.Venda;

public class Teste {
	public static void main(String[] args) {
		ModuloVendaFactory moduloVendaFactory = new LojaFactory();
		Venda venda = new Venda(moduloVendaFactory);
		
		List<Item> itens = new ArrayList<Item>();
		itens.add(new Item("Shampoo", 1, new BigDecimal("10")));
		itens.add(new Item("Sabonete", 2, new BigDecimal("5")));
		
		venda.realizar(itens);
	}
}
