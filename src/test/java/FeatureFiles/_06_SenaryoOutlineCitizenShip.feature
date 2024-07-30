#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)
#yukarıdaki senaryoyu farklı 5 değer için çalıştırınız
Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship

  Scenario Outline: Create a Citizenship
    When Create a Citizenship name as "<name>" short name as "<shortname>"
    Then Success message should be displayed

    When Create a Citizenship name as "<name>" short name as "<shortname>"
    Then Already exist message should be displayed

    Examples:
      | name     | shortname|
      | DsYifK1  | dsAdi1   |
      | DsYifK2  | dsAdi2   |
      | DsYifK3  | dsAdi3   |
      | DsYifK4  | dsAdi4   |
      | DsYifK5  | dsAdi5   |