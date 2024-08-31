Feature: AddactInn Application

  Scenario Outline: Login Testing
    And when user enters username as "<username>"
    And when user enters password as "<password>"
    When user clicks login button
    When user search for "<hotel>"
    Then hotel name should be retrived and logged out

    Examples: 
      | username     | password    | hotel          |
      | AjayVcetEceb | Ajasou@1430 | Hotel Sunshine |
