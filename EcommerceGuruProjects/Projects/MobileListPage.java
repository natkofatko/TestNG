import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MobileListPage {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver() ;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://live.guru99.com/index.php/");
		String text = driver.findElement(By.cssSelector(".page-title > h2:nth-child(1)")).getText();  
		System.out.println(text);
		System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//a[text()='Mobile']")).click();
	System.out.println(driver.getTitle());
	
	WebElement elem = driver.findElement(By.xpath("//*[@title='Sort By']")); 
	Select sel = new Select(elem); 
	Thread.sleep(2000);
sel.selectByValue("http://live.guru99.com/index.php/mobile.html?dir=asc&order=name");

System.out.println(driver.findElement(By.cssSelector(".page-title")).getText());




//System.out.println(driver.findElement(By.xpath("//li[0]//a[@title='product-image']")).getAttribute("title"));  
//
//System.out.println(driver.findElement(By.xpath("//li[1]//a[@class='product-image']")).getAttribute("title"));  
//
//System.out.println(driver.findElement(By.xpath("//li[2]//a[@class='product-image']")).getAttribute("title"));  
//String ss = driver.findElement(By.xpath("//li[1]//a[@class='product-image']")).getAttribute("title");  
//if (ss.equals ("Iphone"))
//		{
//	System.out.println("wsjo sie zgadza");
//		}
//else
//{
//	System.out.println("nie zfgasza sie");
//}
//

//System.out.println(driver.findElement(By.xpath("//li[1]//a[@class=\"product-image\"]")).getAttribute("title"));
//System.out.println(driver.findElement(By.xpath("//li[2]//a[@class=\"product-image\"]")).getAttribute("title"));
//System.out.println(driver.findElement(By.xpath("//li[3]//a[@class=\"product-image\"]")).getAttribute("title"));




	
	}

}
