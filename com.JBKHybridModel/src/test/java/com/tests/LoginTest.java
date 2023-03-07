package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.listeners.MyListener;
import com.pages.Loginpage;
@Listeners((MyListener.class))
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