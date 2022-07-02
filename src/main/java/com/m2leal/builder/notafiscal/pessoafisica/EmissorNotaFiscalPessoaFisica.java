package com.m2leal.builder.notafiscal.pessoafisica;

import com.m2leal.builder.emissor.EmissorNotaFiscal;
import com.m2leal.builder.notafiscal.NotaFiscal;

public class EmissorNotaFiscalPessoaFisica extends EmissorNotaFiscal {

	@Override
	protected NotaFiscal criarNota() {
		return new NotaFiscalPessoaFisica();
	}
	
}
