package com.m2leal.factory_method.contato.csv;

import com.m2leal.factory_method.contato.Contatos;
import com.m2leal.factory_method.mala_direta.MalaDireta;

public class MalaDiretaCSV extends MalaDireta {
	
	private String nomeArquivo;
	
	public MalaDiretaCSV(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	protected Contatos criarContatos() {
		return new ContatosCSV(nomeArquivo);
	}
	
}
