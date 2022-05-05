package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageUtilities {
	

public static void TableIcon(WebDriver driver) {
	driver.findElement(By.xpath("//button[@class='btn btn-sm btn-instagram dropdown-toggle']")).click();
}
public static void Submit(WebDriver driver) {
	driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
}

}