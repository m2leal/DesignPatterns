package com.m2leal.observer.listener;

import java.util.List;

import com.m2leal.observer.model.Pedido;
import com.m2leal.observer.notifier.Notificador;

public class SistemaFaturamentoListener implements Listener{
	
	private Notificador notificador;
	
	public SistemaFaturamentoListener(Notificador notificador) {
		this.notificador = notificador;
		notificador.registrarListener(this);
	}
	
	@Override
	public void notificar() {
		List<Pedido> novosPedidos = this.notificador.getPedidos();
		
		for (Pedido pedido : novosPedidos) {
			System.out.println("Faturando pedido: " + pedido);
		}
	}

}