package com.m2leal.dependency_injection.repository.xml;

import java.io.FileOutputStream;
import java.io.OutputStream;

import com.m2leal.dependency_injection.model.Filme;
import com.m2leal.dependency_injection.repository.Filmes;
import com.thoughtworks.xstream.XStream;

public class XMLFilmesRepository implements Filmes {

	@Override
	public void salvar(Filme filme) {
		XStream xstream = new XStream();
		xstream.alias("filme", Filme.class);
		OutputStream out = null;
		
		try {
			out = new FileOutputStream(filme.getNome() + ".xml");
			xstream.toXML(filme, out);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao salvar arquivo", e);
		}
	}

}
