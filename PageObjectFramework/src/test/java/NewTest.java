import org.testng.annotations.Test;

import methods.HomePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest  extends testGeneral{

	  @Test
	  public void f() throws InterruptedException
	  {

boolean result =  home.ClickOnMyAccount().LogToMyAccount("testuser1", "testpwd1").checkIfLoginIsSuccesful("Hello"); 
	Assert.assertTrue(result, "error");
	
	  }
	  
  
}
