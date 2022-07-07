package com.m2leal.observer.notifier;

import java.util.List;

import com.m2leal.observer.listener.Listener;
import com.m2leal.observer.model.Pedido;

public interface Notificador {
	
	public void registrarListener(Listener listener); 
	public void removerListener(Listener listener); 
	public void notificarListeners();
	
	public void novosPedidos(List<Pedido> pedidos);
	public List<Pedido> getPedidos();
	
}
