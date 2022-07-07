package com.m2leal.observer.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.m2leal.observer.model.Pedido;
import com.m2leal.observer.notifier.Notificador;
import com.m2leal.observer.repository.Pedidos;

public class NovosPedidosJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
		
		Pedidos pedidos = (Pedidos) jobDataMap.get("lancamentos");
		Notificador notificador = (Notificador) jobDataMap.get("notificador");
		
		List<Pedido> novosPedidos = pedidos.todosPedidos();
		notificador.novosPedidos(novosPedidos);
	}
}
