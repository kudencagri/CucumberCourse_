#  Excelden okuduğunuz Citizenship bilgilerini önce hepsini kaydedin
#  daha sonrada siliniz.

Feature: ApachePOI Citizen functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country

  Scenario: Create and Delete country from excel
    When User create citizenship with ApachePOI
    Then User delete citizenship with ApachePOI