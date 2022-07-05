package com.m2leal.abstract_method.venda;

import java.math.BigDecimal;
import java.util.List;

import com.m2leal.abstract_method.boleto.Boleto;
import com.m2leal.abstract_method.item.Item;
import com.m2leal.abstract_method.nota_fiscal.NotaFiscalEletronica;

public class Venda {
	
	private Boleto boleto;
	private NotaFiscalEletronica notaFiscalEletronica;
	private BigDecimal imposto;
	
	public Venda(ModuloVendaFactory moduloVendaFactory) {
		boleto = moduloVendaFactory.criarBoleto();
		notaFiscalEletronica = moduloVendaFactory.criarNFe();
		imposto = moduloVendaFactory.recuperarImposto();
	}
	
	public void realizar(List<Item> itens) {
		boleto.emitir(itens, imposto);
		notaFiscalEletronica.gerar(itens, imposto);
	}
	
}
