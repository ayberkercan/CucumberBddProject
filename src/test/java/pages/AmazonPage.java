package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class AmazonPage {
    // AmazonPage sınıfının constructor'ı.
    // Bu constructor, sayfa nesnelerini (WebElement'leri) bulmak için PageFactory'yi başlatır.
    public  AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Çerezleri reddetme bağlantısını temsil eden WebElement.
    @FindBy(xpath = "//*[@id='sp-cc-rejectall-link']")
    public WebElement cookies;


    // Arama kutusunu temsil eden WebElement.
    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public  WebElement searchBox;

    // Arama sonuçlarını temsil eden WebElement.
    @FindBy (xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement result;
}
