package com.m2leal.factory_method.creator;

import com.m2leal.factory_method.logger.Logger;
import com.m2leal.factory_method.logprinter.LogPrinter;
import com.m2leal.factory_method.printer.ConsoleLogPrinter;

public class ConsoleLogCreator extends Logger {

	@Override
	protected LogPrinter createLogger() {
		return new ConsoleLogPrinter();
	}

}
