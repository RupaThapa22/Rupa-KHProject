package Pages;

import org.openqa.selenium.WebDriver;

public class BannersPage extends BasePage{
	public String currentURL = "http://karehealth.menpaniproducts.com/admin/home-banners";

	public BannersPage(WebDriver driver) {
		super(driver);
		
	}
public void NavigateToHomeBannersPage() {
	driver.get(currentURL);
}

}
