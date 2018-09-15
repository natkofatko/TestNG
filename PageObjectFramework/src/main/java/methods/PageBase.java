package methods;

import org.openqa.selenium.WebDriver;

public class PageBase {
	
protected WebDriver driver;
	
	public PageBase (WebDriver driver){
		this.driver = driver; 	
	}
	public String getPageTitle()
	{
	return driver.getTitle();
	
	}
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl(); 
	}


}
