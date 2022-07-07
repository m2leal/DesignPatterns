package com.m2leal.observer.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.m2leal.observer.model.Lancamento;
import com.m2leal.observer.notifier.Notificador;
import com.m2leal.observer.repository.Lancamentos;

public class LancamentosVencidosJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
		
		Lancamentos lancamentos = (Lancamentos) jobDataMap.get("lancamentos");
		Notificador notificador = (Notificador) jobDataMap.get("notificador");
		
		List<Lancamento> lancamentosVencidos = lancamentos.todosVencidos();
		notificador.novosLancamentosVencidos(lancamentosVencidos);
	}

}