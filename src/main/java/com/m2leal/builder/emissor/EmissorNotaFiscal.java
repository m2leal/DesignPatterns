package com.m2leal.builder.emissor;

import com.m2leal.builder.notafiscal.NotaFiscal;

public abstract class EmissorNotaFiscal {

	NotaFiscal notaFiscal;
	
	protected abstract NotaFiscal criarNota();
	
	public EmissorNotaFiscal() {
		this.notaFiscal = this.criarNota();
	}
	
	public NotaFiscal emitirNota() {
		return this.notaFiscal;
	}
}
