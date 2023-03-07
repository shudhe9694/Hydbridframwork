package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Loginpage;

public class LoginTest extends BaseClass {
  Loginpage lp;
	@BeforeSuite
	public void setup() throws Exception{
		initialization();
		lp=loadloginpage();
	}
	
	@Test
	public void test01() {
Assert.assertTrue(lp.Loginpagetitle());
	}
	
}