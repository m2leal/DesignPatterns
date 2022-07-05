package com.m2leal.abstract_method.venda;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

import com.m2leal.abstract_method.boleto.Boleto;
import com.m2leal.abstract_method.nota_fiscal.NotaFiscalEletronica;

public class LojaFactory implements ModuloVendaFactory {

	Properties prop;
	
	public LojaFactory() {
		prop = new Properties();
		try {
			prop.load(this.getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public NotaFiscalEletronica criarNFe() {
		String classeNFe;
		NotaFiscalEletronica nfe = null;
		
		try {
			classeNFe = this.prop.getProperty("nfe");
			nfe = (NotaFiscalEletronica) Class.forName(classeNFe).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return nfe;
	}

	@Override
	public Boleto criarBoleto() {
		String classeBoleto;
		Boleto boleto = null;
		
		try {
			classeBoleto = this.prop.getProperty("boleto");
			boleto = (Boleto) Class.forName(classeBoleto).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return boleto;
	}
	
	@Override
	public BigDecimal recuperarImposto() {
		BigDecimal imposto = null;
		
		try {
			imposto = new BigDecimal(this.prop.getProperty("imposto"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return imposto;
	}

}
