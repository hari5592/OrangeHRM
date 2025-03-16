package moduleTest;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.DashboardsPage;
import pageObjects.LoginPage;
import resources.BaseClass;

public class DashboardsTest extends BaseClass {
	public WebDriver driver;
	LoginPage login;
	DashboardsPage dashPage;
   private static Logger Log = LogManager.getLogger(BaseClass.class.getName());
	
@BeforeTest
	
	public void Initialize() throws IOException {
		driver = InvokeBrwoser();
		driver.get(data.getProperty("url"));
		Log.info("Browser is launched and navigated to the URL");
	}
	
	@Test
	public void Dashboard() throws IOException {
		String username = data.getProperty("username");
		String Password = data.getProperty("password");
		
		login = new LoginPage(driver);
		login.username().sendKeys(username);
		login.password().sendKeys(Password);
		login.LoginBtn().click();
		
		dashPage = new DashboardsPage(driver);
		Assert.assertTrue(dashPage.DashboardOptn().isDisplayed());
		Log.info("Dashboard option is displayed");

	}
	
	@Test
	
	public void DashboardHeader() {
		Assert.assertTrue(dashPage.DashboardHeader().isDisplayed());
	}
	
@AfterTest
	
	public void exitBrowser() {
		
		driver.quit();
		Log.info("Browser is Closed successfully");
	}

}
