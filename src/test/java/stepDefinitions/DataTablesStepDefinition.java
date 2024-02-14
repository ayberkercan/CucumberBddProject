package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataBasePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class DataTablesStepDefinition {
    //Nesnemizi oluşturdum
    DataBasePage dataBasePage = new DataBasePage();
    Actions actions = new Actions(Driver.getDriver());
    @Then("User presses new button")
    public void userPressesNewButton() {
        dataBasePage.newButton.click();
    }

    @And("Write {string} in the name section")
    public void writeInTheNameSection(String firstname) {
       dataBasePage.firstName.sendKeys(firstname);

    }

    @And("Write {string} in the surname section")
    public void writeInTheSurnameSection(String lastname) {
        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();

    }

    @And("Write {string} in the position section")
    public void writeInThePositionSection(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();

    }

    @And("Write {string} in the office section")
    public void writeInTheOfficeSection(String office ) {
        actions.sendKeys(Keys.TAB).sendKeys(office).perform();
    }

    @And("Write {string} in the extension section")
    public void writeInTheExtensionSection(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("Write {string} in the  startDate section")
    public void writeInTheStartDateSection(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("Write {string} in the salary section")
    public void writeInTheSalarySection(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("User presses create button")
    public void userPressesCreateButton() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @When("User searches with {string}")
    public void userSearchesWith(String firstname) {
        dataBasePage.searchBox.sendKeys(firstname);
    }

    @And("It tests that there is {string} in the name section.")
    public void ıtTestsThatThereIsInTheNameSection(String name) {
        Assert.assertTrue(dataBasePage.result.isDisplayed());
    }

    @When("User goes to {string} homepage")
    public void userGoesToHomepage(String url)
    {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
}
