package com.jbk.page;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.object.Dashboardobject;

public class Dashboardpg extends Dashboardobject {
  static boolean b;
	    WebDriver driver;
	public Dashboardpg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	public static Logger log=Logger.getLogger("Dashboardpg");

	public boolean headermatch() {
	  String header="Java By Kiran";
	  boolean b=driver.findElement(By.xpath("//b[text()='Java By Kiran']")).isDisplayed();
	  header.equals(b);
	  return true;
	}
	
	public boolean ismoreinfolinkopen(){
		 List<WebElement>link= driver.findElements(By.partialLinkText("More info"));
     for(WebElement webelement:link) {
	     webelement.click();
	     webelement.getSize();
	     boolean b=webelement.isDisplayed();
	     return b;
	 }
	return false;
	}
	public boolean maincontentcheck() {
		ArrayList<String> maincontent=new ArrayList<String>();
		maincontent.add("Java / J2EE:");
		maincontent.add("Selenium");
		maincontent.add("Python");
		maincontent.add("Php");
		for(String main:maincontent) {
			System.out.println(main+""+""+"Subcontentdashboarpge");
		}
	
	 b=driver.findElement(By.xpath("//div//h3[text()='Java / J2EE']")).isDisplayed();
     b=driver.findElement(By.xpath("//div//h3[text()='Selenium']")).isDisplayed();
     b=driver.findElement(By.xpath("//div//h3[text()='Python']")).isDisplayed();
	 b=driver.findElement(By.xpath("//div//h3[text()='Php']")).isDisplayed();
		return true;
		}	
	public boolean dashboardsubcontentcheck() {
		ArrayList<String> subcontent=new ArrayList<String>();
		subcontent.add("Automation Testing");
		subcontent.add("Software Development");
		subcontent.add("Data Science");
		subcontent.add("Web Development");
		for(String submain:subcontent) {
			System.out.println(submain);
			
		}
	
	 b=driver.findElement(By.xpath("//p[text()='Automation Testing']")).isDisplayed();
     b=driver.findElement(By.xpath("//p[text()='Software Development']")).isDisplayed();
     b=driver.findElement(By.xpath("//p[text()='Data Science']")).isDisplayed();
	 b=driver.findElement(By.xpath("//p[text()='Web Development']")).isDisplayed();
		return true;
		}	
	public boolean Userpagetitile() {
		Userlink.click();
		String acttitle=driver.getTitle();
		String expetitle="JavaByKiran | User";
		if(acttitle.equals(expetitle)) {
			log.info("Title is match");
			return true;
		}else{
				log.info("Title is not matched");
				return false;
			}

			}
	public boolean logoutclicktitile() {
		logoutlink.click();
		String acttitle=driver.getTitle();
		String expetitle="JavaByKiran | Log in";
		if(acttitle.equals(expetitle)) {
			log.info("Title is match");
			return true;
		}else{
				log.info("Title is not matched");
				return false;
			}

			}
	public Userpage naviagateUserpage(WebDriver driver) {
		Userlink.click();
		return new Userpage(driver);
	}
	public Operatorspage navigateoperatorpage(WebDriver driver) {
		Operatorlink.click();
		return new Operatorspage(driver);
	}
	public UsefulLinkpg navigateusefulinkpage(WebDriver driver) {
		Usefullink.click();
		return new UsefulLinkpg(driver);
	}
	public Loginpage1 navigatelogoutpage(WebDriver driver) {
	logoutlink.click();
	return new Loginpage1(driver);
}
	public Downloadspg navigatedownloadspg(WebDriver driver) {
		 downloadpglink.click();
		   return new Downloadspg(driver);
	}
}
