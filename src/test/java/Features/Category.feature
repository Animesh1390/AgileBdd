Feature: category

  @regression

  Scenario Outline: As a user I should able to nevigate to computer category page successfully

    When i click on "<category_page>" link
    Then I should able to nevigate to related "<category_link>" page successfully
    Examples:
      | category_page     | category_link     |
      | Computers         | computers         |
      | Electronics       | electronics       |
      | Apparel           | apparel           |
      | Digital downloads | digital-downloads |
      | Books             | books             |
      | Jewelry           | jewelry           |
      | Gift Cards        | gift-cards        |







