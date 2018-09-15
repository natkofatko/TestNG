//Gurr99 eCommerceLive Project
//Day 1
//Author Natalia Lal
//TestCase Verify item in Mobile Lis page can be sorted by "name' using Selenium WebDriver(TestNG)

//Test script 001

	//Test Steps
//Step1.Go to http://live/guru99.com
//Step2.Verify Title of the page
//Step3.Click on MOBILE menu
//Step4. Verify Title of the page
//Step5.In the list of all mobile,select 'SORT BY' dropdown as"namme"
//Step6.Verify all prducts are sorted by name
package eCommerceProject;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase001 {
private WebDriver driver; 
private String baseUrl;
String expectedTitle; 
String ActualTitle; 
@BeforeMethod	
public void SetUP() {
		//Step0. Setting up the browser FireFox
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	@Test
	public void testCase001() throws Exception{
		baseUrl ="http://www.live.guru99.com"; 
		//Step1 : Navigating to url
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		//Step2. Verifying Title
		expectedTitle = "THIS IS DEMO SITE FOR   "; 
		ActualTitle = driver.findElement(By.cssSelector(".page-title > h2:nth-child(1)")).getText(); 

		Assert.assertTrue(expectedTitle.equalsIgnoreCase(ActualTitle), "Title is verified");
		
		//Step3.Click on MOBILE menu
		driver.findElement(By.linkText("Mobile")).click();
		
		//Step4. Verify MOBILE Title
		String ActualTitl2= driver.findElement(By.cssSelector(".page-title")).getText(); 
		String ExpectedTitle2 = "MOBILE"; 
		try{
		Assert.assertTrue(ActualTitl2.equalsIgnoreCase(expectedTitle)) ; 
		System.out.println("Title is Verified");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//Step5. From DropDownList Select by "name"
		Select sel = new Select(driver.findElement(By.xpath("//select[@title='Sort By']")));
		sel.selectByVisibleText("Price");
		
			
		
	
		//Step6.Verify if all products are selected by name
		String xPath = "C:\\Users\\natal\\OneDrive\\Pictures\\Saved Pictures";
		File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(img, new File(xPath+ "GURU569.png"));
		Thread.sleep(2000); 
	}	
	
//	@AfterMethod
//	public void TearDown()
//	{
//		driver.quit();
//		System.out.println("Test Complete");
//	}
}