package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//class level listener implementation
@Listeners(Selenium.Demp14_Listeners.class)

public class Demo13_TestClass_POM {
  @Test
  public void demowebshop() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	  Demo12_Pageclass pobject=new Demo12_Pageclass(driver);
	  driver.get("http://demo.tricentis@123.com/");
	  driver.manage().window().maximize();
	  pobject.clicklink();
	  pobject.typeusername();
	  pobject.typepassword();
	  pobject.clickonlogin();
	  System.out.println("title of the page is "+driver.getTitle());
	  Assert.assertTrue(driver.getTitle().startsWith("Demo"));
	  pobject.usersearch();
	  pobject.clickonsubs();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  pobject.clickonlogout();
	  driver.close();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
  }
}
