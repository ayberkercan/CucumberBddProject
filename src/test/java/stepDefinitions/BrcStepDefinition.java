package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepDefinition {
BrcPage brcPage =new BrcPage(); // Beklediğimiz locate leri çekebilmemiz için Obje oluşturuyoruz.
    Actions actions=new Actions(Driver.getDriver());
    @Given("On the user {string} homepage")
    public void on_the_user_homepage(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }
    @Then("clicks on the login text")
    public void clicks_on_the_login_text() {
   brcPage.loginFirst.click();
    }

    @Then("user enters invalid username")
    public void user_enters_invalid_username() {
     brcPage.userName.sendKeys(ConfigReader.getProperty("wrongUserName"));
    }
    @Then("user enters invalid password")
    public void user_enters_invalid_password() {
     actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("wrongPassword")).perform();
    }
    @Then("clicks on the login button")
    public void clicks_on_the_login_button() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }
    @Then("Tests whether the page can be logged in")
    public void tests_whether_the_page_can_be_logged_in() {
        Assert.assertTrue(brcPage.secondLogin.isDisplayed());

    }



}
