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

public class FacbookPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	public WebElement createNewAccount;
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement surname;
	
	@FindBy(name = "reg_email__")
	private WebElement emailOrMobile;
	
	@FindBy(name = "reg_passwd__")
	private WebElement newPassword ;
	
	
	@FindBy(name = "birthday_day")
	private WebElement birthDay;
	
	@FindBy(name = "birthday_day")
	private WebElement birthMonth;
	
	@FindBy(name = "birthday_year")
	private WebElement birthYear;
	
	@FindBy(xpath = "//input[@name='sex' and @value='1']")
	private WebElement femaleRdo ;
	
	@FindBy(xpath="//button[@type='submit' and @name='websubmit']")
	
	private WebElement signUpBtn ;
	
	
	WaitHelper waitHelper;
	
	public FacbookPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void clickOnCreateNewAccount(){
		//createNewAccount.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("argumentss[0].click();", createNewAccount);
	}
	public void enterFirstName(String userName){
		firstName.sendKeys(userName);
	}
	
	public void enterSurName(String userName){
		surname.sendKeys(userName);
	}

	public void enterEmailOrMobile(String email){
		emailOrMobile.sendKeys(email);
	}
	
	public void enterNewPassword(String userName){
		newPassword.sendKeys(userName);
	}
	
	public void selectBirthDay(){
		Select day=new Select(birthDay);
		day.selectByValue("20");
		
	}
public void selectBirthMonth(){
	Select month=new Select(birthMonth);
	month.selectByValue("Jan");
		
	}
public void selectBirthYear(){
	Select year=new Select(birthDay);
	year.selectByValue("1989");
}
public void selectGenderAsFemale(){
	femaleRdo.click();
	
}

public void clickOnSignUpBtn(){
	femaleRdo.click();
	
}



	
}
