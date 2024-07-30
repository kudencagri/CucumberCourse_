Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country

    And Click on the element in LeftNav
    |setup     |
    |parameters|
    |countries |

    And Click on the element in Dialog
    |addButton|

    And User sending the keys in Dialog
    |nameInput|kudenU1|
    |codeInput|adıaoı |

    And Click on the element in Dialog
    |saveButton|

    And user Delete item from Dialog Content
    |kudenU1|