package com.m2leal.proxy;

import com.m2leal.proxy.contatos.ContatosXMLProxy;

public class Teste {
	public static void main(String[] args) {
		ContatosXMLProxy proxy = new ContatosXMLProxy("contatos1.xml","contatos2.xml");
		String nome = proxy.buscarPor("jose@email.com");
		System.out.println(nome);
	}
}
