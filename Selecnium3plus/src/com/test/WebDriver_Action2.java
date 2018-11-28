package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriver_Action2 {
  @Test
  public void f() throws InterruptedException  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();  
	  String url="http://demowebshop.tricentis.com/login";
	  driver.navigate().to(url);
	 WebElement search= driver.findElement(By.id("small-searchterms"));
	 Actions act1=new Actions(driver);
		act1.sendKeys(search,"computer").build().perform();
		Thread.sleep(2000);
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Assert.assertTrue(driver.getTitle().contains("Build your own computer"));
	  
  }
}
