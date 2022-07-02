package com.m2leal.builder;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.m2leal.builder.notafiscal.Item;
import com.m2leal.builder.notafiscal.NotaFiscal;
import com.m2leal.builder.notafiscal.pessoafisica.NotaFiscalPessoaFisica;
import com.m2leal.builder.notafiscal.pessoajuridica.NotaFiscalPessoaJuridica;

public class NotaFiscalBuilder {
	
	private NotaFiscal instancia;
	
	public NotaFiscalBuilder(Character tipoNota){
		if(tipoNota.equals('F') || tipoNota.equals('f'))
			instancia = new NotaFiscalPessoaFisica();
		else if(tipoNota.equals('J') || tipoNota.equals('j'))
			instancia = new NotaFiscalPessoaJuridica();
		else throw new IllegalArgumentException("Tipo de nota inválido: F para Física e J para Juridica...");
	}
	
	public NotaFiscalBuilder comNumero(String numero) {
		this.instancia.setNumero(numero);
		return this;
	}
	
	public NotaFiscalBuilder comDataEmissao(String dataEmissao) {
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Date data = formatador.parse(dataEmissao);
			this.instancia.setDataEmissao(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return this;
	}
	
	public NotaFiscalBuilder comItem(String nome, Integer quantidade, String valorUnitario) {
		if(this.instancia.getItens() == null)
			this.instancia.setItens(new ArrayList<Item>());
		
		Item item = new Item();
		item.setNome(nome);
		item.setQuantidade(quantidade);
		item.setValorUnitario(new BigDecimal(valorUnitario));
		
		this.instancia.getItens().add(item);
		
		return this;
	}
	
	public NotaFiscal construir() {
		return this.instancia;
	}
	
}
