package com.jbk.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardobject {

	@FindBy(xpath="//b[text()='Java By Kiran']")
	 public WebElement header;
	
	@FindBy(xpath="//span[text()='Users']")
	public  WebElement Userlink;
	
	@FindBy(xpath="//div[@class='small-box bg-red']")
	public WebElement phpcontentbox;
	
	@FindBy(xpath="//div[@class='small-box bg-aqua']")
	public WebElement Seleniumcontentbox;
	
	@FindBy(xpath="//div[@class='small-box bg-green']")
	public WebElement Java_j2eecontentbox;
	
	@FindBy(xpath="//div[@class='small-box bg-yellow']")
	public WebElement Pythoncontentbox;
	
	@FindBy(xpath="//div//i[@class='ion ion-stats-bars']")
	public WebElement graphbarlogo;
	
   @FindBy(xpath="//span[text()='Operators']")
   public WebElement Operatorlink;
   
  @FindBy(xpath="//span[text()='     Useful Links']")
   public WebElement Usefullink;

  
  @FindBy(xpath="//span[text()='Downloads']")
  public WebElement  downloadpglink;
  
  @FindBy(xpath="//span[text()='Logout']")
  public WebElement logoutlink;
  
}
