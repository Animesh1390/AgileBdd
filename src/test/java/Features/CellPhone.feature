Feature:buying product
@Cell
  Scenario: verify register user should be able to buy a product successfully
    Given I am registered user
    When I add product to cart
    And I enter personal details for checkout
    And I enter valid card details
    Then I should be able to buy a product successfully