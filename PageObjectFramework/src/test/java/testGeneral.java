import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import methods.HomePage;
import srctest.WebDriverHelper;

public class testGeneral {

	protected WebDriver driver;
	protected HomePage home;

	@BeforeMethod
	public void beforeMethod() throws FileNotFoundException, IOException

	{
		Properties testConfig = new Properties();
		testConfig.load(new FileInputStream("testCongig.properties"));
		// testConfig.getProperty("browser");
		// testConfig.getProperty("baseUrl");

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\natal\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		driver = WebDriverHelper.CreateBrowser(testConfig.getProperty("browser"));
		driver.get(testConfig.getProperty("baseUrl"));

		home = new HomePage(driver);
	}

	@AfterMethod
	public void afterMethod() {

		WebDriverHelper.QuitDriver(driver);
	}

}
