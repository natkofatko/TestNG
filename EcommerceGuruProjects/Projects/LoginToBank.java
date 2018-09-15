import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class LoginToBank {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver() ;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);		
		driver.get("http://www.demo.guru99.com/V4/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr72045 ");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ydAgUru");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		String mana = driver.findElement(By.xpath("//table//tr[@class='heading3']/td")).getText(); 
	if(mana.toLowerCase().contains("manger"))
	{
		System.out.println(mana);
	}
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("=================");
		String title = driver.findElement(By.cssSelector(".barone")).getText(); 
		System.out.println(title);							
		Thread.sleep(3000);
		if(title.startsWith("Guru99"))
				{
			System.out.println("Page is verifies");
				}
		else{
			System.out.println("Page was not verified");
		}
	}

}
