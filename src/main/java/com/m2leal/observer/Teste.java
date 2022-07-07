package com.m2leal.observer;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

import com.m2leal.observer.job.NovosPedidosJob;
import com.m2leal.observer.listener.Listener;
import com.m2leal.observer.listener.ReservaCaminhaoListener;
import com.m2leal.observer.listener.SistemaFaturamentoListener;
import com.m2leal.observer.notifier.Notificador;
import com.m2leal.observer.notifier.NotificadorNovosPedidos;
import com.m2leal.observer.repository.Pedidos;

public class Teste {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		Notificador notificador = new NotificadorNovosPedidos();
		
		Listener caminhaoListener = new ReservaCaminhaoListener(notificador);
		Listener faturamentoListener = new SistemaFaturamentoListener(notificador);
		
		JobDataMap jobDataMap = new JobDataMap();
		Pedidos pedidos = new Pedidos();

		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		
		jobDataMap.put("lancamentos", pedidos);
		jobDataMap.put("notificador", notificador);
		
		JobDetail job = newJob(NovosPedidosJob.class)
						.setJobData(jobDataMap)
						.withIdentity("novosPedidosJob", "novosPedidosGroup")
						.build();

		CronTrigger trigger = newTrigger()
				.withIdentity("trigger1", "group1")
				.withSchedule(cronSchedule("0 * * * * ?"))
		        .build();

		scheduler.scheduleJob(job, trigger);

		scheduler.start();

		Thread.sleep(220000);

		scheduler.shutdown(true);
	}
}
