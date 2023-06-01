package orgaisationModule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.GenricLib.vtiger.BaseClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.DataUtility.vtiger.WebDriverUtility;
import com.ObjectRepositaryHomePage.HomePage;
import com.ObjectRepositaryOrgnisation.vtiger.CreateOrganisationsPage;
import com.ObjectRepositaryOrgnisation.vtiger.OrganisationsPage;

/*
 * This class is used to verifu Create Organisation Page is dispayed or not
 * 
 */
//@Listeners(org.GenricLib.vtiger.Listners.class)

public class VerifyCreateorganisationNameTest extends BaseClass {
	
	@Test
	public void validatingHomePage()
	{
		String actdata="Creating New Organization";
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsButton().click();
		OrganisationsPage op = new OrganisationsPage(driver);
		op.getPlusSymbolClick().click();
	
		CreateOrganisationsPage cop = new CreateOrganisationsPage(driver);
		
		String expData= cop.getCreateNewOrgText().getText();
		wdu = new WebDriverUtility();
		wdu.validation(actdata, expData);
		
		Reporter.log("Create Organisation Displyed",true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
