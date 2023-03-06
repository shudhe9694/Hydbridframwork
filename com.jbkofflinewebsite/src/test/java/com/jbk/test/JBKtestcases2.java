package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.Dashboardpg;
import com.listeners.MyListener;



@Listeners(MyListener.class)
public class JBKtestcases2 extends TestBase {

	Dashboardpg dashboard;
	@BeforeMethod
	public void beforemethod() {
		log.info("Initilizing browser");
		initilization();
		log.info("Loading login page");
		dashboard=loadLoginpage().navigatedashboardpage(driver);
		log.info("naviagte to dashboard page");
	}
	@AfterMethod
	public void aftermethod() {
		log.info("Closing the browser");
		driver.close();
		log.info("Driver closed");
	}
	
		@Test
		public void contentcheck() {
			log.info("dashboard page main content check");
			Assert.assertTrue(dashboard.maincontentcheck());
		}
	@Test
		public void subcontentcheck() {
			log.info("dashboardpage subcontent check  ");
			Assert.assertTrue(dashboard.dashboardsubcontentcheck());
		}
	@Test
		public void morelinkopen() {
		      log.info("more link open in window ");
			Assert.assertTrue(dashboard.ismoreinfolinkopen());
		}
	@Test
	public void headermatch() {
		log.info("header match on dashboard page same as expected");
		Assert.assertTrue(dashboard.headermatch());
	}
	@Test
	public void Userpagetitle() {;
		log.info("verify user page title after navigating userpage");
		Assert.assertTrue(dashboard.Userpagetitile());
}
	@Test
	public void logoutclickpagetitle() {
		log.info("verify title after click on logout while navigating dashboard page");
		Assert.assertTrue(dashboard.logoutclicktitile());
}
	
}