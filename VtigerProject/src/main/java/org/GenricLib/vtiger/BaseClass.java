package org.GenricLib.vtiger;

	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DataUtility.vtiger.JavaUtility;
import com.DataUtility.vtiger.PropertyUtility;
import com.DataUtility.vtiger.WebDriverUtility;
import com.DataUtility.vtiger.excelUtility;
import com.ObjectRepositaryHomePage.HomePage;
import com.ObjectRepositaryOrgnisation.vtiger.CreateOrganisationsPage;
import com.ObjectRepositaryOrgnisation.vtiger.OrganisationsPage;
import com.objectRepositaaryLogin.vtiger.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This class is used to provide openApp,Login,Logout,closeAPP
 * @author Abhi
 *
 */

public class BaseClass {
	public static WebDriver driver;
	 public PropertyUtility pu;
	 public WebDriverUtility wdu;
	 public LoginPage lp;
	 public HomePage hp;
	 public excelUtility eu;
	 public JavaUtility ju;
	
	@BeforeClass
	public void openApplication() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 wdu=new WebDriverUtility();
		wdu.maximizeBrowser(driver);
		wdu.implicitWait(driver, 10);
		System.out.println(Iconstant.propertyPath);
		pu = new PropertyUtility();
		driver.get(pu.propertyFetchData("url",Iconstant.propertyPath));
		
	}
	@BeforeMethod
	public void login() throws Throwable
	{
		 lp= new LoginPage(driver);
		 //lp.getUsernameTextBox().sendKeys(pu.propertyFetchData("un",Iconstant.propertyPath));
		 //lp.getPasswordTextBox().sendKeys(pu.propertyFetchData("pw",Iconstant.propertyPath));
		 //lp.getLoginButton().click();
		 lp.loginVtiger();
	}
	
	
	  
	@AfterMethod
	public void logout() throws Throwable
	{
		Thread.sleep(3000);
		hp =new HomePage(driver);
		hp.logOutbutton(driver);
	
	}
	
	@AfterClass
	public void closeAPP()
	{
	 
		driver.close();
		
	}
	

}








