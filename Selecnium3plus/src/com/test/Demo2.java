package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo2 {
  @Test
  public void f() {
	  System.out.println("this is test method");
  }
  
  @Test
  public void test1() {
	  System.out.println("this is test-1 method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after suite");
  }

}
