#Senaryo:
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And user Delete item from Dialog Content
      | <name> |

    Then Success message should be displayed

    Examples:
      | name    | code | intCode  | priority |
      | isKem1FaE1 | 2132 | PayPal   | 142335     |
      | isKem1FaE2 | 2133 | Cash     | 142336     |
      | isKem1FaE3 | 2144 | Cheque   | 142337     |
      | isKem1FaE4 | 2435 | ApplaPay | 142338     |
      | isKem1FaE5 | 2436 | Crypto   | 142339     |