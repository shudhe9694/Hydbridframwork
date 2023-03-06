package com.jbk.object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Userpageobj {

	
	WebDriver driver;
	
	@FindBy(xpath="//b[text()='Java By Kiran']")
	public WebElement header2 ;
	
	@FindBy(xpath="//h3[@class='box-title']")
	public WebElement boxtitle ;
	
	@FindBy(xpath="//button[text()='Add User']")
	public WebElement Adduserbtn ;
	
	 
	@FindBy(xpath="//a//span[text()='Delete']")
	public WebElement Deletelabel;
	
	@FindBy(xpath = "//th")
	public List<WebElement>tableHeading;
	
	@FindBy(xpath = "//tr//td[4]")
	public List<WebElement> mobiles;
	
}
	