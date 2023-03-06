package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.jbk.base.TestBase;


public class MyListener extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		}
	public void onTestSucess(ITestResult result) {
		test.log(Status.PASS, "Testcase passed");
	}
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Testcase Failed");
	}
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Testcase skipped");
	}
	public void onStart(ITestContext context) {
		reportInit();
	}
	public void onFinish(ITestContext context) {
		report.flush();
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		

	
}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}