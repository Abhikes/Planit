package orgaisationModule;

import org.GenricLib.vtiger.DataProviderClass;
import org.GenricLib.vtiger.Iconstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.DataUtility.vtiger.PropertyUtility;
import com.DataUtility.vtiger.WebDriverUtility;
import com.ObjectRepositaryHomePage.HomePage;
import com.ObjectRepositaryOrgnisation.vtiger.CreateOrganisationsPage;
import com.ObjectRepositaryOrgnisation.vtiger.OrganisationsPage;
import com.objectRepositaaryLogin.vtiger.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataOrgProvider extends DataProviderClass {
	@Test(dataProvider ="name" )
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
		cp.getOrgName().sendKeys("SS");
		
		cp.getWebSite().sendKeys(website);
		cp.getTikSymbol().sendKeys(tikSym);
		System.out.println(mem);
		System.out.println(emp);
		System.out.println(othEmail);
		cp.getSaveButton().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}

}
