package com.DataUtility.vtiger;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.GenricLib.vtiger.Iconstant;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.auto.common.Visibility;
import com.google.common.io.Files;

/**
 * 
 * @author Abhishek
 * 
 * This class is for Vitiger Project
 *In which I will create the reusable methods of WebDriver Class
 */
public class WebDriverUtility {
	
	/*
	 * This methods is for maximizing the brwoser
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/*
	 * This methods is for minimize the browser
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public void minimizeBrowser(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	/*
	 * This methods is for resize the browser
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public void resizeBrowser(WebDriver driver,int h,int b)
	{
		driver.manage().window().setSize(new Dimension(h, b));
	}
	/*
	 * This methods is for refresh the browser
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public void refreshBrowser(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	/*
	 * This methods is for going Backward to  WebApplication
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void backBrowser(WebDriver driver)
	{
		driver.navigate().back();
	}
	/*
	 * This methods is for going forword to  WebApplication
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void forwordBrowser(WebDriver driver)
	{
		driver.navigate().back();
	}
	/*
	 * This methods is going to move the mouse cursor
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void moveTheCursor(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
	    act.moveToElement(ele).perform();
	}
	
	/*
	 * This methods is going to perform Right Click
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
	    act.moveToElement(ele).contextClick().build().perform();
	}
	/*
	 * This methods is going to perform Double Click
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
	    act.doubleClick(ele).perform();
	}
	/*
	 * This methods is going to perform dragAndDrop If U know source and Distination
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	
	public void dragAndDrop(WebDriver driver,WebElement ele,WebElement ele1)
	{
		Actions act = new Actions(driver);
	    act.dragAndDrop(ele, ele1).perform();
	}
	
	/*
	 * This methods is going to perform dragAndDrop If U know source and Distination
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public void dragAndDrop(WebDriver driver,WebElement ele,int x,int y)
	{
		Actions act = new Actions(driver);
	    act.dragAndDropBy(ele, x, y).perform();
	}
	/*
	 * This methods is going to perform scroll In webAplication
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public void scrollHandling(WebDriver driver,int x,int y)
	{
		
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy("+x+","+y+");");
	
	}
	/*
	 * This methods is going to perform ScreenShot
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public String screenShot(WebDriver driver,String path) throws IOException
	{
		TakesScreenshot sh = (TakesScreenshot)driver;
		File src = sh.getScreenshotAs(OutputType.FILE);
	
		File dist = new File(path);
		Files.copy(src, dist);
		
		return dist.getAbsolutePath();
	    
	}
	
	/*
	 * This methods is going to perform dropDown BY index
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public void dropDownByIndex(WebElement ele,int index)
	{
		
	    Select s = new Select(ele);
	    s.selectByIndex(index);
		
	}
	/*
	 * This methods is going to perform dropDown BY Value
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public void dropDownByValue(WebElement ele,String value)
	{
		
	    Select s = new Select(ele);
	    s.selectByValue(value);
		
	}
	/*
	 * This methods is going to perform dropDown BY VisibleText
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	public void dropDownByVisisbleText(WebElement ele,String visibleText )
	{
		
	    Select s = new Select(ele);
	    s.selectByVisibleText(visibleText);
		
	}
	/*
	 * This methods is going to perform dynamicDropDown B and Click It
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void dynamicDropDown(List<WebElement> ele,String expData)
	{
		 for(WebElement i:ele)
		 {
			 if(i.getText().contains(expData))
			 {
				 i.click();
				 break;
			 }
		 }
	}
	/*
	 * This methods is going to perform dynamicDropDown and print it
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void dynamicDropDownPrint(List<WebElement> ele,String expData)
	{
		 for(WebElement i:ele)
		 {
			 System.out.println(i.getText());
		 }
	}
	
	/*
	 * This methods is going to perform implicitWait
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void implicitWait(WebDriver driver,int seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	/*
	 * This methods is going to perform explicitWait by Visibility Of Element
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void explicittWaitByVisisbility(WebDriver driver,int seconds,String adress)
	{
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(""+adress+"")));
	
	}
	
	/*
	 * This methods is going to perform explicitWait by Visibility Of Element
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void explicittWaitByPresence(WebDriver driver,int seconds,String adress)
	{
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(""+adress+"")));
	
	}
	/*
	 * This methods is going to perform explicitWait by Visibility Of Element
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void explicittWaitByClicakle(WebDriver driver,int seconds,String adress)
	{
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""+adress+"")));
	
	}
	/*
	 * This methods is going to perform Alert to click on OK
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void alertToAccept(WebDriver driver)
	{
	   Alert alt = driver.switchTo().alert();
	   alt.accept();
	}
	/*
	 * This methods is going to perform Alert to  cancel
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void alertToCancel(WebDriver driver)
	{
	   Alert alt = driver.switchTo().alert();
	   alt.dismiss();
	}
	/*
	 * This methods is going to perform print message of Alert
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public String alertToPrintMessange(WebDriver driver)
	{
	   Alert alt = driver.switchTo().alert();
	      String data= alt.getText();
	      return data;
	}
	
	/*
	 * This methods is going to handle frame By index
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void frameByIndex(WebDriver driver,int index)
	{
	    driver.switchTo().frame(index); 
	  
	}
	
	/*
	 * This methods is going to handle frame By WebElement
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void frameByWebElement(WebDriver driver,WebElement ele)
	{
	    driver.switchTo().frame(ele); 
	  
	}
	/*
	 * This methods is going to handle frame By WebElement
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void frameByvisibleText(WebDriver driver,String vsisText)
	{
	    driver.switchTo().frame(vsisText); 
	  
	}
	/*
	 * This methods is going to switwth from framePage to mainPage
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void frameByMainPage(WebDriver driver)
	{
	    driver.switchTo().defaultContent();
	  
	}
	
	/*
	 * This methods is going to swith the driver ID of window
	 * Here I passed webdriver in methods paramter so tha driver ID must pass 
	 */
	
	public void handleWindow(WebDriver driver,String title)
	{
	    Set<String> str=driver.getWindowHandles();
	    
	    for(String d:str)
	    {
	    	String data =driver.switchTo().window(d).getTitle();
	    	
	    	if(data.contains(title))
	    	{
	    		driver.switchTo().window(d);
	    		break;
	    	}
	    }
	   
	  
	}
	/**
	 * This methods is hard assert and it will validate the two data
	 * @param actData
	 * @param expData
	 */
	
	public void validation(String actData,String expData)
	    {
	    	Assert.assertEquals(actData, expData);
	    	Reporter.log("Varification Sucesssfull");
	    }
	
	public String getTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

    	
	
	
	
	
	
	
	
	
	
	

}
