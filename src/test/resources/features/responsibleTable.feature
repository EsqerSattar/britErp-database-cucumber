@es
Feature: User as a manager should be abel to verify the Responsible table

  Scenario Outline: Verify that Search: Responsible table
    Given the "manager" signs in
    When the user click Manufacturing module
    Then user clicks on Create button
    Then user clicks on Responsible dropdown
    And user clicks on Search More button
    Then verify Responsible table of "<Name>", "<Login>", "<Language>", "<Latest connection>"

    Examples:

      |Name             |  Login                   | Language| Latest connection|
      |Administrator    |admin                     | English | 03/11/2019       |
      |Aziza            |azizulya@gmail.com        | English | 01/14/2019       |
      |EventsCRM_Manager|EventsCRM_Manager@info.com| English | 03/11/2019       |