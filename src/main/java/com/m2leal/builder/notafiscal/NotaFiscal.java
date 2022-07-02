package com.m2leal.builder.notafiscal;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public abstract class NotaFiscal {
	
	private String numero;
	private Date dataEmissao;
	private List<Item> itens;
	
	public abstract BigDecimal calculaImposto();
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
}
