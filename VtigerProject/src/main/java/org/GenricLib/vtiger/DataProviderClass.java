package org.GenricLib.vtiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DataUtility.vtiger.PropertyUtility;
import com.DataUtility.vtiger.WebDriverUtility;
import com.DataUtility.vtiger.excelUtility;
import com.ObjectRepositaryHomePage.HomePage;
import com.ObjectRepositaryOrgnisation.vtiger.CreateOrganisationsPage;
import com.ObjectRepositaryOrgnisation.vtiger.OrganisationsPage;
import com.objectRepositaaryLogin.vtiger.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderClass {
	
	@DataProvider(name = "Org")
	//@Test
	public String[][] dataOrg() throws Throwable
	{
		FileInputStream fis = new FileInputStream(Iconstant.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("DataProvider");
		DataFormatter df = new DataFormatter();
		excelUtility eu = new excelUtility();
		
		int lastRow= eu.lastRow(Iconstant.excelPath,"DataProvider");
		System.out.println(lastRow);
		
		int lastCell=eu.lastCell(Iconstant.excelPath,"Dataprovider",1);
		System.out.println(lastCell);
		String[][] x= new String[lastRow][lastCell];
		
		for(int i=1;i<lastRow;i++)
		{
			for(int j=0;j<lastCell;j++)
			{
				x[i][j]= df.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		
		return x;
		/*
		 * for(int i=1;i<lastRow;i++) { for(int j=0;j<lastCell;j++) {
		 * System.out.print(x[i][j] +" "); } System.out.println(); }
		 */
		
		  	
	}
	
	@Test(dataProvider ="Org" )
	public void mulipleOgr(String org,String website,String tikSym,String mem,String emp,String othEmail) throws Throwable
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverUtility  wdu=new WebDriverUtility();
		 wdu.maximizeBrowser(driver);
		wdu.implicitWait(driver, 10);
		System.out.println(Iconstant.propertyPath);
		PropertyUtility pu = new PropertyUtility();
		driver.get(pu.propertyFetchData("url",Iconstant.propertyPath));
		LoginPage lo = new LoginPage(driver);
		lo.loginVtiger();
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsButton().click();
		OrganisationsPage  op = new OrganisationsPage(driver);
		op.getPlusSymbolClick().click();
		CreateOrganisationsPage cp = new CreateOrganisationsPage(driver);
		cp.getOrgName().sendKeys(org);
		cp.getWebSite().sendKeys(website);
		cp.getTikSymbol().sendKeys(tikSym);
		System.out.println(mem);
		System.out.println(emp);
		System.out.println(othEmail);
		cp.getSaveButton().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}


}
