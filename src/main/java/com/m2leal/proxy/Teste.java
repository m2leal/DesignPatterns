package com.m2leal.proxy;

import java.util.ArrayList;
import java.util.List;

import com.m2leal.proxy.enviador_email.EnviadorEmail;
import com.m2leal.proxy.enviador_email.EnviadorEmailMandrillProxy;

public class Teste {
	
	public static void main(String[] args) {
		List<String> emails = new ArrayList<>();
		
		emails.add("jose@email.com");
		emails.add("renata@email.com");
		emails.add("mauricio@email.com");
		emails.add("sara@email.com");
		emails.add("roberto@email.com");
		emails.add("julio@email.com");
		
		EnviadorEmail enviadorEmail = new EnviadorEmailMandrillProxy(emails);
		((EnviadorEmailMandrillProxy)enviadorEmail).carregarBlackList();
		enviadorEmail.enviar("Prefiro compartilhar uma vida com você a encarar sozinha todas as Eras deste mundo. [Arwen]");
	}
	
}
