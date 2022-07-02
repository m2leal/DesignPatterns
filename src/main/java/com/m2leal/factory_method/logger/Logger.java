package com.m2leal.factory_method.logger;

import com.m2leal.factory_method.logprinter.LogPrinter;

public abstract class Logger {
	
	protected abstract LogPrinter createLogger();
	
	public void log(String message) {
		LogPrinter logPrinter = createLogger();
		logPrinter.print(message);
	}
	
}
