package com.jbk.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginobject {

	@FindBy(xpath="/html/body/div/center/img")
	public WebElement images;

	@FindBy(xpath="//h4[text()='JAVA | SELENIUM | PYTHON']")
	public WebElement heading2;

	@FindBy(xpath="//b[text()='Java By Kiran | Log in']")
	public WebElement heading1;

	@FindBy(id="email")
	public WebElement emailname;

	@FindBy(id="password")
	public WebElement password1;

	@FindBy(xpath="//button")
	public WebElement loginbutton;

	@FindBy (id="email_error")
	public WebElement errormsg;

	@FindBy (id="password_error")
	public WebElement errormsg2;

	@FindBy (xpath="//a[text()='Register a new membership']")
	public WebElement link;


	}

