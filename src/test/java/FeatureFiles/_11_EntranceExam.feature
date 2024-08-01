#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız

Feature: Exam functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Exam Create and Delete
    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | isxam1 |

    And Click on the element in Dialog
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

#    Silme ekranına ulaşmak için tekrar navigate yapıldı
    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And Click on the element in Dialog
      | searchAcademicPeriod |
      | academicPeriod1      |

    And user Delete item from Dialog Content
      | isxam1 |


    Then Success message should be displayed

  ####################################ORNEK KOD###########################################
#Feature: Fee Functionality
#  Background:
#    Given Navigate to Campus
#    When Enter username and password and click login Button
#    Then User should login successfully
#  Scenario Outline: Fee Functionality Senario
#    And Click on the element in LeftNav
#      | setup         |
#      | parameters    |
#      | fees          |
#
#    And Click on the element in Dialog
#      | addButton     |
#    And User sending the keys in Dialog
#      | Name            | <name>      |
#      | CountryCode     | <code>      |
#      | integrationCode | <intecod>   |
#      | priorityCode    | <priocode>  |
#    And  Click on the element in Dialog
#      | toggleBar       |
#      | saveButton      |
#    Then Success message should be displayed
#    And User delete the element from Dialog
#      |<name>|
#    Examples:
#      |name   |code  |intecod|priocode|
#      |kerok21|kero21|Ke21   |212121|
#      |kerok22|kero22|Ke22   |212122|
#      |kerok23|kero23|Ke23   |212123|
#      |kerok24|kero24|Ke24   |212124|
#      |kerok25|kero25|Ke25   |212125|