package com.mysite.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewTest {
	@BeforeClass
public void OpenTheFireFox()
{
	System.out.println("Open the Firefox () method");
}
	@AfterClass
	public void closingTheFirefox ()
	{
		System.out.println("closing the firefox");
	}
	@BeforeTest
public void SetUpDatabase()
{
	System.out.println("SetUpDatabase ");
	
}
	@AfterTest
public void cleanTheDataBase()
{
	System.out.println("cleanTheDataBase()");
}
	@BeforeSuite
public void SettingUpSuite()
{
	System.out.println("SettingUpSuite");
}	
	@AfterSuite
public void closingSuite()
{
	System.out.println("closing  suit");
}
	@BeforeMethod
	public void firstMethod() 
	{
		System.out.println("in the before method() ");
	}
	@BeforeMethod
	public void dddtMethod() 
	{
		System.out.println("in the bdddre method() ");
	}
 @Test
	public void SecondMethod()
	{
		System.out.println("In the second method" );

		}
 @Test
	public void firstfirstMethod()
	{
		System.out.println("In the first method" );

		}

@Test
	public void SecondseconfMethod()
	{
		System.out.println("In the seconsecondd method" );

		//Assert.assertEquals("myTittle22", "myTittle", "ERROR: my title is not good");
	//Assert.assertTrue("myTittle".equals("myTittle"), "Error : wrong message" );
	if(!("myTittle"=="myTittle"))
		Assert.fail("error : title is wrong");
	}
 

 @AfterMethod
  public void fourthMethod() 
  {
	  System.out.println("in the after method");
  }
 @AfterMethod
 public void oneFterethod() 
 {
	  System.out.println("in the  one more after after method");
 }

}

