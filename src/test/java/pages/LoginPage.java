package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText ="BriteErpDemo")
    public WebElement clickDemo;

    @FindBy(id="login")
    public WebElement Email;

    @FindBy(id="password")
    public WebElement Password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginButton;

    //clicking Manufacturing module
    @FindBy (linkText="Manufacturing")
    public WebElement module;

    public void loginAsManager() {
        new LoginPage();//.clickDemo.click();
        Email.sendKeys(ConfigurationReader.getProperty("managerLogin"));
        Password.sendKeys(ConfigurationReader.getProperty("managerPass"));
        loginButton.click();
    }


    }


