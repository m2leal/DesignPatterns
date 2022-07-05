package com.m2leal.abstract_method.nota_fiscal.sp;

import java.math.BigDecimal;
import java.util.List;

import com.m2leal.abstract_method.item.Item;
import com.m2leal.abstract_method.nota_fiscal.NotaFiscalEletronica;

public class SaoPauloNFe implements NotaFiscalEletronica {
	
	@Override
	public void gerar(List<Item> itens, BigDecimal imposto) {
		System.out.println("Gerando NFe-SP");
	}
	
}
