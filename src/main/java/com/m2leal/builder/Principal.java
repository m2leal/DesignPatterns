package com.m2leal.builder;

import com.m2leal.builder.notafiscal.NotaFiscal;

public class Principal {
	public static void main(String[] args) {
		
		// =-=-=-=-=-=-=- NF Pessoa Física =-=-=-=-=-=-=-
		NotaFiscalBuilder nota = new NotaFiscalBuilder('F');
		NotaFiscal nf = nota
			.comDataEmissao("26/04/2022")
			.comNumero("01152708090")
			.comItem("Shampoo", 10, "100.0")
			.construir();
		
		System.out.printf("Imposto calculado PF: %.2f\n",nf.calculaImposto());
		
		// =-=-=-=-=-=-=- NF Pessoa Jurídica =-=-=-=-=-=-=-
		nota = new NotaFiscalBuilder('j');
		nf = nota
			.comDataEmissao("26/04/2022")
			.comNumero("01152708090")
			.comItem("Shampoo", 10, "100.0")
			.construir();
		
		System.out.printf("Imposto calculado PJ: %.2f\n",nf.calculaImposto());
	}
}
