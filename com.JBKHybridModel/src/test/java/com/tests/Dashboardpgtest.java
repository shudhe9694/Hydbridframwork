package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Dashboardpage;


public class Dashboardpgtest extends BaseClass{


Dashboardpage dp;

@BeforeSuite
public void setup() throws Exception {
     initialization();
	dp=loadloginpage().navigatedashboardpage(driver);
	
	}

@Test
public void test01() {
Assert.assertTrue(dp.Dashboardpgtitle());
}
}
