@E2E
Feature: Addactin Application tests

Background:


@prod @reg
  Scenario: Login should be successful
    
    And when user enters username as "AjayVcetEceb"
    And when user enters password as "Ajasou@1430"
    When user clicks login button
    Then login should be successful
@reg
  Scenario: Login should not be successful
    
    And when user enters username as "AjayVcetEceb"
    And when user enters password as "admin1234"
    When user clicks login button
    But login should not be successful
