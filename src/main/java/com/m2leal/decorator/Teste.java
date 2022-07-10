package com.m2leal.decorator;

import com.m2leal.decorator.agenda.AgendaDAO;
import com.m2leal.decorator.agenda.CacheAgendaDAO;
import com.m2leal.decorator.model.Contato;

public class Teste {
	
	public static void main(String[] args) {
		CacheAgendaDAO cache = new CacheAgendaDAO(new AgendaDAO());
		
		Contato c1 = new Contato("Márcio Moura Leal", "99999-9999");
		c1.setCodigo(1);
		
		Contato c2 = new Contato("João da Silva", "99999-8888");
		c2.setCodigo(2);
		
		Contato c3 = new Contato("M2Leal", "99999-7777");
		c3.setCodigo(3);
		
		cache.inserir(c1);
		cache.inserir(c2);
		cache.inserir(c3);
		
		cache.flush();
	}
	
}
