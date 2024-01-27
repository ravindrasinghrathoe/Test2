package Com.hrms.testScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.General;

public class TC003_EditEMP {
	//public static void main(String[] args) throws Exception {
	
	     @Test
	     public void tc003()throws Exception {
		//Test Steps
	    	 DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		Thread.sleep(3000);
		obj.login();
		Thread.sleep(3000);
		obj.Enter_Frame();
    Thread.sleep(3000);
		obj.Add_Employee();
		Thread.sleep(3000);
		obj.Exit_frame();
		Thread.sleep(3000);
		obj.Enter_Frame();
		Thread.sleep(3000);
		obj.EditEmp();
		Thread.sleep(3000);
		obj.Exit_frame();
		Thread.sleep(3000);
		
		obj.logout();
		Thread.sleep(3000);
        obj.closeApplication();
      
	}

}
