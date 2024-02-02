package stepDefinitions;

import io.cucumber.java.en.*; // Cucumber için gerekli olan kütüphaneleri içeri aktarıyoruz.
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage; // AmazonPage sınıfını içeri aktarıyoruz.
import utilities.ConfigReader; // ConfigReader sınıfını içeri aktarıyoruz.
import utilities.Driver; // Driver sınıfını içeri aktarıyoruz.
import utilities.ReusableMethods; // ReusableMethods sınıfını içeri aktarıyoruz.

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage(); // AmazonPage sınıfından bir nesne oluşturuyoruz.

    @Given("user goes to amazon page")
    public void user_goes_to_amazon_page() {
        // Kullanıcının Amazon sayfasına gitmesini sağlayan adım.
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL")); // ConfigReader aracılığıyla Amazon URL'sini alıp sayfaya gitmesini sağlıyoruz.
        ReusableMethods.waitFor(1); // 1 saniye bekliyoruz.
        amazonPage.cookies.click(); // Çerez bildirimini kapatmak için tıklama yapıyoruz.
    }

    @When("user searches for iPhone")
    public void user_searches_for_i_phone() {
        // Kullanıcının iPhone için arama yapmasını sağlayan adım.
        amazonPage.searchBox.sendKeys("İphone", Keys.ENTER); // Arama kutusuna "İphone" yazıp Enter tuşuna basıyoruz.
    }

    @Then("user tests results include Iphone")
    public void user_tests_results_include_ıphone() {
        // Kullanıcının sonuçların "İphone" içerip içermediğini test ettiği adım.
        Assert.assertTrue(amazonPage.result.isDisplayed()); // Sonuçların görüntülendiğini doğruluyoruz.
    }

    @Then("user closes the page")
    public void user_closes_the_page() {
        // Kullanıcının sayfayı kapatması için adım.
        Driver.closeDriver(); // WebDriver'ı kapatıyoruz.
    }

    @When("user searches for Selenium")
    public void userSearchesForSelenium() {
        // Kullanıcının Selenium için arama yapmasını sağlayan adım.
        amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER); // Arama kutusuna "Selenium" yazıp Enter tuşuna basıyoruz.
    }

    @Then("user tests results Selenium")
    public void userTestsResultsSeleniumIphone(String Nesne) {
        // Kullanıcının sonuçların "Selenium" içerip içermediğini test ettiği adım.
        Assert.assertTrue(amazonPage.result.getText().contains(Nesne)); // Sonuçların belirtilen metni içerip içermediğini doğruluyoruz.
    }

    @When("user searches for {string}")
    public void userSearchesFor(String arananNesne) {
        // Kullanıcının belirtilen nesne için arama yapmasını sağlayan adım.
        amazonPage.searchBox.sendKeys(arananNesne,Keys.ENTER); // Arama kutusuna belirtilen nesneyi yazıp Enter tuşuna basıyoruz.
    }
}
