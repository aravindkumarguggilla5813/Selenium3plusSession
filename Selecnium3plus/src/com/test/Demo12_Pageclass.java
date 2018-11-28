package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demo12_Pageclass {
	WebDriver driver;
	By lnc= By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By login=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By search=By.id("newsletter-email");
	By Subs=By.id("newsletter-subscribe-button");
	By lout=By.linkText("Log out");
	public Demo12_Pageclass(WebDriver driver) {
		this.driver=driver;	
	}
	public void clicklink() {
		driver.findElement(lnc).click();
	}
	public void typeusername() {
		driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
	}
	public void typepassword() {
		driver.findElement(pwd).sendKeys("aravind");	
	}
	public void clickonlogin() {
		driver.findElement(login).click();
	}
	
	public void usersearch() {
		driver.findElement(search).sendKeys("mobiles");
	}
	
	public void clickonsubs() {
		driver.findElement(Subs).click();
		}
	
	public void clickonlogout() {
		driver.findElement(lout).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
