package com.objectRepositaaryLogin.vtiger;

import org.GenricLib.vtiger.Iconstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DataUtility.vtiger.PropertyUtility;
/**
 * 
 *This class stores the address of login Page
 *
 */
public class LoginPage {
	PropertyUtility pu;
	
	@FindBy(name="user_name")
	private WebElement usernameTextBox;
	
	@FindBy(name="user_password")
	private WebElement passwordTextBox;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
	 
		 PageFactory.initElements(driver,this);
	
	}
	//Business logic to fill username
	public WebElement getUsernameTextBox() {
		return usernameTextBox;
	}
	//Business logic to fill password
	
	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}
	//Business logic click login
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	//Business logic fill un and password and click on login
	/**
	 * This method will do the login at the time of calling
	 * @throws Throwable
	 */
	public void loginVtiger() throws Throwable
	{
		pu= new PropertyUtility();
		usernameTextBox.sendKeys(pu.propertyFetchData("un",Iconstant.propertyPath));
	    passwordTextBox.sendKeys(pu.propertyFetchData("pw",Iconstant.propertyPath));
	    loginButton.click();
	}
	
	
	
	
	
	

	
	
	
	
	
	
	

}
