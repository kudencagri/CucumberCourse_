
  Feature: Country Multi Scenario

    Background:  # Before Scenario:
      When Enter username and password and click login button
      Then User should login successfully
      And Navigate to country

    Scenario: Create country

      When create country
      Then Success message should be displayed

    Scenario: Create country 2

      When create country name as "Memleket" code as "Mem21"
      Then Success message should be displayed