
package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
	
	public static void main(String[] args)
	{
		Logger log = Logger.getLogger("com.example.Application"); //package.classname
		log.setLevel(Level.ALL);
		log.info("Info Message"); //System.out.println("Info Message");
		log.warning("Warning Message+++++");
		log.severe("Severe Message");
		log.fine("Fine Message");
		
	}

}