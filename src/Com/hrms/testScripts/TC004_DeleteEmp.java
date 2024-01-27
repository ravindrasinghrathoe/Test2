package Com.hrms.testScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.General;

public class TC004_DeleteEmp {
//public static void main(String[] args) throws Exception{
	@Test
	public void tc004() throws Exception{
	//Test steps
		DOMConfigurator.configure("log4j.xml");
	General ra=new General();
	ra.openApplication();
	Thread.sleep(3000);
	ra.login();
	Thread.sleep(3000);
	ra.DeleteEMp();
	Thread.sleep(3000);
	ra.logout();
	Thread.sleep(2000);
	ra.closeApplication();
}
}
