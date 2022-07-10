package com.m2leal.decorator.agenda;

import com.m2leal.decorator.model.Contato;

public interface Agenda {
	
	public void inserir(Contato contato);
	public Contato buscar(int codigo);
	
}
