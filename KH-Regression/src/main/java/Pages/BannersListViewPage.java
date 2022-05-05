package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BannersListViewPage extends BasePage {

	public BannersListViewPage(WebDriver driver) {
		super(driver);
		
	}

public void BannersListViewWithId() {
	
	driver.findElement(By.xpath("(//div[@class='icheckbox_minimal-blue checked'])[2]")).click();
	driver.findElement(By.xpath("(//li[@class='checkbox icheck'])[3]")).click();
	
}
public void BannersListViewWithBanners() {
	
	driver.findElement(By.xpath("(//div[@class='icheckbox_minimal-blue checked'])[1]")).click();
	driver.findElement(By.xpath("(//li[@class='checkbox icheck'])[3]")).click(); 
	
}
public void BannersListViewWithStatus() {
	
	driver.findElement(By.xpath("(//div[@class='icheckbox_minimal-blue checked'])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='icheckbox_minimal-blue checked'])[2]")).click(); 
	
}
public void BannersListViewWithAll() {
	
	driver.findElement(By.xpath("//button[contains(text(),'All')]")).click();
	
}
}
