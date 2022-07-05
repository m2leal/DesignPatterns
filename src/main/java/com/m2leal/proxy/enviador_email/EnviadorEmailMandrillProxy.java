package com.m2leal.proxy.enviador_email;

import java.util.List;

import com.m2leal.proxy.cliente.Cliente;
import com.thoughtworks.xstream.XStream;

public class EnviadorEmailMandrillProxy implements EnviadorEmail {

	private List<String> emails;

	public EnviadorEmailMandrillProxy(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public void enviar(String mensagem) {
		EnviadorEmail enviadorEmail = new EnviadorEmailMandrill(emails);
		enviadorEmail.enviar(mensagem);
	}

	@SuppressWarnings("unchecked")
	public void carregarBlackList() {
		XStream xstream = new XStream();
		xstream.alias("clientes", List.class);
		xstream.alias("cliente", Cliente.class);

		System.out.println("Carregando blacklist");
		List<Cliente> clientesCarregados = (List<Cliente>) xstream.fromXML(this.getClass().getResource("/lista_negra.xml"));
		for (Cliente cliente : clientesCarregados) {
			String emailBlackList = cliente.getEmail();
			
			for (int i = 0; i < emails.size(); i++) {
				if(emails.get(i).equals(emailBlackList))
				{
					System.out.println(emailBlackList + " na blacklist, removendo da lista de envios.");
					emails.remove(i);
					break;
				}
			}
		}
	}

}
