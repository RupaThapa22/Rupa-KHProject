package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Constants;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
public void AdminLogin() {
	driver.findElement(By.name("username")).sendKeys(Constants.USERNAME);
	driver.findElement(By.name("password")).sendKeys(Constants.PASSWORD);
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
}
}
