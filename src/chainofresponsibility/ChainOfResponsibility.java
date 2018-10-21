package chainofresponsibility;

import java.awt.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class ChainOfResponsibility {
	
	
	
	public static void main(String[] args) {
		ErrorLogger e=  new ErrorLogger();
		e.setNextLogger(new FileLogger());
		e.logMessage("tp");
		
	}
	
}

abstract class Logger {
	Logger nextLogger;
	
	public void setNextLogger(Logger next)
	{
		nextLogger = next;
	}
	
	public void logMessage(String m)
	{
		System.out.println(m + " from  " + this.getClass().toString());
		
		if(nextLogger != null)
			nextLogger.logMessage(m);
	}
}

class ErrorLogger extends Logger {
}

class FileLogger extends Logger {
}
