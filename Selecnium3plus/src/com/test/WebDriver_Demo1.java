package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriver_Demo1 {
	
  WebDriver driver =null;	
  @Test
  public void f() throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Log in")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//implicit wait in selenium web driver.
driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
driver.findElement(By.name("Password")).sendKeys("aravind");
driver.findElement(By.xpath("//input[@value='Log in']")).click();
System.out.println(driver.getTitle());
Assert.assertTrue(driver.getTitle().contains("Demo Web Shop"));
System.out.println(driver.getCurrentUrl());


	  
	  
  }
}
