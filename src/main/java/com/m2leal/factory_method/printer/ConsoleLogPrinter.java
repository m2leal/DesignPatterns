package com.m2leal.factory_method.printer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.m2leal.factory_method.logprinter.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {

	@Override
	public void print(String message) {
		Date date = new Date();
		DateFormat formatador = new SimpleDateFormat("[dd/MM/yyyy HH:mm:ss] : ");
		String str = formatador.format(date);
		
		System.out.println(str + message);
	}

}
