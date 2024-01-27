package Com.hrms.Utility;

import org.apache.log4j.Logger;


public class Log {
	// inifinalize Log4j.Logger;
	  private static Logger Log = Logger.getLogger(Log.class.getName());
	// Need to create these methods so that they can be called 
	public static void info(String Message) {
		Log.info(Message);
	}

}
