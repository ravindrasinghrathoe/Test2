package Com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
//std rule: To provide Test data & object related to whole application
	public WebDriver driver;
	//--- Testdata
	// DT var vv
	public String url="http://183.82.103.245/nareshit/login.php";
	public String username="nareshit";
	public String password="nareshit";
	public String First_Name="Ravindra";
	public String Last_Name="Rathor";
	public String photo_Path="D:\\Automation\\userphoto.png";
	public String txt_code_no="2932";
	public String Edit_firstname="Ravindra";
	public String Edit_Lastname="singh";
	public String Select_value="1702";
	// ---object /elements
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_Logout="Logout";
	public String add_button_xpath="//input[@value='Add']";
	public String firstn_textbox_byname="txtEmpFirstName";
	public String lastn_textbox_byname ="txtEmpLastName";
	public String photo_xpath="//input[@type='file'][@name='photofile'][@id='photofile']";
	public String Save_button_byclass ="savebutton";
	public String Edit_button_byname="EditMain";
	public String txt_code_byname="txtEmployeeId";
	public String txt_EditLastname_byname="txtEmpFirstName";
	public String txt_EditFirstname_byname="txtEmpLastName";
	public String EditSave_btn_byname="EditMain";
	public String Back_button_xpath="//input[@value='Back'][@type='button']";
	public String empId_selectbyname="loc_code";
	public String Enter_searchbyname="loc_name";
	public String Search_btn="//input[@value='Search']";
	public String Select_checkbox_btn="chkLocID[]";//name
	public String Delete_btn_xpath="//input[@value='Delete']";
	public String emp_id="0";
}
