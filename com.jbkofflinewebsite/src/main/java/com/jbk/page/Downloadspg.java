package com.jbk.page;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.object.Downloadpgobj;

public class Downloadspg extends Downloadpgobj {
         WebDriver driver;
	public Downloadspg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public boolean getboxtitleheader() {
		String act= boxtitleheader.getText();
		return true;
	}
	public String getheader() {
		return header.getText();
	}
	
	public boolean checkPageTitle() {
		String act = "JavaByKiran | Downloads";
		if(driver.getTitle().equals(act)) {
			return true;
		}else {
			return false;
		}
	}
public boolean checkTableHeading() {
	ArrayList<String>act = new ArrayList<String>();
	for(WebElement heading:tableHeading) {
		String headingfound = heading.getText();
		act.add(headingfound);
	}
	ArrayList<String>exp = new ArrayList<String>();
	exp.add("Sr");
	exp.add("Name");
	exp.add("vendor");
	exp.add("Version");
	exp.add("32bit");
	exp.add("64bit");
	exp.add("Common");
	exp.add("Official Source");
	
if(act.equals(exp)) {
	return true;
}else {
	return false;
}
}
public boolean checkVendorJar() {
	ArrayList<String>act = new ArrayList<String>();
	for(WebElement vendor:vendorjar) {
		String vendorName = vendor.getText();
		act.add(vendorName);
	}
	ArrayList<String>exp = new ArrayList<String>();
	exp.add("Java Development Kit (JDK)");
	exp.add("Selenium Server Standalon Jar");
	exp.add("Selenium Server Source Jar");
	exp.add("Google Chrome");
	exp.add("Google Chrome Driver");
	exp.add("Mozilla Firefox");
	exp.add("Gecko Driver for Latest firefox");

if(act.equals(exp)) {
	return true;
}else {
	return false;
}
}

 public Downloadspg navigatedownloadspg(WebDriver driver) {
	 downloadpglink.click();
	   return new Downloadspg(driver);}}
 



 