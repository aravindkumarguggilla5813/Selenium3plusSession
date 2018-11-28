package Selenium1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
  @Test
  public void logintest() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.id("lst-ib")).sendKeys("automation testing");
	  driver.findElement(By.name("btnK")).click();
	  System.out.println("title of the page "+driver.getTitle());
	  ExtentHtmlReporter reporter= new ExtentHtmlReporter("C:\\Users\\aravind.g.kumar\\Desktop\\Report.html");
	  ExtentReports extent= new ExtentReports();
	  extent.attachReporter(reporter);
	  ExtentTest  logger =extent.createTest("logintest");
	  logger.log(Status.INFO, "login into application");
	  logger.log(Status.PASS,"title is verified");
	  extent.flush();
	  ExtentTest  logger2 =extent.createTest("logintest2");
	  logger2.log(Status.INFO, "Home page of the application");
	  logger2.log(Status.FAIL,"title is verified");
	  logger2.fail("the captured screen is", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\aravind.g.kumar\\Desktop\\flower.jpg").build());
	  //logger2.addScreenCaptureFromPath("C:\\Users\\aravind.g.kumar\\Desktop\\flower.jpg");
	  
	  logger2.log(Status.FATAL, "there is some error");
	  extent.flush(); 
	  driver.quit();
  }
}
