package com.cucumberFramework.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.LoginPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps extends TestBase {

	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

@Given("^Go to URL \"([^\"]*)\"$")
public void go_to_URL(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.get(arg1);
}

@Given("^Click to Log in$")
public void click_to_Log_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	loginPage.clickOnLoginLink();
    
}

@When("^Sign in with \"([^\"]*)\" and \"([^\"]*)\"$")
public void sign_in_with_and(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
loginPage.enterUserName(arg1);
loginPage.enterPassword(arg2);
loginPage.clickSignInButton();
}
/*
 * @When("^Click on the Electronics$") public void click_on_the_Electronics()
 * throws Throwable { // Write code here that turns the phrase above into
 * concrete actions loginPage.clickOnElectronics(); }
 */

@Then("^user able to logged in successfully$")
public void observe_the_product_screen() throws Throwable {
    homePage.myAccountIsDisplayed();
}
@Then("^Observe the cursor on Electronics highlighted$")
public void Observe_the_cursor_on_Electronics_highlighted() throws Throwable {
    homePage.verifyElectronicsHighlighted();
}	
@When("^Move the mouse on Search bar$")
public void move_the_mouse_on_Search_bar() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 homePage.moveToSearchBar();
   
}

@When("^Type any product on search bar \"([^\"]*)\"$")
public void type_any_product_on_search_bar(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	homePage.enterTextInSearchbar(arg1);
    
}

@Then("^Check the search result page with product given$")
public void check_the_search_result_page_with_product_given() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	homePage.printResultsText();
}
@Then("^user able to see the error message$")
public void user_able_to_see_the_error_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    loginPage.verifyLoginErrorMessage();
}

@Then("^verify page error$")
public void verify_page_error() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    loginPage.verifyWrongUrlErrorMessage();
}
}