package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	private By username = By.xpath("//input[@id='txtUsername']");
	private By password = By.cssSelector("input#txtPassword");
	private By Loginbtn = By.cssSelector("input#btnLogin");
	private By PageTitle = By.xpath("//title");
	
	
	
	public LoginPage(WebDriver driver) {		
		this.driver=driver;
	}

	public WebElement username() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement LoginBtn() {
		return driver.findElement(Loginbtn);
	}
	
	public WebElement PageTitle() {
		return driver.findElement(PageTitle);
	}
	

}
