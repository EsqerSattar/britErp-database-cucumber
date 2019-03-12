@smokeTest
  Feature: Major functionality of Manufacturing module


    Background:steps for user on the Manufacturing module page
      Given the "manager" signs in
      When the user click Manufacturing module
      Then the page title should be "Manufacturing Orders - Odoo"

    Scenario: Verify that Manufacturing Orders link clickable
      When user clicks on Manufacturing Orders link
      Then the page title should be "Manufacturing Orders - Odoo"

    Scenario: Verify that Unbuild Orders link clickable
      When the user click on Unbuild Orders link
      Then the page title should be "Unbuild Orders - Odoo"

    Scenario: Verify that Manufacturing Orders link under the Reporting category clickable
      When the user click on Manufacturing Orders link
      Then the page title should be "Manufacturing Orders - Odoo"

