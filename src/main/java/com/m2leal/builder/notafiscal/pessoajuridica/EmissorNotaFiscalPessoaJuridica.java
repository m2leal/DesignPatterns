package com.m2leal.builder.notafiscal.pessoajuridica;

import com.m2leal.builder.emissor.EmissorNotaFiscal;
import com.m2leal.builder.notafiscal.NotaFiscal;

public class EmissorNotaFiscalPessoaJuridica extends EmissorNotaFiscal {

	@Override
	protected NotaFiscal criarNota() {
		return new NotaFiscalPessoaJuridica();
	}
	
}
