package orgaisationModule;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.GenricLib.vtiger.BaseClass;
import org.GenricLib.vtiger.Iconstant;
import org.testng.annotations.Test;

import com.DataUtility.vtiger.JavaUtility;
import com.DataUtility.vtiger.excelUtility;
import com.ObjectRepositaryHomePage.HomePage;
import com.ObjectRepositaryOrgnisation.vtiger.CreateOrganisationsPage;
import com.ObjectRepositaryOrgnisation.vtiger.OrganisationsPage;

/**
 * 
 * @author Abhi
 *This class creates the Oraganisation by providing the  filling Organisation data
 */
//@Listeners(org.GenricLib.vtiger.Listners.class)

public class CreateOrganisationByOrganisationTest extends BaseClass {
	
	@Test
	public void m1() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsButton().click();
		OrganisationsPage o = new OrganisationsPage(driver);
		o.getPlusSymbolClick().click();
		CreateOrganisationsPage co = new CreateOrganisationsPage(driver);
		eu= new excelUtility();
		ju=new JavaUtility();
		
		String orName=eu.singleDataFetch(Iconstant.excelPath,"LeadData", 1, 2) ;
		     orName=orName+ju.randomNumber();
		co.creatOrgByOrgName(orName);
		
	
		
		
	}

}
