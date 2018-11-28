package com.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoToursApp_SelectClass {
  WebDriver driver=null;
	@Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\chromedriver.exe");
	  driver = new ChromeDriver(); 
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(2000);
	  WebElement radio1=driver.findElement(By.xpath("//input[@value='oneway']"));
	  radio1.click();
	  //driver.findElement(By.name("passCount")).sendKeys("3"); it will not work always
	  Select pc =new Select(driver.findElement(By.name("passCount")));
	  pc.selectByIndex(1);
	  
	  Select from = new Select(driver.findElement(By.name("fromPort")));
	  from.selectByValue("Paris");
	  
	  Select month= new Select(driver.findElement(By.name("fromMonth")));
	  month.selectByVisibleText("March");
	  
	  Select day= new Select(driver.findElement(By.name("fromDay")));
	  day.selectByValue("20");
	  
	  Select to= new Select(driver.findElement(By.name("toPort")));
	  to.selectByIndex(2);
	  
	  Select to_month= new Select(driver.findElement(By.name("toMonth")));
	  to_month.selectByVisibleText("April");
	  
	  Select to_day=new Select(driver.findElement(By.name("toDay")));
	  to_day.selectByIndex(4);
	  
	  WebElement radio2= driver.findElement(By.xpath("//input[@value='Business']"));
	  radio2.click();
	  
	  Select airline=new Select(driver.findElement(By.name("airline")));
      airline.selectByIndex(2);	
      
      driver.findElement(By.name("findFlights")).click();
      
	  
	  
	  
	   
  }
}
