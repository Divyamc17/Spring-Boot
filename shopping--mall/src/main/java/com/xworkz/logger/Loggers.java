package com.xworkz.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Loggers {
	
private static final Logger logger;
	
	
	public static Logger getLogger() {
		return logger;
		
	}
	
	
	static {
		logger= Logger.getLogger(Loggers.class.getName());
		try {
			Handler fileHandler = new FileHandler("F:\\log.log", true);
			Handler consoleHandler = new ConsoleHandler();
			
			logger.addHandler(consoleHandler);
			logger.addHandler(fileHandler);
			SimpleFormatter simpleFormatter = new SimpleFormatter();
			fileHandler.setFormatter(simpleFormatter);
			
			consoleHandler.setLevel(Level.ALL);
			fileHandler.setLevel(Level.ALL);
			logger.setLevel(Level.ALL);
			logger.config("Configuration done");
			
			logger.removeHandler(consoleHandler);
			logger.log(Level.ALL,"Finer logged");
			
		}catch (IOException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, "Error Occured in fileHandler",e);
		}
		logger.finer("Logger Handler Completed");
	}

}
