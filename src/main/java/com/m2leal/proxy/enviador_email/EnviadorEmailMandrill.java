package com.m2leal.proxy.enviador_email;

import java.util.List;

public class EnviadorEmailMandrill implements EnviadorEmail {
	
	private List<String> emails;
	
	public EnviadorEmailMandrill(List<String> emails) {
		this.emails = emails;
	}
	
	@Override
	public void enviar(String mensagem) {
		emails.forEach(email -> System.out.println("Enviando email para " + email + " com mensagem: " + mensagem));
	}

}
