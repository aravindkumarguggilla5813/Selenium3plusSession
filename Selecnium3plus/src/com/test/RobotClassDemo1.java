package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotClassDemo1 {
  @Test
  public void f() throws AWTException {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
Robot rob=new Robot();
driver.get("http://www.inviul.com/");
driver.manage().window().maximize();
driver.findElement(By.id("s")).sendKeys("Selenium");

rob.setAutoDelay(1000);//robot class waiting time or sleeping
rob.keyPress(KeyEvent.VK_ENTER);
rob.keyRelease(KeyEvent.VK_ENTER);
//driver.close(); //close the current instance

//driver.quit();



//rob.keyPress(KeyEvent.VK_5);
//rob.keyRelease(KeyEvent.VK_5);







	  
  }
}
