package eCommerceProject;
// Guru eCommerce live project

//Day 2nd
//Author Natalia Lal
//Test case: Verify that cost of product in list page and details page are equal 
//
//Test Script 02

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//		Test Steps:
//			Step1. Go to http://www.live.guru99.com
//				Step2. Click on 'Mobile' menu
//				Step3. In the list of all mobile, read the cost of Sony Xperia(note the value)
//				Step4. Click on SonyXperia mobile
//				Step5.Read the SonyXperia price from detail page
//				Step6.Compare value in step3 and step5

public class TestCase02 {
	WebDriver driver;
	String baseUrl; 
	
	@BeforeMethod
	public void SetUpBrowser() {
		// Step0: Setting up the browser FireFox
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
@Test
	public void TestCase02() throws Exception
	{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		//Step1: go to base url
		baseUrl = "http://www.live.guru99.com"; 
		driver.get(baseUrl);
		
		//Step2: Click on Mobile
		driver.findElement(By.linkText("Mobile")).click();
		//Step3: Note the value of SonyXperia
		String firstPrice = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
		System.out.println(firstPrice);
		//Step4: Click on SonyXperia product
		driver.findElement(By.id("product-collection-image-1")).click();
		Thread.sleep(2000);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@title='Sony Xperia']")).click();
		//<a href="http://live.guru99.com/index.php/mobile/sony-xperia.html" title="Sony Xperia">Sony Xperia</a>
	
		//Step5:Read the price from Sony Speria page 
		
		String secondPrice = driver.findElement(By.xpath("//*[@id='product-price-1']")).getText();  
		System.out.println(secondPrice);
		
		//Step6: Compere Value from Step3 & Step5
//		Assert.assertTrue(firstPrice.equals(secondPrice), "test Pass");
		Assert.assertEquals(secondPrice, firstPrice);
//		if(firstPrice.equals(secondPrice))
//		{
//			System.out.println("The prices are he same. Test pass");
//		}
//		else{
//			System.out.println("Test Failed");
//		}
	}
@AfterMethod
public void TearDown(){
	driver.quit();
}
}

