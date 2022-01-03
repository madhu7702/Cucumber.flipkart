package com.cucumberFramework.pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;

import junit.framework.Assert;

public class HomePage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//div[text()='Electronics']")
	private WebElement Electronics ;
	@FindBy(xpath="//a[text()='Electronics GST Store']")
	private WebElement ElectronicsGstStoreLnk;
	@FindBy(name="q")
	private WebElement searchBar;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//span[contains(text(),'Showing 1 – 24 of 719 results for')]")
	private WebElement expectedProductResultsText;
	
	
	
	
	WaitHelper waitHelper;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void myAccountIsDisplayed() throws InterruptedException{
		Thread.sleep(3000);
		Assert.assertEquals(true, myAccount.isDisplayed());
	}	
	public void verifyElectronicsHighlighted() throws InterruptedException{
		Actions actions=new Actions(driver);
		actions.moveToElement(Electronics).build().perform();
		Thread.sleep(10000);
		Assert.assertEquals(true, ElectronicsGstStoreLnk.isDisplayed());
		
	}	
	public void enterTextInSearchbar(String text) throws InterruptedException{
		Thread.sleep(3000);
		searchBar.sendKeys("Samsung Mobile");
		searchButton.click();
	}
	public void moveToSearchBar() throws InterruptedException{
	Actions actions=new Actions(driver);
	actions.moveToElement(searchBar);
	}
	public void EnterTextInSearchBtn() throws InterruptedException{
		Thread.sleep(3000);
		searchBar.sendKeys("Samsung Mobile");
		
	}	
	
	public void printResultsText() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println(expectedProductResultsText.getText());
		
	}	

}
