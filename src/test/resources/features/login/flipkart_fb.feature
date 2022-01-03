
Feature: Login to Flipkart 

  @tag1
  Scenario: Observe the product screen
      Given Go to URL "https://www.Flipkart.com"
    #And Click to Log in
    When Sign in with "madhutappeta210@gmail.com" and "madhu123" 
    #And Click on the Electronics
    Then user able to logged in successfully
    Then Observe the cursor on Electronics highlighted
    When Move the mouse on Search bar
    And Type any product on search bar "Samsung Mobile"
    Then Check the search result page with product given
    @tag2
    Scenario Outline: Verify user able to signup in to Facebook page
    
    Given Navigate to "http://www.fb.com"
    Then Verify that the page is redirected to "http://www.facebook.com"
    Then Verify that there is a Create an account section on the page
     And user clicks on Create an account
    When User Fill in the text boxes "<First Name>" "<Surname>" "<MobileNumberOrEmail>" "<password>"
    And User updates the date of birth in the drop-down
    And user selects gender
   
    #Then Verify that the account is created successfully
    
    Examples:
    
    
    |FirstName| Surname| MobileNumberOrEmail| password|
    |Madhu |Sudan  |madhutappeta210@gmail.com|Madhu@1234|
    
    
    
   

  