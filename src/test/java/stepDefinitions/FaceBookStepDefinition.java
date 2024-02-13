package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class FaceBookStepDefinition {
    @Given("User goes to {string} page")
    public void user_goes_to_page(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }
    @Then("User waits {int} seconds")
    public void user_waits_seconds(Integer beklemeSuresi) {
        ReusableMethods.waitFor(beklemeSuresi);

    }
    @When("Tests that the URL contains {string}")
    public void tests_that_the_url_contains(String istenenKelime) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenenKelime));
    }
    @When("Closes the page")
    public void closes_the_page() {
Driver.closeDriver();
    }


    @When("Tests whether the {string} exists")
    public void testsWhetherTheExists(String requestedURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(requestedURL));
    }
}
