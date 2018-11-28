package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo10_Actions2 {
  WebDriver driver=null;
  
	@Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver(); 
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement search= driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	
	Actions act1=new Actions(driver);
	act1.keyDown(search,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(2000);
	act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	Assert.assertTrue(driver.getTitle().contains("Build your own computer"));
	
	
	
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
