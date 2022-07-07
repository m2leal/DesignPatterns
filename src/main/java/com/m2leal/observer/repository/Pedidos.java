package com.m2leal.observer.repository;

import java.net.URL;
import java.util.List;

import com.m2leal.observer.model.Pedido;
import com.thoughtworks.xstream.XStream;

public class Pedidos {
	
	@SuppressWarnings("unchecked")
	public List<Pedido> todosPedidos() {
		XStream xstream = new XStream();
		xstream.alias("pedidos", List.class);
		xstream.alias("pedido", Pedido.class);

		URL arquivo = this.getClass().getResource("/pedidos.xml");
		
		return (List<Pedido>)xstream.fromXML(arquivo);
	}
	
	public static void main(String[] args) {
		Pedidos repositorio = new Pedidos();
		List<Pedido> pedidos = repositorio.todosPedidos();
		pedidos.forEach(p -> System.out.println(p));
	}
	
}
