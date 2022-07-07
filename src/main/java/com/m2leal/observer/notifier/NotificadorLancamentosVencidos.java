package com.m2leal.observer.notifier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.m2leal.observer.listeners.Listener;
import com.m2leal.observer.model.Lancamento;

public class NotificadorLancamentosVencidos implements Notificador {
	
	Set<Listener> listeners;
	List<Lancamento> lancamentosVencidos;
	
	public NotificadorLancamentosVencidos() {
		this.listeners = new HashSet<>();
	}
	
	@Override
	public void registrarListener(Listener listener) {
		this.listeners.add(listener);
	}

	@Override
	public void removerListener(Listener listener) {
		this.listeners.remove(listener);
	}

	@Override
	public void notificarListeners() {
		listeners.forEach(listener -> listener.atualizar());
	}

	@Override
	public void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos) {
		this.lancamentosVencidos = lancamentosVencidos;
		this.notificarListeners();
	}

	@Override
	public List<Lancamento> getLancamentosVencidos() {
		return this.lancamentosVencidos;
	}

}
