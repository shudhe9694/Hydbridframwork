package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Userpage;

public class Userpagetestcase extends BaseClass {
Userpage up;
@BeforeSuite
	public void setup ()throws Exception{
	initialization();
      up=loadloginpage().navigatedashboardpage(driver).naviagateUserpage(driver);
	}

   @Test
	public void test01() {
	Assert.assertTrue(up.Usertitle());
	}
}
