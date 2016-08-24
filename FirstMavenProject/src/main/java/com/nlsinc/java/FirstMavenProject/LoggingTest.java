package com.nlsinc.java.FirstMavenProject;

import org.apache.log4j.Logger;

public class LoggingTest {
	
	final static Logger logger =Logger.getLogger(LoggingTest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		logger.debug("main method starting");
		int a=10; int b=20;
		
		a=a*b;
		a=b-a;
		b=b*a*9;
		logger.debug("main method at line 14");
		logger.debug(a);
		a=a*b/3;
		b=b*5;
		a=10/0;
		logger.info(b);
		
		logger.debug("main method end");
		
		}
		catch(Exception e){
			logger.error(e);
		}
	}

}
