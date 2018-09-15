package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage  extends PageBase {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	public MyAccountPage LogToMyAccount(String username, String password) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		return new MyAccountPage(driver); 
	}
	public boolean checkIfLoginIsSuccesful(String word)
	{
		return driver.findElement(By.id("user_info")).getText().contains(word); 
		
	}
}
