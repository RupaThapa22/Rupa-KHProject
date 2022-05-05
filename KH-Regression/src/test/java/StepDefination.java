

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.BannersFilterPage;
import Pages.BannersListViewPage;
import Pages.BannersPage;
import Pages.HomePage;
import Utilities.PageUtilities;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	WebDriver driver;
	HomePage homePage;
	BannersPage bannersPage;
	BannersFilterPage bannersFilterPage;
	BannersListViewPage bannersListViewPage;
	
	
	@Before
	public void start () {
		driver = TestRunner.driver;
		homePage = new HomePage(driver);
		bannersPage = new BannersPage(driver);
		bannersFilterPage = new BannersFilterPage(driver);
		bannersListViewPage = new BannersListViewPage(driver);
		
	}

		@Given("Admin is in landing page")
		public void admin_is_in_landing_page() {
		Assert.assertTrue(driver.findElement((By.xpath("//input[@name='username']"))).isDisplayed());
		}
		
		@When("he login as valid admin user to the application")
		public void he_login_as_valid_admin_user_to_the_application() {
			homePage.AdminLogin();	
		
		}

		@Then("he should see the dashboard")
		public void he_should_see_the_dashboard() {
			Assert.assertTrue(driver.findElement((By.className("sidebar-toggle"))).isDisplayed());	 
		}
		@Then("he should logout")
		public void he_should_logout() {
			//driver.get("http://karehealth.menpaniproducts.com/admin/auth/logout");
			driver.navigate().to("http://karehealth.menpaniproducts.com/admin/auth/logout");
		}
		
		
//1. Filter Bannner List with ID		
		
		@Given("he is on home banner list page")
		public void he_is_on_home_banner_list_page() {
			homePage.AdminLogin();
			bannersPage.NavigateToHomeBannersPage();
		}
		@When("he click on filter")
		public void he_click_on_filter() {
			bannersFilterPage.FilterWithID();  
		}
		@When("enter the valid ID")
		public void enter_the_valid_id() {
			driver.findElement(By.name("id")).sendKeys("2");
		}
		@Then("he is displayed with valid ID banner list")
		public void he_is_displayed_with_valid_id_banner_list() {
			driver.findElement(By.xpath("//button[contains (text(),'Search')]"));  
		
		}
		
	
//2. Banners list view with Id only
	  
		@Given("Admin is on Banners Home Page")
		public void admin_is_on_banners_home_page() {
		    homePage.AdminLogin();
		    bannersPage.NavigateToHomeBannersPage();
		}
		
		@When("he click on table icon")
		public void he_click_on_table_icon() {
			PageUtilities.TableIcon(driver);
		}

		@When("select Id")
		public void select_id() {
			bannersListViewPage.BannersListViewWithId();
		}

		@Then("he should see Banner list with Id only")
		public void he_should_see_banner_list_with_id_only() {
		    PageUtilities.Submit(driver);
		}
	 
	  
//3. Banners list view with Banners only
	  
		@When("select Banners")
		public void select_banners() {
		    bannersListViewPage.BannersListViewWithBanners();
		}

		@Then("he should see Banner list with Banners only")
		public void he_should_see_banner_list_with_banners_only() {
		    PageUtilities.Submit(driver);
		}
	  
	  
//4. Banners list view with Status only
		@When("select Status")
		public void select_status() {
		    bannersListViewPage.BannersListViewWithStatus();
		}

		@Then("he should see Banner list with Status only")
		public void he_should_see_banner_list_with_status_only() {
		   PageUtilities.Submit(driver);
		}
	 
	  
//5. Banners list view with all
		@When("select all")
		public void select_all() {
		   bannersListViewPage.BannersListViewWithAll();
		}

		@Then("he should see Banner list with all columns")
		public void he_should_see_banner_list_with_all_columns() {
		    PageUtilities.Submit(driver);
		}
	  
	  
	  
//6. Sellect all Banner list
	  
	  }
	 
	  
	  
	  
	  
	 