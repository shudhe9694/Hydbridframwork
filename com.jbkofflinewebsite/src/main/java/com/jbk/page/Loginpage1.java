package com.jbk.page;


import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.jbk.object.Loginobject;
import com.listeners.MyListener;


public class Loginpage1 extends Loginobject  {
	WebDriver driver=null;
	public Loginpage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public static Logger log=Logger.getLogger("Loginpage1");

public Dashboardpg navigatedashboardpage(WebDriver driver) {
	emailname.sendKeys("kiran@gmail.com");
	password1.sendKeys("123456");
	loginbutton.click();
	return new Dashboardpg(driver);
}
public boolean correctcredentials() {
	emailname.sendKeys("kiran@gmail.com");
	password1.sendKeys("123456");
	loginbutton.click();
	
	String acttitle=driver.getTitle();
	String expetitle="JavaByKiran | Dashboard";
	if(acttitle.equals(expetitle)) {
		log.info("Title is match");
		return true;
	}else{
			log.info("Title is not matched");
			return false;
		}

		}
     public boolean invalidcredentials() {
	 emailname.sendKeys("shubham@gmail.com");
		 password1.sendKeys("456789");
		 loginbutton.click();
		return true;
	}
     
	  public boolean Emailerrormsg() {
          	boolean b=errormsg.isDisplayed();
			return b;
		}
	  
		public boolean Passworderrormasg() {
			boolean b=errormsg2.isDisplayed();
			return b;
		}
		
		public boolean registerdlinkisvisible() {
			boolean b=link.isEnabled();
			return b;
			}
		
		public boolean jbklogodisplayed() {
			boolean b=images.isDisplayed();
			return b;
		}
		
		public boolean registerdnewmemblink() {
			boolean b=link.isEnabled();
			return b;
		}
	}

