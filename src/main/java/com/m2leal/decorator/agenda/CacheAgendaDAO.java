package com.m2leal.decorator.agenda;

import java.util.HashMap;
import java.util.Map;

import com.m2leal.decorator.model.Contato;

public class CacheAgendaDAO implements Agenda {
	
	private Map<Integer, Contato> contatos;
	private AgendaDAO agendaDAO;
	
	public CacheAgendaDAO(AgendaDAO agendaDAO) {
		this.agendaDAO = agendaDAO;
		this.contatos = new HashMap<>();
	}
	
	@Override
	public void inserir(Contato contato) {
		contatos.put(contato.getCodigo(), contato);
	}

	@Override
	public Contato buscar(int codigo) {
		return contatos.get(codigo);
	}
	
	public void flush() {
		contatos.forEach((chave, contato) -> agendaDAO.inserir(contato));
	}
	
}
