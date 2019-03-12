package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.ManufacturingOrdersPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class responsibleTableStepDefinitions {

    private String userType;
    private String userName;
    private String password;

//    @Given("the {string} signs in")
//    public void the_signs_in(String string) {
//
//    }
//
//
//    @When("the user click Manufacturing module")
//    public void the_user_click_Manufacturing_module() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
    @Then("user clicks on Create button")
    public void user_clicks_on_Create_button() {
        new ManufacturingOrdersPage().createButton.click();;
    }

    @Then("user clicks on Responsible dropdown")
    public void user_clicks_on_Responsible_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user clicks on Search More button")
    public void user_clicks_on_Search_More_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("verify Responsible table of {string}, {string}, {string}, {string}")
    public void verify_Responsible_table_of(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
