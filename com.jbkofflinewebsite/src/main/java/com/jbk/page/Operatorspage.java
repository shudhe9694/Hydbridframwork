package com.jbk.page;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.object.Operatorsob;
public class Operatorspage extends Operatorsob{

	WebDriver driver;
	static boolean b;
	public Operatorspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	public static Logger log=Logger.getLogger("Operatorspage");
	public boolean technicalhelpoperator() {
		ArrayList<String> techop=new ArrayList<String>();
		techop.add("Kiran");
		techop.add("Darshit");
		for(String data:techop) {
			System.out.println(data+" "+":Technical Help Operator");
		}
		  b=driver.findElement(By.xpath("//tbody//td[text()='Technical Help']")).isDisplayed();
		  return true;
		  }
	public boolean onlyWhatsappuseroperator() {
		 ArrayList<String> whatop=new ArrayList<String>();
		 whatop.add("Neelam");
		 whatop.add("Seema");
		 whatop.add("Varsha");
		 for(String data2:whatop) {
			 System.out.println(data2+" "+":Whatsappoperator");
		 }
		  b=driver.findElement(By.xpath("//span[text()='Whats App Only']")).isDisplayed();
		  return true;
		  }
	public boolean getweekdayoperators() {
		ArrayList<String> weekop=new ArrayList<String>();
		weekop.add("Neelam");
		weekop.add("Seema");
		  for (String data3 : weekop) {
			 System.out.println(weekop);	
			b= weekop.containsAll(weekop);
			return true;
			 }
		return false;
	}
	public boolean checkTableName() {
		ArrayList<String> actualName = new ArrayList<String>();
		for(WebElement name:TableName ) {
		String namefound = name.getText();
		actualName.add(namefound);
		}
		ArrayList<String>exp =  new ArrayList<String>();
		exp.add("Kiran");
		exp.add("Neelam");
		exp.add("Seema");
		exp.add("Varsha");
		exp.add("Darshit");
		
		if(actualName.equals(exp)) {
			return true;
		}else {
			return false;
		}
		
		}
	public boolean headermatch() {
		String header="Java By Kiran";
		b=driver.findElement(By.xpath("//b[text()='Java By Kiran']")).isDisplayed();
		header.equals(b);
		return true;
	}
	public Operatorspage navigateoperatorpage(WebDriver driver) {
		Operatorlink.click();
		return new Operatorspage(driver);
	}

	public boolean Operatorpagetitile() {
		Operatorlink.click();
		String acttitle=driver.getTitle();
		String expetitle="JavaByKiran | Operators";
		if(acttitle.equals(expetitle)) {
			log.info("Title is match");
			return true;
		}else{
				log.info("Title is not matched");
				return false;
			}
	}
}
	
