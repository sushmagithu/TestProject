package TestCases_new;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base1Package.Base1;
import ScrollLevel.AddCource;


public class TestCase_003 extends Base1 {

	public AddCource sp;

	public TestCase_003() throws IOException {
		super();
	}

	@BeforeMethod
	public void SetUp1() throws IOException, InterruptedException {

		
		sp = new AddCource();
	}

	@Test
	public void scrollTo() throws IOException {

		sp.course(prop.getProperty("allcourse"));

	}
	@AfterSuite
	public void afterSuite() {
	driver.close();
	}
}
