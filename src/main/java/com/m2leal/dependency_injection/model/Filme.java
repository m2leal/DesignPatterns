package com.m2leal.dependency_injection.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Filme {

	private String nome;
	private Date dataLancamento;
	private Tipo tipo;

	public Filme(String nome, Date dataLancamento) {
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		
		Calendar tresDiasAtras = new GregorianCalendar();
		tresDiasAtras.setTime(new Date());
		tresDiasAtras.add(Calendar.DAY_OF_WEEK, -3);
		
		Calendar dtLancamento = new GregorianCalendar();
		dtLancamento.setTime(dataLancamento);
		
		if(dtLancamento.before(tresDiasAtras))
			tipo = Tipo.ANTIGO;
		else tipo = Tipo.NOVO;
		
	}

	public String getNome() {
		return nome;
	}

	public Date getDataLançamento() {
		return dataLancamento;
	}

	public Tipo getTipo() {
		return tipo;
	}

}
