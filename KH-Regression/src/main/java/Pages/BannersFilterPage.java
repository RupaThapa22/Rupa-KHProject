package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BannersFilterPage extends BasePage{
	
	

	public BannersFilterPage(WebDriver driver) {
		super(driver);
		
	}
	public void FilterWithID() {
		driver.findElement(By.xpath("//span[contains(text(),'Filter')]")).click();
	}

}
