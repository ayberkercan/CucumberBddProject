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

    // Kullanıcının Amazon sayfasına gitmesini sağlayan adım.
    @Given("user goes to amazon page")
    public void user_goes_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL")); // ConfigReader aracılığıyla Amazon URL'sini alıp sayfaya gitmesini sağlıyoruz.
        ReusableMethods.waitFor(1); // 1 saniye bekliyoruz.
        amazonPage.cookies.click(); // Çerez bildirimini kapatmak için tıklama yapıyoruz.
    }

    // Kullanıcının iPhone için arama yapmasını sağlayan adım.
    @When("user searches for iPhone")
    public void user_searches_for_i_phone() {
        amazonPage.searchBox.sendKeys("İphone", Keys.ENTER); // Arama kutusuna "İphone" yazıp Enter tuşuna basıyoruz.
    }

    // Kullanıcının sonuçların "İphone" içerip içermediğini test ettiği adım.
    @Then("user tests results include Iphone")
    public void user_tests_results_include_ıphone() {
        Assert.assertTrue(amazonPage.result.isDisplayed()); // Sonuçların görüntülendiğini doğruluyoruz.
    }

    // Kullanıcının sayfayı kapatması için adım.
    @Then("user closes the page")
    public void user_closes_the_page() {
        Driver.closeDriver(); // WebDriver'ı kapatıyoruz.
    }

    // Kullanıcının Selenium için arama yapmasını sağlayan adım.
    @When("user searches for Selenium")
    public void userSearchesForSelenium() {
        amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER); // Arama kutusuna "Selenium" yazıp Enter tuşuna basıyoruz.
    }

    // Kullanıcının sonuçların "Selenium" içerip içermediğini test ettiği adım.
    @Then("user tests results Selenium")
    public void userTestsResultsSeleniumIphone(String Nesne) {
        Assert.assertTrue(amazonPage.result.getText().contains(Nesne)); // Sonuçların belirtilen metni içerip içermediğini doğruluyoruz.
    }

    // Kullanıcının belirtilen nesne için arama yapmasını sağlayan adım.
    @When("user searches for {string}")
    public void userSearchesForr(String arananNesne) {
        amazonPage.searchBox.sendKeys(arananNesne,Keys.ENTER); // Arama kutusuna belirtilen nesneyi yazıp Enter tuşuna basıyoruz.
    }


    // Kullanıcının belirli bir kelimeyi aramasını sağlayan adım.
    @Then("User searches for {string}")
    public void userSearchesFor(String searchedWord) {
        amazonPage.searchBox.sendKeys(searchedWord,Keys.ENTER); // Belirtilen kelimeyi arama kutusuna yazıp Enter tuşuna basıyoruz.
    }

    // Sonuçların belirtilen kelimeyi içerip içermediğini test eden adım.
    @Then("Tests that the results contain {string}")
    public void testsThatTheResultsContain(String DogrulananKelime) {
        Assert.assertTrue(amazonPage.result.getText().contains(DogrulananKelime)); // Sonuçların belirtilen kelimeyi içerip içermediğini doğruluyoruz.
    }

    // Sayfayı kapatma adımı
    @And("closes the page")
    public void closesThePage() {
    }

    @Given("User goes to amazon page")
    public void userGoesToAmazonPage() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
    }
}
