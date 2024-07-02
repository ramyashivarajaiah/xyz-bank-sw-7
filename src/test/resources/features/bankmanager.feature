Feature: Bank manager user option working successfully
  As a user I should be able to add customer and open account successfully

  Background:
    Given I am on Bank Manager login tab

  @author_Ramya @smoke
  Scenario: Bank Manager Should Add Customer Successfully
    When I click on "Add Customer" Tab
    And I enter FirstName
    And I enter Last Name
    And I enter Postcode
    And I click on "Add Customer" Button
    And popup display
    Then I verify message "Customer added Successfully"
    And I click on ok button on popup.

  @author_Ramya @sanity
  Scenario: Bank Manager Should Open Account Successfully
    When I click on Open Account Tab
    And I search customer that created in first test
    And I search currency "Pound"
    And I click on process button
    And popup display
    Then I verify message "Account created successfully"
    And I click on ok button on popup.