package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadingusingSendkeys {
  @Test
  public void f() {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("http://demo.guru99.com/test/upload/");
driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\aravind.g.kumar\\Desktop\\flower.jpg");
driver.findElement(By.id("terms")).click();
driver.findElement(By.name("send")).click();

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
