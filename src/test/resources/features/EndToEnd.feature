Feature: EndToEnd

  Scenario Outline: validate that user can add an item successfully to cart after sign up
    Given  user is in the home page
    When click on sign in text in home page
    And click on create account link in login page
    And select social title "<socialTitle>" in create account page
    And enter first name "<firstName>" in create account page
    And enter last name "<lastName>" in create account page
    And enter email "<email>" in create account page
    And enter password "<password>" in create account page
    And enter birthdate with month "<birthdateMonth>", day "<birthdateDay>" and year "<birthdateYear>" in create account page
    And click on agree to terms and conditions check box in create account page
    And  click on agree to customer data privacy check box in create account page
    And click on save button in create account page
    And enter "<productName>" in search bar in home page
    And click on product number 1 in results page
    Then product image is displayed in product details page
    When click on add to cart button in product page
    And click on proceed to checkout button in added to cart overlay
    Then added product is displayed successfully in the cart page
    Examples:
      | socialTitle | firstName | lastName | email           | password   | birthdateMonth | birthdateDay | birthdateYear | productName |
      | Mr          | ahmed     | mohamed  | nabil@gmail.com | Karim123!  | 11             | 15           | 2000          | notebook    |