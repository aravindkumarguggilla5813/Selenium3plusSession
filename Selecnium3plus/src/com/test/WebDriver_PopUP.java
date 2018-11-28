package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriver_PopUP {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver(); 
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.name("cusid")).sendKeys("12345");
	  driver.findElement(By.name("submit")).click();
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text is"+alt.getText());
	  alt.accept();//it will click on the ok Button
	  //alt.dismiss();//it will click on the Cancel button
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Alert text is"+alt2.getText());
	  alt2.accept();
			  
	  
  
  
  }
}
