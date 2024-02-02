package stepDefinitions;

import io.cucumber.java.en.*; // * koyarsak given when then hepsini Import etmiş oluyoruz.
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    @Given("user goes to amazon page")
    public void user_goes_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL")); // ConfigReader.getProperty(" link URL tanımlandı.") . configuration.properties de amazon url tanımlanmıştı.
        ReusableMethods.waitFor(1);
       amazonPage.cookies.click();
    }
    @When("user searches for iPhone")
    public void user_searches_for_i_phone() {
    amazonPage.searchBox.sendKeys("İphone", Keys.ENTER);
    }
    @Then("user tests results include Iphone")
    public void user_tests_results_include_ıphone() {
        Assert.assertTrue(amazonPage.result.isDisplayed());

    }
    @Then("user closes the page")
    public void user_closes_the_page() {
        Driver.closeDriver();

    }

    @When("user searches for Selenium")
    public void userSearchesForSelenium() {
        amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER);
    }

    @Then("user tests results Selenium Iphone")
    public void userTestsResultsSeleniumIphone(String Nesne) {
        Assert.assertTrue(amazonPage.result.getText().contains(Nesne));

    }

    @When("user searches for {string}")
    public void userSearchesFor(String arananNesne) {
        amazonPage.searchBox.sendKeys(arananNesne,Keys.ENTER);
    }
}
