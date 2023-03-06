package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
    @FindBy(xpath="//button")
    public WebElement loginBtn;
   
    public Loginpage(WebDriver driver) {
    	this.driver=driver;
    PageFactory.initElements(driver, this);
    }
    public Dashboardpage navigatedashboardpage(WebDriver driver) {
    	username.sendKeys("kiran@gmail.com");
    	password.sendKeys("123456");
    	loginBtn.click();
    	return new Dashboardpage(driver);
    }
    
}
