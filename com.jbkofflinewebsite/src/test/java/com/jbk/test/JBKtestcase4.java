package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.Operatorspage;
import com.listeners.MyListener;



@Listeners(MyListener.class)
public class JBKtestcase4 extends TestBase {
	Operatorspage operator;
	@BeforeMethod
	public void beforemethod() {
		log.info("Initilizing browser");
		initilization();
		log.info("Loading login page");
		operator=loadLoginpage().navigatedashboardpage(driver).navigateoperatorpage(driver);
		log.info("naviagte to userpage");
	}
	@AfterMethod
	public void aftermethod() {
		log.info("Closing the browser");
		driver.close();
		log.info("Driver closed");
	}
	@Test
       public void titlematch() {
		log.info("Verify title when navigate to  Operator page ");
		Assert.assertTrue(operator.Operatorpagetitile());
	}
	@Test
	public void Whatsappuser() {
		log.info("Verify Whatsapp use operator and print name  on console ");
		Assert.assertTrue(operator.onlyWhatsappuseroperator());
	}
	@Test
	public void onlytechnicaloperator() {
		log.info("Verify technical operator list and print on console");
		Assert.assertTrue(operator.technicalhelpoperator());
	}
	@Test
	public void Weekoperator() {
		log.info("Verify weekdaysoperators monday-saturday and print on console");
		Assert.assertTrue(operator.getweekdayoperators());
		
		
	}
	@Test
	public void  headercheck() {
		log.info("Verify header when navigating operators page");
		Assert.assertTrue(operator.headermatch());
	}
	@Test
	public void checktablename() {
		log.info("check the table name when navigating operator page");
		Assert.assertTrue(operator.checkTableName());
	}
	
}
