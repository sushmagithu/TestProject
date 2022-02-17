package HomeLevel;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base1Package.Base1;

public class LoginPageNew extends Base1 {
		
	    @FindBy(xpath="//*[@id=\"user[email]\"]")
		WebElement username;
		
		@FindBy(xpath="//*[@id=\"user[password]\"]")
		WebElement password;
		
		@FindBy(xpath="//input[@value=\"Sign in\"]")
		WebElement submitbtn;
		

		//Initializing the Page Objects:
		public  LoginPageNew() throws IOException {
		PageFactory.initElements(driver, this);
		}
	
	//Action - validate Login and action on Elements
		public HomePage login22(String name, String pwd) throws IOException{
		
			username.sendKeys(name);
			password.sendKeys(pwd);
			submitbtn.click();
			return new HomePage();
			
		}

}
