package com.m2leal.factory_method;

import javax.swing.JOptionPane;

import com.m2leal.factory_method.contato.csv.MalaDiretaCSV;
import com.m2leal.factory_method.contato.xml.MalaDiretaXML;
import com.m2leal.factory_method.mala_direta.MalaDireta;

public class RelacionamentoCliente {
	
	public static void main(String[] args) {
		MalaDireta malaDireta = null;
		String mensagem = null;
		boolean status;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>> CSV <<<<<<<<<<<<<<<<<<<<");
		malaDireta = new MalaDiretaCSV("FactoryMethod/contatos.csv");
		mensagem = JOptionPane.showInputDialog(null, "CSV - Digite a mensagem do email");
		status = malaDireta.enviarEmail(mensagem);
		System.out.println(status);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>> XML <<<<<<<<<<<<<<<<<<<<");
		malaDireta = new MalaDiretaXML("FactoryMethod/contatos.xml");
		mensagem = JOptionPane.showInputDialog(null, "XML - Digite a mensagem do email");
		status = malaDireta.enviarEmail(mensagem);
		System.out.println(status);
	}
	
}
