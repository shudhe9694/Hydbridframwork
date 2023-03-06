package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.Userpage;
import com.listeners.MyListener;

@Listeners(MyListener.class)
public class JBKtestcase3 extends TestBase {
	Userpage userpage;

	@BeforeMethod
	public void beforemethod() {
		log.info("Initilizing browser");
		initilization();
		log.info("Loading login page");
		userpage=loadLoginpage().navigatedashboardpage(driver).naviagateUserpage(driver);
		log.info("naviagte to userpage");
	}
	@AfterMethod
	public void aftermethod() {
		log.info("Closing the browser");
		driver.close();
		log.info("Driver closed");
	}
	
	@Test
	public void invalidcreduser() {
	log.info("User page userlist with invalid mobile no and email");
	Assert.assertTrue(userpage.invalidmobilemail());	
	}
	@Test
	public void invalidonlymobi() {
		log.info("User page userlist with invalid mobile no");
		Assert.assertTrue(userpage.onlyinvalidmobi());
	}
	@Test
	public void addusertitle() {
		log.info("Verify title after clicking on add user button");
		Assert.assertTrue(userpage.addusertitle());
	}
	@Test
	public void titlecheck() {
		log.info("verify user page title header");
		Assert.assertTrue(userpage.titlecheck());
	}
	@Test
	public void deletelabel() {
	  log.info("verify user page delete label alert accept or not");
	  Assert.assertTrue(userpage.alertmsg());
	}
	@Test
	public void tabelheading() {
		  log.info("verify tabel heading check while navigating user page");
		  Assert.assertTrue(userpage.VerifyTableHeading());
}
}