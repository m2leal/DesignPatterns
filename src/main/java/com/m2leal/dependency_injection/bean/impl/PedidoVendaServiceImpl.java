package com.m2leal.dependency_injection.bean.impl;

import java.math.BigDecimal;
import java.util.Date;

import javax.inject.Inject;

import com.m2leal.dependency_injection.bean.CalculadoraImposto;
import com.m2leal.dependency_injection.bean.PedidoVendaService;
import com.m2leal.dependency_injection.model.PedidoVenda;
import com.m2leal.dependency_injection.repository.PedidosVendas;

public class PedidoVendaServiceImpl implements PedidoVendaService {
	
	@Inject
	private PedidosVendas pedidosVendas;
	
	@Inject
	private CalculadoraImposto calculadoraImposto;
	
	@Override
	public void salvar(PedidoVenda pedidoVenda) {
		pedidoVenda.setData(new Date());
		
		BigDecimal imposto = calculadoraImposto.calcular(pedidoVenda.getValor());
		pedidoVenda.setImposto(imposto);
		
		pedidosVendas.salvar(pedidoVenda);
	}

}
