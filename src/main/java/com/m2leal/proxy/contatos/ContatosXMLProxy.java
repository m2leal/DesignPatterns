package com.m2leal.proxy.contatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.m2leal.proxy.repository.Contatos;

public class ContatosXMLProxy implements Contatos {
	
	private ContatosXML contatosXML;
	private List<String> nomesArquivos;
	
	public ContatosXMLProxy(String... nomesArquivos) {
		this.nomesArquivos = new ArrayList<>(Arrays.asList(nomesArquivos));
	}
	
	@Override
	public String buscarPor(String email) {
		Random random = new Random();
		String nome = null;
		
		int quantidadeArquivos = nomesArquivos.size(); 
		for (int i = 0; i < quantidadeArquivos; i++) {
			int indiceParaPesquisa = random.nextInt(nomesArquivos.size());
			
			String nomeArquivo = nomesArquivos.get(indiceParaPesquisa);
			this.contatosXML = new ContatosXML(nomeArquivo);
			
			nome = this.contatosXML.buscarPor(email);
			if(nome != null)
				break;
		}
		
		return nome;
	}

}
