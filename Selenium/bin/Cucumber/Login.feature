
Feature: Login page Faature 
 
  Scenario: Validate Login page 
    Given User is on Login page 
    Then Username field is Displayed 
    And Password field is Displayed 
    And Login field is Displayed 
     
    Scenario: Login Successfully
    Given User is on Login page 
    When User Enter Username
    And User Enter Password
    And Click on Login Page 
    
  

 