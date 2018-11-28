package com.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookiesTestingDemo1 {
  @Test
  public void f() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
System.out.println("the page title is"+driver.getTitle());
Cookie cook1 = new Cookie("username","googleuser");
driver.manage().addCookie(cook1);
Set <Cookie> cook=driver.manage().getCookies();
Iterator<Cookie> it=cook.iterator();
while (it.hasNext()) {
	System.out.println("cookies are "+it.next());
}
driver.manage().deleteCookie(cook1);
  }}
