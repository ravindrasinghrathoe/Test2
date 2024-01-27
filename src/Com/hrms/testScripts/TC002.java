package Com.hrms.testScripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.*;
public class TC002 {
	//public static void main(String[] args) throws Exception {
	@Test 
	public void tc002()throws Exception {
		// Test Steps
		DOMConfigurator.configure("log4j.xml");
		General driver = new General();
		driver.openApplication();
		Thread.sleep(3000);
		driver.login();
		Thread.sleep(3000);
		driver.Enter_Frame();
		Thread.sleep(3000);
		driver.Add_Employee();
		Thread.sleep(3000);
		driver.Exit_frame();
		Thread.sleep(3000);
		driver.logout();
		Thread.sleep(3000);
		driver.closeApplication();
		Thread.sleep(3000);
	}

}
