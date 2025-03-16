package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardsPage {
	
	public WebDriver driver;
	
	
	private By dashboardOption = By.id("menu_dashboard_index");
	private By dashBoardHeader = By.cssSelector("div.head h1");
	
	
	public DashboardsPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement DashboardOptn() {
		
		return driver.findElement(dashboardOption);
		
	}
	
public WebElement DashboardHeader() {
		
		return driver.findElement(dashBoardHeader);
		
	}
	

}
