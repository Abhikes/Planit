package orgaisationModule;

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
//@Listeners(org.GenricLib.vtiger.Listners.class)

public class CreateOrganisationBysymbolTest extends BaseClass {
	
	@Test
	public void createOrganistionBySymbol() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsButton().click();
		OrganisationsPage o = new OrganisationsPage(driver);
		o.getPlusSymbolClick().click();
		CreateOrganisationsPage co = new CreateOrganisationsPage(driver);
		eu= new excelUtility();
		ju=new JavaUtility();
		int data=ju.randomNumber();
		co.getOrgName().sendKeys(eu.singleDataFetch(Iconstant.excelPath,"LeadData",7,2)+data);
		co.getTikSymbol().sendKeys(eu.singleDataFetch(Iconstant.excelPath,"LeadData",7,3));
	}

}
