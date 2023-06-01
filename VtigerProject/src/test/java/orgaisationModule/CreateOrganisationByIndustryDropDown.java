package orgaisationModule;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.GenricLib.vtiger.BaseClass;
import org.GenricLib.vtiger.Iconstant;
import org.testng.annotations.Test;

import com.DataUtility.vtiger.JavaUtility;
import com.DataUtility.vtiger.WebDriverUtility;
import com.DataUtility.vtiger.excelUtility;
import com.ObjectRepositaryHomePage.HomePage;
import com.ObjectRepositaryOrgnisation.vtiger.CreateOrganisationsPage;
import com.ObjectRepositaryOrgnisation.vtiger.OrganisationsPage;
//@Listeners(org.GenricLib.vtiger.Listners.class)
public class CreateOrganisationByIndustryDropDown extends BaseClass{
	
	@Test
	public void creOrgWithDorpDown() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsButton().click();
		
		OrganisationsPage o = new OrganisationsPage(driver);
		o.getPlusSymbolClick().click();
		CreateOrganisationsPage co = new CreateOrganisationsPage(driver);
		eu= new excelUtility();
		ju=new JavaUtility();
		wdu= new WebDriverUtility(); 
		int data=ju.randomNumber();
		co.getOrgName().sendKeys(eu.singleDataFetch(Iconstant.excelPath,"LeadData",7,2)+data);
	    
		wdu.dropDownByValue(co.getIndustryDropDown(),eu.singleDataFetch(Iconstant.excelPath,"LeadData",4,3));
	
	    co.getSaveButton().click();
	    
	}
	
	
	
	
	
	
	

}
