package ScrollLevel;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base1Package.Base1;

public class AddCource extends Base1 {
	
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchicon;
	
	@FindBy(xpath = "//*[@id=\"search-form\"]/div[2]/a")
	WebElement alllink;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/section/div/ul/li[2]/a/div")
	WebElement course1;

	@FindBy(xpath = "//*[@id=\"search-form\"]/div/label/input")
	WebElement searchnew;
	
	// Initializing the Page Objects:
	public AddCource() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void course(String course) {
		
		searchicon.click();
		searchicon.sendKeys(course);
		searchicon.sendKeys(Keys.chord(Keys.ENTER));
		alllink.click();
		course1.click();
		b.back();
	
		
	}
}
