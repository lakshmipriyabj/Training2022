package com.example;

import java.io.IOException;
import java.util.logging.*;
import java.util.logging.Logger;

public class LogToFile {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(LogToFile.class.getName());
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log");
			log.addHandler(handler);
			log.info("Try Block Called");
			throw new RuntimeException("k a great person");
			
			
		} catch (SecurityException e) {
			log.warning(e.getMessage());
		
			
			
		} catch (IOException e) {
			log.warning(e.getMessage());
		}
		 catch (Exception e) {
				log.warning(e.getMessage());
			}
	
		
		
				

	}

}
