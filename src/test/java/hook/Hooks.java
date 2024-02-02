package hook;

import io.cucumber.java.Scenario;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    // Senaryo başlamadan önce çalışacak metot.
    @Before
    public void setUp() {
        System.out.println("Method run"); // Metodun çalıştığını konsola yazdırır.
    }

    // Senaryo bittiğinde veya başarısız olduğunda çalışacak metot.
    @After
    public void tearDown(Scenario scenario) {
        // Senaryonun ekran görüntüsünü almak için WebDriver'ı kullanır.
        final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        // Eğer senaryo başarısız olduysa, ekran görüntüsünü rapora ekler.
        if(scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        // WebDriver'ı kapatır.
        Driver.closeDriver();
    }
}
