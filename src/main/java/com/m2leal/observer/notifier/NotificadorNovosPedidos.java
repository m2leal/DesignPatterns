package com.m2leal.observer.notifier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.m2leal.observer.listener.Listener;
import com.m2leal.observer.model.Pedido;

public class NotificadorNovosPedidos implements Notificador {

	Set<Listener> listeners;
	List<Pedido> novosPedidos;

	public NotificadorNovosPedidos() {
		this.listeners = new HashSet<>();
	}

	@Override
	public void registrarListener(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void removerListener(Listener listener) {
		listeners.remove(listener);
	}

	@Override
	public void notificarListeners() {
		listeners.forEach(listener -> listener.notificar());
	}

	@Override
	public void novosPedidos(List<Pedido> novosPedidos) {
		this.novosPedidos = novosPedidos;
		this.notificarListeners();
	}

	@Override
	public List<Pedido> getPedidos() {
		return this.novosPedidos;
	}

}
