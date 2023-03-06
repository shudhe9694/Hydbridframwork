package com.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.jbk.base.TestBase;

public class DriverUtils extends TestBase {
	public static String getScreenshot(String name) throws Exception{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshots/"+name+".jpg";
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
		return path;
	}
	

}
