package com.m2leal.dependency_injection.repository.xml;

import java.io.FileOutputStream;
import java.io.OutputStream;

import com.m2leal.dependency_injection.model.PedidoVenda;
import com.m2leal.dependency_injection.repository.PedidosVendas;
import com.thoughtworks.xstream.XStream;

public class XMLPedidosVendasRepository implements PedidosVendas {

	@Override
	public void salvar(PedidoVenda pedidoVenda) {
		XStream xstream = new XStream();
		xstream.alias("pedido-venda", PedidosVendas.class);
		OutputStream out = null;
		try {
			out = new FileOutputStream(pedidoVenda.getDescricao() + ".xml");
			xstream.toXML(pedidoVenda, out);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao salvar arquivo", e);
		}
	}
	
}
