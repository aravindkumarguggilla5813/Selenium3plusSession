package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileuploadingusingRobotClass {
  @Test
  public void f() throws AWTException {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("http://demo.automationtesting.in/Register.html");	
driver.manage().window().maximize();
driver.findElement(By.id("imagesrc")).click();
StringSelection ss=new StringSelection("C:\\Users\\aravind.g.kumar\\Desktop\\flower.jpg");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
Robot rob=new Robot();
rob.setAutoDelay(1000);
rob.keyPress(KeyEvent.VK_CONTROL);
rob.keyPress(KeyEvent.VK_V);
rob.keyRelease(KeyEvent.VK_CONTROL);
rob.keyRelease(KeyEvent.VK_V);
rob.keyPress(KeyEvent.VK_ENTER);
rob.keyRelease(KeyEvent.VK_ENTER);










	  
  }
}
