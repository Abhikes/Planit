package org.GenricLib.vtiger;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.DataUtility.vtiger.JavaUtility;
import com.DataUtility.vtiger.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listners implements ITestListener {
    ExtentReports er;
    ExtentTest test;
    ExtentSparkReporter esr;
	
	
	WebDriverUtility wd;
	public void onTestStart(ITestResult result) {
	    
		Reporter.log("TestCase Started:-"+ result.getName(),true);
		//It will tell to ExtentTest that my test script is going to start
		test=er.createTest(result.getName());
	
	   }

	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestCase Sucess:-"+ result.getName(),true);
		test.log(Status.PASS,result.getName());
		
		}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,result.getName());
		
		String methodName=result.getName();
		wd = new WebDriverUtility();
		 JavaUtility ju = new JavaUtility();
         String path=Iconstant.screenShotPath+methodName +ju.formatedcurDateAndTime()+".png";
		 try {
		     	String filePath= wd.screenShot(BaseClass.driver,path);
		     	test.addScreenCaptureFromPath(filePath);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getName());
		Reporter.log("TestCase Skipped:-"+ result.getName(),true);
		
	}

	public void onStart(ITestContext context) {
		 esr = new ExtentSparkReporter("./reportGenerated//p1.html");
		 esr.config().setDocumentTitle("My Final Report");
		 esr.config().setTheme(Theme.DARK);
		 esr.config().setReportName("Abhi");
		 
		 er = new ExtentReports();
		 er.attachReporter(esr);
		 
		 er.setSystemInfo("PlatForm","Windows");
		 er.setSystemInfo("System Bit","64 Bit");
		 
		
			}

	public void onFinish(ITestContext context) {
		Reporter.log("TestCase Done",true);
		er.flush();
		}
	

}
