package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jbk.base.TestBase;
import com.jbk.page.UsefulLinkpg;
import com.listeners.MyListener;

@Listeners(MyListener.class)
public class JBKtestcase5 extends TestBase {
;
	UsefulLinkpg usefulink;
	@BeforeMethod
	public void beforemethod() {
		log.info("Initilizing browser");
		initilization();
		log.info("Loading login page");
		usefulink=loadLoginpage().navigatedashboardpage(driver).navigateusefulinkpage(driver);
		log.info("naviagte to userpage");
	}
	@ Test
	public void titlecheck () {
		log.info("Verify title check while navigating Useful Link");
		Assert.assertTrue(usefulink.usefulinktitle());
	}
	
	@Test
	public void schedulelinklabeltitlecheck() {
		log.info("Verify title check while navigating schedule link go label");
		Assert.assertTrue(usefulink.scheduletitle());
	}
	@Test
	public void videolecturelabeltitle() {
		log.info("Verify title check while navigating video lecture all topics link go label");
		Assert.assertTrue(usefulink.VideoLecturetitle());
}
      @Test
    public void placementlabeltitlecheck() {
    	  log.info("Verify title check while navigating video lecture all topics link go label");
  		Assert.assertTrue(usefulink.VideoLecturetitle());
}
@Test
    public void headerboxtitlecheck() {
	 log.info("Verify boxtitle check while navigating Useful link");
		Assert.assertTrue(usefulink.boxtitlecheck());
	
}
@Test
public void tablenamecheck() {
	log.info("table name content when navigating useful link page");
	Assert.assertTrue(usefulink.checkTableContent());
}
}