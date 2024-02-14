package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {
    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@onclick='addElement()']")
    public WebElement addElementButton;

    @FindBy(xpath = "//*[@onclick='deleteElement()']")
    public WebElement deleteElementButton;

    @FindBy(xpath = "//*[@onclick='deleteElement()']")
    public List<WebElement> deleteElementButtonList;

}