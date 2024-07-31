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
    |nameInput|KuNt4|
    |codeInput|Ktsde5 |

    And Click on the element in Dialog
    |saveButton|

    Then Success message should be displayed

    And user Delete item from Dialog Content
    |KuNt4|

    Scenario: Create CitizenShip

      And Click on the element in LeftNav
        |setup     |
        |parameters|
        |citizenship |
      And Click on the element in Dialog
        |addButton|
      And User sending the keys in Dialog
        |nameInput|KuNt4|
        |shortname|Ktsde5 |
      And Click on the element in Dialog
        |saveButton|
      Then Success message should be displayed
      And user Delete item from Dialog Content
        |KuNt4|
      Then Success message should be displayed


  Scenario:  Create Nationality
    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | isayRt1 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And user Delete item from Dialog Content
      | isayRt1 |

    Then Success message should be displayed

  Scenario: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |



    And User sending the keys in Dialog
      | nameInput       | i1Fee1a |
      | codeInput       | i223a   |
      | integrationCode | 134314  |
      | priorityCode    | 44131   |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And user Delete item from Dialog Content
      | i1Fee1a |

    Then Success message should be displayed



