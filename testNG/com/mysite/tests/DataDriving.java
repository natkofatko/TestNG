package com.mysite.tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataDriving {
	
	
  @Test(dataProvider = "getIndeedSearchParameters")
  public void f(String job, String location)
  {
	  
  }

  @DataProvider
  public Object[][] getIndeedSearchParameters()
  {
	  
    return new Object[][] 
    {
      new Object[] { "Selenium", "London" },
      new Object[] { "Cucember", "Glasgow" },
      new Object[] { "Testing", "Manchaster"},
    };
  }
}
