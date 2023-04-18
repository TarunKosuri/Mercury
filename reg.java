package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.apache.log4j.Logger;
public class reg {
public static WebDriver ldriver;
public static Logger logger;
public reg(WebDriver rdriver) {
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement Register;
	
	By FirstName=By.name("firstName");
	By LastName=By.name("lastName");
	By phone=By.name("phone");
	By email=By.name("userName");
	
	By Address=By.name("address1");
	By city=By.name("city");
	By state=By.name("state");
	By postalcode=By.name("postalCode"); 
	By country=By.name("country");
	
	By username=By.name("email");
	By password=By.name("password");
	By confirmPassword=By.name("confirmPassword");
	By submit=By.name("submit");
	
	By user_name=By.name("userName");
	By Pass_word=By.name("password");
	By btnsbmt=By.name("submit");
	
	public void clickRegister() 
	{
		Register.click();
	}
	public  void setFirstname(String fname) 
	{
		ldriver.findElement(FirstName).sendKeys(fname);
	}
	public  void setLastName(String lname) 
	{
		ldriver.findElement(LastName).sendKeys(lname);
	}
	public  void phone(String phonenumber) 
	{
		ldriver.findElement(phone).sendKeys(phonenumber);
	}
	public  void setemail(String mail) 
	{
		ldriver.findElement(email).sendKeys(mail);
	}
	public  void setAddress(String adress) 
	{
		ldriver.findElement(Address).sendKeys(adress);
	}
	public  void setcity(String cities) 
	{
		ldriver.findElement(city).sendKeys(cities);
	}
	public  void setstate(String states)
	{
		ldriver.findElement(state).sendKeys(states);
	}
	public  void setpostalcode(String code) {
		ldriver.findElement(postalcode).sendKeys(code);	
	}
	public  void setcode(String desh) {
		Select drop =new Select(ldriver.findElement(country));
		drop.selectByValue(desh);
	}
	public  void setusername(String u_name) {
		ldriver.findElement(username).sendKeys(u_name);
	}
	public  void password(String Password) {
		ldriver.findElement(password).sendKeys(Password);
	}
	public  void setpass(String confirmpass) {
		ldriver.findElement(confirmPassword).sendKeys(confirmpass);
	}  
	
	public  void clicksubmit() {
		ldriver.findElement(submit).click();
	}	
	public  void enterusername(String name) {
			ldriver.findElement(user_name).sendKeys(name);
	}
	public  void enterpassword(String pwd) {
			ldriver.findElement(Pass_word);  
	}
	public  void submit() {
			ldriver.findElement(btnsbmt).click();
	}
}
