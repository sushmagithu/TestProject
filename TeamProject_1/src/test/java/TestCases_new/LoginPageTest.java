package TestCases_new;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base1Package.Base1;
import HomeLevel.LoginPageNew;

public class LoginPageTest extends Base1 {
		public LoginPageNew lp;
		
		public LoginPageTest() throws IOException {
			super();
		}
		
		@BeforeMethod 
		public void SSSetUp() throws IOException, InterruptedException {
		
		
			
			lp=new LoginPageNew();	
		}
		@Test
		public void validateLogin() throws IOException
		{
			lp.login22(prop.getProperty("username"), prop.getProperty("password"));
		
		}
	}

