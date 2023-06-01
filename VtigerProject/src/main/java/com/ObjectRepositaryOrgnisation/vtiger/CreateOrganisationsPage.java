package com.ObjectRepositaryOrgnisation.vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author QSPJSP
 *
 */
public class CreateOrganisationsPage {
	
	@FindBy (name="accountname")
	
	private WebElement orgName;
	

    @FindBy (name="website")
	
	private WebElement webSite;
	
    @FindBy (name="tickersymbol")
	
	private WebElement tikSymbol;
    
    @FindBy (css = "img[title='Select']")
    
    private WebElement plusNewWindow;
    
    @FindBy (name = "industry")
    
    private WebElement industryDropDown;
    
    @FindBy (css = "input[title='Save [Alt+S]']")
    
    private WebElement saveButton;
    
    @FindBy(xpath = "//span[@class='lvtHeaderText']")
    
    private WebElement createNewOrgText;
    
    

	public WebElement getCreateNewOrgText() {
		return createNewOrgText;
	}

	public CreateOrganisationsPage(WebDriver driver) {
		
    	PageFactory.initElements(driver,this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebSite() {
		return webSite;
	}

	public WebElement getTikSymbol() {
		return tikSymbol;
	}

	public WebElement getPlusNewWindow() {
		return plusNewWindow;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
    //BussinessLogic:
    
    /**
     * It will create Organisation By new Organisation
     * @param newOrgName
     */
	public void creatOrgByOrgName(String newOrgName)
	{
		orgName.sendKeys(newOrgName);
		saveButton.click();
	}
	/**
     * It will create Organisation By new Organisation and Website
     * @param newOrgName
     */
	public void creatOrgByOrgAndWebSite(String newOrgName,String webSite)
	{
		orgName.sendKeys(newOrgName);
		orgName.sendKeys(webSite);
		saveButton.click();
	}
	
	
	
	
	
    
	
    
    
    
}
