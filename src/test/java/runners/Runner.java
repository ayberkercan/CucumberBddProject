package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
          "pretty"  , //renkli yazdırmak için
          "html:target/cucumber-reports.html",
                "json:target/json-report/cucumber.json",
                "junit:target/resources/features"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions","src/test/java/hook"},
        tags="", // or dersek her iki tagı da çalıştırır
        dryRun = false  // false yaparsak browser da  test izlemesini görürüz // false olursa stepdefinitons için adımları verecektir.

)
public class Runner {

}
