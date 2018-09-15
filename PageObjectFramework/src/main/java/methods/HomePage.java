package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver){
	
	super(driver); 
	}
	
	public MyAccountPage ClickOnMyAccount()
	{
		driver.findElement(By.linkText("My Account")).click(); 
		return new MyAccountPage(driver); 
	}
	
	public MyShopPage ClickOnShop()
	{
		driver.findElement(By.linkText("Shop")).click();
		return new MyShopPage(driver); 
		
	}
}
