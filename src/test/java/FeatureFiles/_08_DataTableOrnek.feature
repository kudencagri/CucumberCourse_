Feature:  DataTable Ornek

  Scenario: Users List

    When write username "ismet"
    And Write username and Password "ismet" and "1234"


    And Write username as DataTable

    |ismet|
    |mehmet|
    |ayse|
    |fatma|

    And Write username and Password as DataTable
      |ismet   |1234  |
      |mehmet  |45465 |
      |ayse    |12313 |
      |fatma   |2341  |