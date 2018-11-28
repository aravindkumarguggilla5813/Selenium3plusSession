package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriver_Actions1 {
  WebDriver driver=null;
	@Test
  public void Acttionsinselenium() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.hdfcbank.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Actions act1=new Actions(driver);
	  act1.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[1]/a"))).perform();
	  Thread.sleep(2000);
	  act1.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[2]/div[2]/div[1]/ul/li[4]/a"))).perform();
	  Thread.sleep(2000);
	  act1.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[2]/div[2]/div[2]/div[4]/div/ul/li[1]/a"))).click().build().perform();
	  System.out.println(driver.getTitle());
	  Assert.assertTrue(driver.getTitle().startsWith("Demat"));
	  
  }
}
