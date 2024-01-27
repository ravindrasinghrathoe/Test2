package Com.hrms.testScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.General;

public class TC001 {
	//public static void main(String[] args) {
	@Test 
	public void tc001() {

		//Test steps
	DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}

}
