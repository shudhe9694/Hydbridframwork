package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {

	WebDriver driver;
	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
    @FindBy(xpath="//button")
    public WebElement loginBtn;
	@FindBy(xpath="//b[text()='Java By Kiran']")
	 public WebElement header;
	
	@FindBy(xpath="//span[text()='Users']")
	public  WebElement Userbtn;
	
	
	public Dashboardpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	  public Dashboardpage navigatedashboardpage(WebDriver driver) {
	    	username.sendKeys("kiran@gmail.com");
	    	password.sendKeys("123456");
	    	loginBtn.click();
	    	return new Dashboardpage(driver);
	    }
	    
	public boolean Dashboardpgtitle() {
		String act=driver.getTitle();
		String expe="JavaByKiran | Dashboard";
		if(act.equals(expe)) {
			return true;
		}
		return false;
	}
	public Userpage naviagateUserpage(WebDriver driver) {
		Userbtn.click();
		return new Userpage(driver);
	}
}

