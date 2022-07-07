package com.m2leal.observer.listeners;

import java.util.List;

import com.m2leal.observer.model.Lancamento;
import com.m2leal.observer.notifier.Notificador;

public class EmailListener implements Listener {
	
	private Notificador notificador;
	
	public EmailListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}

	@Override
	public void atualizar() {
		List<Lancamento> lancamentosVencidos = this.notificador.getLancamentosVencidos();
		
		for (Lancamento lancamento : lancamentosVencidos) {
			System.out.println("Enviando email para: " + lancamento.getPessoa().getEmail());
		}
	}
	
}
