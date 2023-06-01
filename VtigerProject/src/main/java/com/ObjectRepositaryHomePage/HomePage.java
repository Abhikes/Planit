package com.ObjectRepositaryHomePage;

import org.GenricLib.vtiger.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DataUtility.vtiger.WebDriverUtility;

public class HomePage {
	WebDriverUtility wdu;
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendarButton;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadsButton;
	

	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement organizationsButton;
	
	@FindBy(xpath ="//a[text()='Contacts']")
	private WebElement contactButton;
	
	@FindBy(xpath ="//a[text()='Opportunities']")
	private WebElement OpportunitiesButton;
	
	@FindBy(xpath = "//td[@class='genHeaderSmall']/following-sibling::td/img")
	private WebElement logoutHover;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutButton;
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	 
	}

	public WebElement getCalendarButton() {
		return calendarButton;
	}

	public WebElement getLeadsButton() {
		return leadsButton;
	}

	public WebElement getOrganizationsButton() {
		return organizationsButton;
	}

	public WebElement getContactButton() {
		return contactButton;
	}

	public WebElement getOpportunitiesButton() {
		return OpportunitiesButton;
	}
	
	public void logOutbutton(WebDriver driver)
	{
		wdu= new WebDriverUtility();
		wdu.moveTheCursor(driver,logoutHover);
		signOutButton.click();
	}
	
	
	
	
	
	
	
}
