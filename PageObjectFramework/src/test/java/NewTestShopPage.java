import javax.xml.ws.Holder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import methods.HomePage;

public class NewTestShopPage  extends testGeneral {

	
	
	@Test
  public void f() {
		
				home.ClickOnShop().ChoseOption("date").SelectFirstFromList();
				}
	

	}

