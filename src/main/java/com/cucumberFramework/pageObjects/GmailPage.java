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

public class GmailPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLnk;
	
	@FindBy(xpath = "//input[contains(@class,'VJZDxU') and @type='text']")
	private WebElement enterEmail;
	
	@FindBy(xpath = "//input[contains(@class,'VJZDxU') and @type='password']")
	private WebElement enterPassword;
	
	@FindBy(xpath = "//button[contains(@class,'AWRsL') and @type='submit']")
	private WebElement loginBtn;	
	
	@FindBy(xpath = "//*[text()='This site can’t be reached']")
	private WebElement urlLaunchErrorMsg ;
	
	@FindBy(xpath = "//span[contains(@class,'KMOx')]//span")
	private WebElement loginErrorMessage ;
	
	
	
	
	WaitHelper waitHelper;
	
	public GmailPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void clickOnLoginLink(String userName){
		loginLnk.click();
	}
	public void enterUserName(String userName){
		enterEmail.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		enterPassword.sendKeys(password);
	}
	
	public void clickOnLoginLink(){
		loginLnk.click();
	}
	
	public void clickSignInButton(){
		Actions builder = new Actions(driver);
		builder.moveToElement(loginBtn).build().perform();
		loginBtn.click();
	}
	
	public void verifyLoginErrorMessage(){
		Assert.assertEquals(true, loginErrorMessage.isDisplayed());
	}
	
	public void verifyWrongUrlErrorMessage() throws InterruptedException{
		Thread.sleep(10000);
		Assert.assertEquals(true, urlLaunchErrorMsg.isDisplayed());
	}
	
	
	
	
	/*
	 * public void clickHeadphonesLnk(){ Actions builder = new Actions(driver);
	 * builder.moveToElement(allShopNav).build().perform();
	 * builder.moveToElement(TvApplElecPanel).build().perform(); JavascriptExecutor
	 * js = (JavascriptExecutor)driver; js.executeScript("arguments[0].click();",
	 * headPhonesCatLnk);
	 * 
	 * }
	 */
		
	
}
