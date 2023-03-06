package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.Loginpage1;
import com.listeners.MyListener;


@Listeners(MyListener.class)
public class JBKtestcases extends TestBase {

	Loginpage1 lp;
	@BeforeMethod
	public void beforemethod() {
		log.info("Initilizing browser");
		initilization();
		log.info("Loading login page");
		lp=new Loginpage1(driver);
		log.info("loginpage displayed");
	}
	@AfterMethod
	public void aftermethod() {
		log.info("Closing the browser");
		driver.close();
		log.info("Driver closed");
	}
		@Test
		public void validcredential() {
		log.info("check login with valid username and password");
		Assert.assertTrue(lp.correctcredentials());
		}
		@Test
		public void invalidcredentials() {
			log.info("check login with invalid username and password");	
			Assert.assertTrue(lp.invalidcredentials());
		}
	@Test
	public void emailerrormsg() {
		log.info("check errormsg  displayed on loginpage with invalid username and password");	
		lp.invalidcredentials();
		Assert.assertTrue(lp.Emailerrormsg());
	}
	@Test
	public void passworderrormsg() {
		log.info("check passwordmsg  displayed on loginpage with invalid username and password");
		lp.invalidcredentials();
		Assert.assertTrue(lp.Passworderrormasg());
	}
	@Test
	public void JBKlogo() {
		log.info("check JBKlogo image  displayed on loginpage");	
		Assert.assertTrue(lp.jbklogodisplayed());
	}
	@Test
	public void Registerdlink() {
		log.info("check new member registration link available on index page");
		Assert.assertTrue(lp.registerdnewmemblink());
	}
	}
	

