package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepDefinition {
    // BrcPage sınıfından bir nesne oluşturuyoruz.
    BrcPage brcPage = new BrcPage();

    // Selenium Actions sınıfından bir nesne oluşturuyoruz.
    Actions actions = new Actions(Driver.getDriver());

    // Kullanıcı belirli bir URL'de bulunan ana sayfada olduğunda gerçekleşecek adım.
    @Given("On the user {string} homepage")
    public void on_the_user_homepage(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL)); // Belirtilen URL'ye gitme işlemini gerçekleştirir.
    }

    // Kullanıcı giriş metnine tıkladığında gerçekleşecek adım.
    @Then("clicks on the login text")
    public void clicks_on_the_login_text() {
        brcPage.loginFirst.click(); // Giriş metnine tıklama işlemini gerçekleştirir.
    }

    // Kullanıcı geçersiz bir kullanıcı adı girerken gerçekleşecek adım.
    @Then("user enters invalid username")
    public void user_enters_invalid_username() {
        brcPage.userName.sendKeys(ConfigReader.getProperty("wrongUserName")); // Geçersiz bir kullanıcı adı girer.
    }

    // Kullanıcı geçersiz bir şifre girerken gerçekleşecek adım.
    @Then("user enters invalid password")
    public void user_enters_invalid_password() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("wrongPassword")).perform(); // Geçersiz bir şifre girer.
    }

    // Kullanıcı giriş düğmesine tıkladığında gerçekleşecek adım.
    @Then("clicks on the login button")
    public void clicks_on_the_login_button() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform(); // Giriş düğmesine tıklama işlemini gerçekleştirir.
    }

    // Sayfanın giriş yapılıp yapılamadığını test ettiğinde gerçekleşecek adım.
    @Then("Tests whether the page can be logged in")
    public void tests_whether_the_page_can_be_logged_in() {
        Assert.assertTrue(brcPage.secondLogin.isDisplayed()); // İkinci giriş sayfasının görüntülendiğini doğrular.
    }
}
