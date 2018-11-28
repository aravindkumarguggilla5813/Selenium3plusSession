package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {
  
	@Test(priority=2)
  public void login() {
		System.out.println("this is login test");
  }
	@Test(priority=1)
	
	public void register() {
		System.out.println("this is register test ");
		Assert.assertTrue(10>5);
		Assert.assertFalse(5<10);
		Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.assertEquals(100, 100);
        Assert.assertEquals(200, 100, 100);
	}
	
    @Test(priority=3,enabled=false)
	
	public void Homepage() {	
		System.out.println("this is Homepage test ");
	}
	
}
