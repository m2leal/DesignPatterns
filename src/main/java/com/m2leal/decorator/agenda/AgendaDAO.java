package com.m2leal.decorator.agenda;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.m2leal.decorator.model.Contato;
import com.thoughtworks.xstream.XStream;

public class AgendaDAO implements Agenda {
	
	@Override
	public void inserir(Contato contato) {
		XStream xstream = new XStream();
		xstream.alias("contato", Contato.class);
		OutputStream out = null;
		try {
			out = new FileOutputStream("contatos/" + contato.getCodigo() + ".xml");
			xstream.toXML(contato, out);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao salvar arquivo", e);
		}
	}
	
	@Override
	public Contato buscar(int codigo) {
		XStream xstream = new XStream();
		xstream.alias("contato", Contato.class);
		
		File arquivo = new File("contatos/" + codigo + ".xml");
		
		try {
			Contato contato = (Contato) xstream.fromXML(arquivo);
			return contato;
		} catch (Exception e) {
			return null;
		}
	}
}
