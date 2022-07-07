package com.m2leal.observer.notifier;

import java.util.List;

import com.m2leal.observer.listeners.Listener;
import com.m2leal.observer.model.Lancamento;

public interface Notificador {
	
	public void registrarListener(Listener listener); 
	public void removerListener(Listener listener); 
	public void notificarListeners();
	
	public void novosLancamentosVencidos(List<Lancamento> lancamentos);
	public List<Lancamento> getLancamentosVencidos();
	
}
