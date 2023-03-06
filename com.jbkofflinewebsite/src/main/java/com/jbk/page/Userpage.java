package com.jbk.page;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.object.Userpageobj;

public class Userpage extends Userpageobj{

	static boolean b;
	WebDriver driver;
	public Userpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	public static Logger log=Logger.getLogger("Dashboardpg");
	public boolean titlecheck() {
		String title="User List";
		 b=driver.findElement(By.xpath("//h3[@class='box-title']")).isDisplayed();
		return true;
		}
	
	public boolean invalidmobilemail(){
		 List<WebElement>invalidcred= driver.findElements(By.xpath("//*[@id=\"tr_2\"]"));
	     for(WebElement webelement:invalidcred) {
		    System.out.println(webelement.getText());
		    String act="sagar@gmail.com";
		    if(webelement.getText().contentEquals(act))
	           
		     return false;
	}
		return true;
	}
	public boolean onlyinvalidmobi(){
		for(WebElement mobile:mobiles) {
			  String mo = mobile.getText();
			
			 ArrayList<String> act = new ArrayList<String>();
			 act.add(mo);
			// System.out.println(mo.length());
			 if(mo.length()<10) {
				 System.out.println("less than 9 digit mobile number= "+mo);
	     }
	return true;
		}
		return false;
}
	
	public boolean addusertitle() {
		Adduserbtn.click();
		String acttitle=driver.getTitle();
		String expetitle="JavaByKiran | Add User";
		if(acttitle.equals(expetitle)) {
			log.info("Title is match");
			return true;
		}else{
				log.info("Title is not matched");
				return false;
			}
		
	}
	 public boolean VerifyTableHeading() {
		   ArrayList<String>act = new ArrayList<String>();
		   for(WebElement heading:tableHeading) {
			  String headingFound = heading.getText();
			  act.add(headingFound);
		   }
		   ArrayList<String>exp = new ArrayList<String>();
		   exp.add("#");
		   exp.add("Username");
		   exp.add("Email");
		   exp.add("Mobile");
		   exp.add("Course");
		   exp.add("Gender");
		   exp.add("State");
		   exp.add("Action");
		   
		   if(act.equals(exp)) {
			   return true;
		   }else {
			   return false;
		   }
	   }
	public boolean alertmsg() {
		 List<WebElement>delabel= driver.findElements(By.xpath("//a//span[text()='Delete']"));
	     for(WebElement webelement2:delabel) {
		     webelement2.click();
		     driver.switchTo().alert().accept();
		     boolean b=webelement2.isDisplayed();
		     return b;
	}
		return false;
	}
	public Userpage naviagateUserpage(WebDriver driver) {
		Adduserbtn.click();
		return new Userpage(driver);
	}
}