import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class youTubeDDT {
	
private WebDriver driver;
	




@Test(dataProvider="wordPressData")
public void LoginToWordPress(String username, String password) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	
	driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2Fcom-vs-org%2F%3Fsgmt%3Dbb%26ab%3Dcom-vs-org_lp_test_20170213%26utm_source%3Dbing%26utm_campaign%3DWordPress-Generic-Exact-US-GP%26utm_medium%3Dcpc%26keyword%3Dwordpress%26creative%3D9925335912%26campaignid%3D128065278%26adgroupid%3D3099786316%26matchtype%3De%26device%3Dc%26network%3Do");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	Thread.sleep(2000);
	driver.findElement(By.id("user_login")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.id("user_pass")).sendKeys(password); 
	Thread.sleep(2000);
	driver.findElement(By.id("wp-submit")).click();
	

	Assert.assertTrue(driver.findElement(By.linkText("try again")).isDisplayed(), "error no non    nnnnnnn");
	System.out.println(driver.findElement(By.linkText("try again")).getText());
}

@AfterMethod

public void quitMethod()
{
	driver.quit();
}

@DataProvider(name="wordPressData")
public Object[][] passData()
{
	Object[][] data = new Object [3][2];
	data[0][0]= "admin1";
	data[0][1]= "demo1";
	data[1][0]= "admin";
	data[1][1]= "demo123";
	data[2][0]= "admin2";
	data[2][1]= "demo1234";
	
	return data; 


}
}
