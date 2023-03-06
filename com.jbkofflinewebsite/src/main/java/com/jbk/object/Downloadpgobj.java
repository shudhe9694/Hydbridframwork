package com.jbk.object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Downloadpgobj {

	WebDriver driver;
	@FindBy(xpath="//b[text()='Java By Kiran']")
	public WebElement header ;
	
	@FindBy(xpath="//h3[text()='Downloads List']")
	public  WebElement boxtitleheader;
	
    @FindBy(xpath="//span[text()='Official Website']")
	 public WebElement labelwebsite;
	
	@FindBy (xpath="//span[text()='Downloads']")
	public WebElement downloadpglink;

	@FindBy(xpath = "//th")
	protected List<WebElement>tableHeading;
	
	
	@FindBy(xpath = "//tr//td[3]")
	public  List<WebElement>vendorjar;
}
