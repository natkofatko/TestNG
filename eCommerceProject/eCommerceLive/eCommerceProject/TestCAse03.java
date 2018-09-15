package eCommerceProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//eCommerce Live Project 
//Author Natalia Lal
//Test Case : Verify that you cannot add more product in cart than the product available in store
//Test Scripr 03

//				Test Steps
//		***********************
//	Step0:Set up the browser
//	Step1:Go to url http://www.live/guru99/com
//	Step2.Click on MOBILE menu
//	STEP3.In the list of MOBILE click ADD TP CART for Sony Xperia
//	STEP4.Change QTY value from 1 to 1000 and click UPDATE button
//	STEP5.Verify the Error message
//	STEP6.Click the EMPTY CART link in the footer of the list of all mobiles
//	STEP7.Verify cart is Empty

public class TestCAse03 {
	private WebDriver driver; 
	private String baseUrl; 
	private String xPath; 
	@BeforeMethod
	public void SetUpBrowser() {
		//Step0: Set up the browser to FireFox
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseUrl = "http://www.live.guru99.com"; 
		xPath = "C:\\Users\\natal\\OneDrive\\Pictures\\Saved Pictures\\"; 
	}
	@Test
	
	public void TestCase03() throws Exception{
		//Step1: go to baseUrl
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get(baseUrl);
	//Step2: Click on MOBILE menu
		driver.findElement(By.linkText("Mobile")).click();
		Thread.sleep(2000);
	//Step3: Click on ADD TO CART	
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		Thread.sleep(2000);
	 //Step4: Change QTY from 1 to 1000 and click update button
driver.findElement(By.xpath("//input[@title='Qty']")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@title='Update']")).click();
Thread.sleep(2000);
		//Step5 : Verify The error Message
 	File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
 	FileUtils.copyFile(img, new File("C:\\Users\\natal\\OneDrive\\Pictures\\Saved Pictures\\errorNow.png"));
 	
 	//Step5a: Verify The Erroe Message

// 	boolean Expected = driver.findElement(By.className("item-msg error")).getText().contains("maximum");  
//	System.out.println(Expected);
	
	//Step6: Click on EmptyCart Link
	driver.findElement(By.id("empty_cart_button")).click();
	Thread.sleep(2000);

		//Step7: Verify 
	File img2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
 	FileUtils.copyFile(img2, new File(xPath + "CArtISEmptyNOw.png"));
	}

	
@AfterMethod
public void TearDown()
{
	driver.close();

}
}