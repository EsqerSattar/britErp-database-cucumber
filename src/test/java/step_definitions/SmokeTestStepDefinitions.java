package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.MajorFunctionalityPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SmokeTestStepDefinitions {

    private String userType;
    private String userName;
    private String password;

    @When("the user goes to URL")
    public void the_user_goes_to_URL() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String title) {
        BrowserUtils.pageTitleContains(title,10);
    }

    @Then("the page URL should contain {string}")
    public void the_page_URL_should_contain(String url) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(url));
    }

//    @Given("the user click BriteErpDemo database")
//    public void the_user_click_BriteErpDemo_database() {
//        LoginPage loginPage = new LoginPage();
//        loginPage.clickDemo.click();
//    }



    @When("the {string} enters valid email")
    public void the_enters_valid_email(String user) {
       switch (user){
           case "manager":
               userType = user;
               userName = ConfigurationReader.getProperty("managerLogin");
               break;
           case "user":
               userType = user;
               userName = ConfigurationReader.getProperty("userLogin");
               break;
           default:
               throw new RuntimeException("You can only login as Manager or User");
       }

       LoginPage loginPage = new LoginPage();
       loginPage.Email.sendKeys(userName);

    }

    @When("the {string} enters valid password")
    public void the_enters_valid_password(String user) {
        switch (user){
            case "manager":
                userType = user;
                password = ConfigurationReader.getProperty("managerPass");
                break;
            case "user":
                userType = user;
                password = ConfigurationReader.getProperty("userPass");
                break;
            default:
                throw new RuntimeException("You can only login as Manager or User");
        }
        LoginPage loginPage = new LoginPage();
        loginPage.Password.sendKeys(password);
    }

    @When("the user clicks Log in button")
    public void the_user_clicks_Log_in_button() {
        new LoginPage().loginButton.click();
    }

    @Given("the {string} signs in")
    public void the_signs_in(String user) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

//        new LoginPage().clickDemo.click();

        switch (user) {
            case "manager":
                userType = user;
                userName = ConfigurationReader.getProperty("managerLogin");
                password = ConfigurationReader.getProperty("managerPass");
                break;
            case "user":
                userType = user;
                userName = ConfigurationReader.getProperty("userLogin");
                password = ConfigurationReader.getProperty("userPass");
                break;
            default:
                throw new RuntimeException("You only can login as User or Manager");
        }

        LoginPage loginPage = new LoginPage();
        loginPage.Email.sendKeys(userName);
        loginPage.Password.sendKeys(password);
        loginPage.loginButton.click();

        BrowserUtils.pageTitleContains("#Inbox - Odoo", 10);

    }

    @When("the user click Manufacturing module")
    public void the_user_click_Manufacturing_module() {
        new LoginPage().module.click();
        BrowserUtils.pageTitleContains("Manufacturing Orders - Odoo",10);
    }

    @When("user clicks on Manufacturing Orders link")
    public void user_clicks_on_Manufacturing_Orders_link() {
        new MajorFunctionalityPage().manufacturingOrdersLink.click();
        BrowserUtils.pageTitleContains("Manufacturing Orders - Odoo",10);
    }

    @Then("the user click on Unbuild Orders link")
    public void the_user_click_on_Unbuild_Orders_link() {
        new MajorFunctionalityPage().unbuildOrdersLink.click();
        BrowserUtils.pageTitleContains("Unbuild Orders - Odoo",5);
    }

    @When("the user click on Manufacturing Orders link")
    public void the_user_click_on_Manufacturing_Orders_link() {
        new MajorFunctionalityPage().manufacturingOrdersReport.click();
    }




}
