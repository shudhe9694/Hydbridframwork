package com.jbk.page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.object.Usefulinkob;

public class UsefulLinkpg extends Usefulinkob {
	WebDriver driver;
	public UsefulLinkpg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public static Logger log=Logger.getLogger("UsefulLinkpg");
	
	public boolean usefulinktitle() {
		Usefullink.click();
		String acttitle=driver.getTitle();
		String expetitle="JavaByKiran | Useful Links";
		if(acttitle.equals(expetitle)) {
			log.info("Title is match");
			return true;
		}else{
				log.info("Title is not matched");
				return false;
			}
		}
	
	public boolean VideoLecturetitle() {
		
		driver.findElement(By.xpath("//tr[3]//td[3]//a//span")).click();
		String acttitle=driver.getTitle();
		Set<String> s=driver.getWindowHandles();
		 Iterator<String> I= s.iterator();
			while(I.hasNext()) {
				String window1=I.next();
					driver.switchTo().window(window1);
					if(driver.getTitle().equals("Free Videos|javabyKiran"));
					log.info("title is match");
					return true;
				}
			return false;
		}
	
public boolean placementtitle() {
		
		driver.findElement(By.xpath("//tr[7]//td[3]//a//span")).click();
		String title=driver.getTitle();
		Set<String> s=driver.getWindowHandles();
	 Iterator<String> I= s.iterator();
		while(I.hasNext()) {
			String window1=I.next();
				driver.switchTo().window(window1);
				if(driver.getTitle().equals("Placement|javabyKiran"));
				log.info("title is match");
				return true;
			}
		return false;
	}

public boolean boxtitlecheck() {
	String boxtitle="* Internet Required'";

	boolean b=driver.findElement(By.xpath("//h3[text()='* Internet Required']")).isDisplayed();
	boxtitle.equals(b);
	return true;
}
public UsefulLinkpg navigateusefulinkpage(WebDriver driver) {
	Usefullink.click();
	return new UsefulLinkpg(driver);
}
public boolean scheduletitle() {
	
	driver.findElement(By.xpath("//tr[2]//td[3]//a//span")).click();
	String title=driver.getTitle();
	Set<String> s=driver.getWindowHandles();
 Iterator<String> I= s.iterator();
	while(I.hasNext()) {
		String window1=I.next();
			driver.switchTo().window(window1);
			if(driver.getTitle().equals("Page not found|javabyKiran"));
			log.info("title is match");
			return true;
		}
	return false;
}
public boolean checkTableContent() {
	ArrayList<String> act = new ArrayList<String>();
	for(WebElement content:tableContent) {
		String contentText = content.getText();
		act.add(contentText);
	}
	ArrayList<String>exp = new ArrayList<String>();
	exp.add("Schedule");
	exp.add("Video Lactures All Topics");
	exp.add("Selenium Interview Questions");
	exp.add("Java Interview Questions");
	exp.add("Courses");
	exp.add("Placement");
	
	if(act.equals(exp)) {
		return true;
	}else {
		return false;
	}
}
}