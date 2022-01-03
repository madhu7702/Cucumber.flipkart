package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.FacbookPage;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.LoginPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class FacebookSteps extends TestBase {

	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	FacbookPage fbPage=new FacbookPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	

@Given("^Navigate to \"([^\"]*)\"$")
public void navigate_to_http_www_fb_com(String url) throws Throwable {
    driver.get(url);
   
}

@Then("^Verify that the page is redirected to \"([^\"]*)\"$")
public void verify_that_the_page_is_redirected_to_http_www_facebook_com(String url) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	Assert.assertEquals(true, driver.getCurrentUrl().contains("facebook"));
   
}

@Then("^Verify that there is a Create an account section on the page$")
public void verify_that_there_is_a_Create_an_account_section_on_the_page() throws Throwable {
    
   Assert.assertEquals(true, fbPage.createNewAccount.isDisplayed());
}

@When("^User Fill in the text boxes \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void user_Fill_in_the_text_boxes(String arg1, String arg2, String arg3, String arg4) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    fbPage.enterFirstName(arg1);
    fbPage.enterSurName(arg2);
    fbPage.enterEmailOrMobile(arg3);
    fbPage.enterNewPassword(arg4);
}

@When("^User updates the date of birth in the drop-down$")
public void user_updates_the_date_of_birth_in_the_drop_down() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	fbPage.selectBirthDay();
	fbPage.selectBirthMonth();
	fbPage.selectBirthYear();
	   
}

@When("^user selects gender$")
public void user_selects_gender() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   fbPage.selectGenderAsFemale();
}

@When("^user clicks on Create an account$")
public void user_clicks_on_Create_an_account() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	fbPage.clickOnCreateNewAccount();
    
}

@Then("^Verify that the account is created successfully$")
public void verify_that_the_account_is_created_successfully() throws Throwable {
   
    

}
}