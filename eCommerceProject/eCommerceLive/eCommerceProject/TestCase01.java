
//	Testing website Guru99 using Selenium WebDriver
// @author Natalia Lal
//	Test Script01

//		Test Steps
//		***********
//	0.Set up the Browser
//	1.Go to : http://www.demo.guru99.com/V4/
//	2.Enter Valid UserID
//	3.Enter Valid Password
//	4.Click Login
//	5.Verify if Login is Succesful using Robot Class

package eCommerceProject;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestCase01 {

	private static WebDriver driver;
	private static String baseUrl;
	static By username = By.name("uid");
	static By password = By.name("password");
	static By Login = By.xpath("//input[@name='btnLogin']");

	public static void main(String[] args) throws Exception {

		// stepO: Setting up the browser FireFox

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// step1: Go to http://www.demo.guru99.com/V4/
		baseUrl = "http://www.demo.guru99.com/V4/";
		driver.get(baseUrl);

		// step2: Enter Valid UserID

		driver.findElement(username).sendKeys("mngr72045 ");

		// step3:Enter Valid Password
		driver.findElement(password).sendKeys("ydAgUru");

		// step4: Click Login
		driver.findElement(Login).click();

		// step5: verifying if login is succesful

		// Step5a: Setting up Explicit wait in order to capture screenshot after
		// login is Succesful
		WebDriverWait wb = new WebDriverWait(driver, 30);
		wb.until(ExpectedConditions.urlToBe("http://www.demo.guru99.com/V4/manager/Managerhomepage.php"));
		// Capturing screenshot after Login using Robot class
		// The code belowe will capture screenshot
		BufferedImage img = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

		// This code will storage screenshot in a new location
		ImageIO.write(img, "png", new File("C:\\Users\\natal\\OneDrive\\Pictures\\Saved Pictures\\fail11.png"));

		// Step5b: Capturing Screenshot using TakeScreenshots class

		// This will take the screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// this will storage the screenshot
		FileUtils.copyFile(src, new File("C:\\Users\\natal\\OneDrive\\Pictures\\Saved Pictures\\zdjecieGURU99.png"));
	}

}
