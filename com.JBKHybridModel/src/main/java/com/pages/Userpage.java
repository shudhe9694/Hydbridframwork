package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userpage {

	WebDriver driver;
	@FindBy(xpath="//span[text()='Users']")
	public WebElement Userbtn;
	
	
	public Userpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean Usertitle() {
		String act=driver.getTitle();
      String exp= "JavaByKiran | User";
 	   if(act.equals(exp)) {
 		   return true;
 	   }else {
	return false;
 	   }
	}
	public Userpage navigateuserpage(WebDriver driver) {
		Userbtn.click();
		return new Userpage(driver);
	}
		
	}

