package com.m2leal.abstract_method.venda;

import java.math.BigDecimal;

import com.m2leal.abstract_method.boleto.Boleto;
import com.m2leal.abstract_method.nota_fiscal.NotaFiscalEletronica;

public interface ModuloVendaFactory {
	
	public NotaFiscalEletronica criarNFe();
	
	public Boleto criarBoleto();
	
	public BigDecimal recuperarImposto(); 
	
}
