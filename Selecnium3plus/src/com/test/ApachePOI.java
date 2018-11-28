package Selenium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApachePOI {
  @Test
  public void f() throws IOException {
	  File src =new File("C:\\Users\\aravind.g.kumar\\Desktop\\testdata2.xlsx");
		
		FileInputStream fis =new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println("first row number"+sh.getFirstRowNum());
		System.out.println("last row number "+sh.getLastRowNum());
		int rowCount1 = sh.getLastRowNum() - sh.getFirstRowNum();
		
		System.out.println(rowCount1);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(sh.getRow(2).getCell(0)
.getStringCellValue());
	  driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(sh.getRow(2).getCell(1)
			  .getStringCellValue());
	  driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
  }
  }