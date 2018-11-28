package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridFinalProgram {
  @Test
  public void f() throws MalformedURLException {
	  DesiredCapabilities dp=new DesiredCapabilities();
	  dp.setBrowserName("chrome");
	  dp.setPlatform(Platform.WINDOWS);
	  ChromeOptions CO=new ChromeOptions();
	  CO.merge(dp);
	  String huburl="http://10.116.243.65:5566/wd/hub";
	  WebDriver driver = new RemoteWebDriver(new URL(huburl),dp);
	  driver.get("http://www.google.com/");
	  driver.findElement(By.id("lst-ib")).sendKeys("automation testing");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  System.out.println("title of the page "+driver.getTitle());
	  driver.close();
  }
}
