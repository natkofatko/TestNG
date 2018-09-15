package srctest;

import java.security.InvalidParameterException;
import java.util.InvalidPropertiesFormatException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {
	
	private WebDriver driver;
	
	public static WebDriver CreateBrowser(String browser) 
	{
		WebDriver driver = null; 
		if(browser.equalsIgnoreCase("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		 
		}
		else 
		{
			throw new InvalidParameterException(browser + "nottttttt"); 
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		return driver; 
		
			}

	public static void QuitDriver(WebDriver driver)
	{
		driver.quit();
	}
}
