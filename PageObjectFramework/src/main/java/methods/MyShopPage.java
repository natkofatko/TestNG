package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MyShopPage  extends PageBase {

public MyShopPage(WebDriver driver)
{
super(driver); 
}

public MyShopPage ChoseOption(String Name)
{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
Select option = new Select(driver.findElement(By.name("orderby"))); 
option.selectByValue(Name);
return new MyShopPage(driver);

}

public String SelectFirstFromList() 
{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Select sel = new Select(driver.findElement(By.name("orderby"))) ;
	
	return sel.getFirstSelectedOption().getText(); 
}


}
