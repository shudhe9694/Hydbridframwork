package com.jbk.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Operatorsob {

	@FindBy(xpath="//b[text()='Java By Kiran']")
	public WebElement header ;
	
	@FindBy(xpath="//aside[@class='main-sidebar']")
	public WebElement mainsidebar ;
	
	@FindBy(xpath="//span[text()='Operators'] ")
	public  WebElement Operatorlink ;
	
	@FindBy(xpath="//section[@class='content']")
	public WebElement contentsection;

	@FindBy(xpath = "//tr//td[2]")
	 public List<WebElement> TableName;
}
