package com.m2leal.factory_method.contato.xml;

import com.m2leal.factory_method.contato.Contatos;
import com.m2leal.factory_method.mala_direta.MalaDireta;

public class MalaDiretaXML extends MalaDireta {
	
	private String nomeArquivo;
	
	public MalaDiretaXML(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	protected Contatos criarContatos() {
		return new ContatosXML(nomeArquivo);
	}
}
