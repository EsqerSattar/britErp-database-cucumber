@smokeTest
Feature: Test environment is up and running

  Scenario: Verify the url is running
    When the user goes to URL
    Then the page title should be "Login | Website localhost"
    And the page URL should contain "http://54.148.96.210/web/login"

  Scenario Outline: Verify 'Log in' functionality
    When the "<valid user>" enters valid email
    And the "<valid user>" enters valid password
    And the user clicks Log in button
    Then the page title should be "#Inbox - Odoo"
   And the page URL should contain "active_id"

    Examples: valid users
    | valid user|
    | manager   |
    | user      |

