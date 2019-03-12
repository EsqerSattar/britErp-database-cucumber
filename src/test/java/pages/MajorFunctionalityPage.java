package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MajorFunctionalityPage {

    public MajorFunctionalityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Manufacturing Orders")
    public WebElement manufacturingOrdersLink;

    @FindBy(linkText = "Unbuild Orders")
    public WebElement unbuildOrdersLink;

    @FindBy(xpath = "//a[@data-action-id='596']")
    public WebElement manufacturingOrdersReport;
}
