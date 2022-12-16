Feature: As a user, I should able to register in so that i can use my account facility
  @regression
  Scenario: I should able to register successfully with valid credentials

    Given I am on register page
    When I enter required registration
    Then I should able to register successfully

    Scenario: I should able to select product and add to cart

      Given I already logged in on demoknopcommerce
      When I Hoover the mouse to Electronic page and nevigate to Cellphone
      And I click on Cell Phones
      Then I should able to see Cell phones









