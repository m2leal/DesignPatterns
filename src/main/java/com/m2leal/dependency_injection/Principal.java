package com.m2leal.dependency_injection;

import java.math.BigDecimal;

import com.m2leal.dependency_injection.bean.PedidoVendaService;
import com.m2leal.dependency_injection.model.PedidoVenda;
import com.m2leal.dependency_injection.util.cdi.WeldContext;

public class Principal {
	
	public static void main(String[] args) {
		PedidoVendaService service = WeldContext.INSTANCE.getBean(PedidoVendaService.class);
		PedidoVenda pedidoVenda = new PedidoVenda("sabonete", new BigDecimal("3.00"));
		
		service.salvar(pedidoVenda);
	}
	
}
