Feature: Swag Labs Login functionality

  Scenario Outline: Login with valid credentials
    Given the swag labs application launched
    When the user enter username "<username>"
    And the user enter password "<password>"
    And the user click on login button
    Then the user redirected the home page "<HomePage>"

    Examples:
      | username      | password     | HomePage |
      # | standard_userrr | secret_sausecc | invalidcre |
      # |                 | secret_sause   | emptyuser  |
      # | standard_sauce  |                | emptypass  |
      | standard_user | secret_sauce | valid    |

  Scenario Outline: to verify the sort functionaltiy
    Given the user click on sort button
    When the user click on price high to low
    Then the user should be validtate the price

  Scenario Outline: to verify the add to cart product
    Given the user click on add to cart button
    When the user click on cart button
    Then the user should be validate the cart page

  Scenario Outline: to verify the checkout page
    Given the user click on checkout button
    Then the user validate the checkoutpage

  Scenario Outline: to verify the checkout information
    Given the user enter firstName "<FirstName>"
    When the user enter LastName "<LastName>"
    And the user enter Zipcode "<ZipCode>"
    And the user clikc on continue button
    And the user should be validate the checkout page
    Then the user click on finish button
    Then  the user should be validate the complete order
    Then the user click on back to home

    Examples:
      | FirstName | LastName | ZipCode |
      | Balaji    | J        | 636809  |
      
      Scenario Outline: to verify the gird functionality
      Given the user click on grid 
      When validate the grid page
      And the user click on addtocart btn
      And the user click on cart btn
      And the user validate the cart page
      And the user click on checkout btn
      And the user enter firstname "<FirstName>"
      And the user enter Lastname "<LastName>"
      And the user enter pincode "<ZipCode>"
      And the user click on continue btn
      And the  user should see validate the checkout page
      And the user click on finish btn
      Then the user should  validate the complete order
      Then the user should click on back to home
      
      Examples:
      | FirstName | LastName | ZipCode |
      | Bharathi    | M        | 636889  |
      
      Scenario Outline: to verify the menu functionality
      Given the user click on menu button
      When the user click on all items
      And the user should be validate the items
      And the user click on cart butn
      And the user click on menu
      And the user click on webview
      And the user enter url "<url>"
      And the user click on go to site
      When the user validate the webpage
      And the user click on menu
      When the user click on Qr code scanner
      And the user click on menu
      When the user click on geo location
      And the user validate the geo location page
      
      Examples:
      |url|
      |https://www.google.com|



