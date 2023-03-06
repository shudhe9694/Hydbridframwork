package com.jbk.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.jbk.page.Loginpage1;




public class TestBase {
	
	public static WebDriver driver=null;
	FileInputStream fis=null;
   public static ExtentReports report=null;
	public static ExtentSparkReporter spark=null;
	public static ExtentTest test=null;
	
	public static Logger log=Logger.getLogger("TestBase");
	
	public String readProperty(String key) {
   Properties properties= new Properties();
   try {
	   fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.Properties");
	   properties.load(fis);
	   }catch(FileNotFoundException e) {
		   e.printStackTrace();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   return properties.getProperty(key);
	}

	public void launchweb() {
		driver.get(readProperty("url"));
		log.info("Maximizing Window");
		driver.manage().window().maximize();
		log.info("Waiting for maximize");
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	     log.info("Loading JBK offline website element");
	}
	public void initilization() {
		String browserName=readProperty("browser");
		log.info("reading property file for browser name");
		if(browserName.equals("chrome")) {
			log.info("initializing chrome browser");
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			log.info("opening browser found in file");
			log.info("User launching chrome browser");
			launchweb();
			return;
			
		}
		if(browserName.equals("firefox")) {
			log.info("initializing firefox browser");
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver=new FirefoxDriver();
			log.info("opening browser found in file");
			log.info("User launching firefix browser");
			launchweb();
			return;
	}
	}
	public Loginpage1 loadLoginpage() {
		Loginpage1 lp=new Loginpage1(driver);
		return lp;
	}
	public void reportInit() {
		report=new ExtentReports();
		String path=System.getProperty("user.dir")+"/target/ExtentReport.html";
		spark=new ExtentSparkReporter(path);
		report.attachReporter(spark);
	}
}