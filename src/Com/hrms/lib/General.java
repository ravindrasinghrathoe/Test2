package Com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import Com.hrms.Utility.Log;
public class General extends Global {
	// std rule:To provide all re-usable fun:/ methods: related to whole application
	public void openApplication() {
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");//console
		Reporter.log("Application opened");//html report
		Log.info("Application opened");// logfile
	}

	public void closeApplication() {
		driver.quit();
		System.out.println("application closed");
		Reporter.log("Application closed");
		Log.info("Application Closed");
	}

	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Successfully");
		Reporter.log("Login Successfully");
		Log.info("Login Successfully");
	}

	public void logout() {
		driver.findElement(By.linkText(link_Logout)).click();
		System.out.println("Logout Successfully");
		Reporter.log("Logoot Successfully");
		Log.info("Logout Successfully");
	}
	public void Enter_Frame() {
		driver.switchTo().frame("rightMenu");
		System.out.println("Enter Frame Successfully");
		Reporter.log("Enter into frame successfully");
		Log.info("Enter into frame successfully");
	}
	public void Exit_frame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit Frame Successfully");
		Reporter.log("Exit frame Successfully");
		Log.info("Exit frame Successfully");
	}
	public void Add_Employee() {
		driver.findElement(By.xpath(add_button_xpath)).click();
		
		driver.findElement(By.name(lastn_textbox_byname)).sendKeys(Last_Name);
		driver.findElement(By.name(firstn_textbox_byname)).sendKeys(First_Name);
		driver.findElement(By.xpath(photo_xpath)).sendKeys(photo_Path);
		driver.findElement(By.className(Save_button_byclass)).click();
		System.out.println("Add Employee Successfully");
		Reporter.log("Add Employee Successfully");
		Log.info("Add Employee Successfully");
	}
	public void EditEmp() {
		
		driver.findElement(By.name(Edit_button_byname)).click();
		//driver.findElement(By.name(txt_code_byname)).clear();
		//driver.findElement(By.name(txt_code_byname)).sendKeys(txt_code_no);
		driver.findElement(By.name(txt_EditFirstname_byname)).clear();
		driver.findElement(By.name(txt_EditFirstname_byname)).sendKeys(Edit_firstname);
		driver.findElement(By.name(txt_EditLastname_byname)).clear();
		driver.findElement(By.name(txt_EditLastname_byname)).sendKeys(Edit_Lastname);
		driver.findElement(By.name(EditSave_btn_byname)).click();
		System.out.println("EditEmployee Successfully");
		Reporter.log("EditEmployee Successfully");
		Log.info("Add Employee Successfully");
	}
	public void BackBtn() {
		driver.findElement(By.xpath(Back_button_xpath)).click();
		
	}
	public void DeleteEMp() {
		driver.switchTo().frame("rightMenu");
		Select sc =new Select(driver.findElement(By.name(empId_selectbyname)));
		sc.selectByValue(emp_id);
		driver.findElement(By.name(Enter_searchbyname)).sendKeys(Select_value);
		driver.findElement(By.xpath(Search_btn)).click();
		driver.findElement(By.name(Select_checkbox_btn)).click();
		driver.findElement(By.xpath(Delete_btn_xpath)).click();
		System.out.println("Delete Employee Successful");
		Reporter.log("Delete Employee Successful");
		Log.info("Delete Employee Successful");
		driver.switchTo().defaultContent();
	}
}
