package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public  BrcPage()
    {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/div[2]/ul/li[5]/a")
    public WebElement loginFirst;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement userName;

    @FindBy(xpath = "//*[@class=\"btn btn-primary\"]")
    public WebElement secondLogin;

}

