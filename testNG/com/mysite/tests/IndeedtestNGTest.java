package com.mysite.tests;

import java.util.concurrent.TimeUnit;

import javax.security.sasl.SaslException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IndeedtestNGTest {
 
	public WebDriver driver;
	public String baseUrl; 
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver() ;
	baseUrl = "http://www.indeed.co.uk"; 
	
	System.out.println("print ");
	}
	
	@DataProvider
	  public Object[][] getIndeedSearchParameters()
	  {
		  
	    return new Object[][] 
	    {
	      new Object[] { "Selenium", "London" },
	      new Object[] { "Cucember", "Glasgow" },
	      new Object[] { "Testing", "Manchester" },
	    };
	  }
	
	@Test (dataProvider = "getIndeedSearchParameters")
	public void testIndeedJobSearch(String job, String location) throws InterruptedException 
	{
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		Thread.sleep(1000);
		driver.findElement(By.id("what")).sendKeys(job);
		Thread.sleep(1000);
		driver.findElement(By.id("where")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("where")).sendKeys(location);
		Thread.sleep(1000);
	driver.findElement(By.id("fj")).click();
	Thread.sleep(3000); 
	System.out.println(driver.getTitle()); 
	
	
	String ExpectedTitle = job + " Jobs, vacancies in " + location +" | Indeed.co.uk";
	String ActualTitle = driver.getTitle(); 
	Assert.assertTrue(ActualTitle.equals(ExpectedTitle),  "error: Tittle is wrong"); 
	}
	
	//@Test
	public void TestLogo()
	{
		if(true)
		{
			throw new SkipException("Test was skipped"); 
		}
		driver.get(baseUrl);
		//html/body/div/div[2]/table/tbody/tr[1]/td/img
		Assert.assertTrue(driver.findElement(By.xpath("	/html/body/div/div[2]/table/tbody/tr[1]/td/img")).isDisplayed(),  "error : test doesnt work");
	}
	@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
