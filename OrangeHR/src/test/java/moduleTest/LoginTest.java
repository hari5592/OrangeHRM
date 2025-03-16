package moduleTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.BaseClass;

public class LoginTest extends BaseClass {
	public WebDriver driver;
	
	private static Logger Log =LogManager.getLogger(BaseClass.class.getName());
	
	@BeforeTest
	
	public void Initialize() throws IOException {
		driver = InvokeBrwoser();
		
	}

	//@Test(dataProvider="getData")
	@Test
	
	public void LogIn() throws IOException {
		
		String username = data.getProperty("username");
		String Password = data.getProperty("password");
		
		driver.get(data.getProperty("url"));
		Log.info("Browser is launched and navigated to the URL");
		
		LoginPage login = new LoginPage(driver);
		login.username().sendKeys(username);
		login.password().sendKeys(Password);
		login.LoginBtn().click();
		
		
	}
	
	@AfterTest
	
	public void exitBrowser() {
		
		driver.quit();
		Log.info("Browser is Closed successfully");
	}
	
	/*@DataProvider()
	public Object[][] getData() {
		
		Object[][] data = new Object[2][2];
		
		data[0][0]= "Admin";
		data[0][1]= "admin1234";

		data[1][0]="Admin1";
		data[1][1]="admin123";
		
		return data;
		
		
	}*/
	
	
}
