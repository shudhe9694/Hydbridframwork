package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.Downloadspg;
import com.listeners.MyListener;
@Listeners(MyListener.class)
public class JBKtestcase6 extends TestBase{
	Downloadspg download;
	@BeforeMethod
	public void beforemethod() {
		log.info("Initilizing browser");
		initilization();
		log.info("Loading login page");
		download=loadLoginpage().navigatedashboardpage(driver).navigatedownloadspg(driver);
		log.info("loginpage displayed");
	}
	@AfterMethod
	public void aftermethod() {
		log.info("Closing the browser");
		driver.close();
		log.info("Driver closed");
	}
	 @Test
		public void test01() {
		 log.info("check page title while navigating downloadpg");
			Assert.assertTrue(download.checkPageTitle());
		}
		 @Test
		    public void test02() {
			 log.info("check  vendorjar while navigating downloadpg");
				Assert.assertTrue(download.checkVendorJar());
		 }
				 @Test
				    public void test03() {
					 log.info("check page boxtitle while navigating downloadpg");
					 Assert.assertTrue(download.getboxtitleheader());
		
		}
		 
	
	}


