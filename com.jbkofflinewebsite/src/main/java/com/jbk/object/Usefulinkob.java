package com.jbk.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Usefulinkob {

	
	@FindBy(xpath="//b[text()='Java By Kiran']")
	public WebElement header ;
	
	@FindBy(xpath="//span[text()='     Useful Links']")
	public  WebElement Usefullink ;
	
	@FindBy(xpath="//span[text()='Go !']")
	public  WebElement golabel;
	
	
	@FindBy(xpath="//h3[text()='* Internet Required']")
	public  WebElement boxtitleheader;
	
	@FindBy(xpath="//td[text()='Video Lactures All Topics']")
	public  WebElement tableelement;
	
	@FindBy(xpath = "//tr//td[2]")
	public List<WebElement>tableContent;
	
	}


