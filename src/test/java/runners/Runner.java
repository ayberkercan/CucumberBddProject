package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Raporlama için kullanılan eklentileri belirtiyoruz.
        plugin = {
                "pretty", // Renkli ve daha okunabilir bir çıktı sağlar.
                "html:target/cucumber-reports.html", // HTML formatında raporları oluşturur.
                "json:target/json-report/cucumber.json", // JSON formatında raporları oluşturur.
                "junit:target/resources/features" // JUnit formatında raporları oluşturur.
        },
        // Özellik dosyalarının (feature files) bulunduğu dizini belirtiyoruz.
        features = "src/test/resources/features",
        // Step tanımlarının ve hook'ların bulunduğu paketleri belirtiyoruz.
        glue = {"stepDefinitions","src/test/java/hook"},
        // Çalıştırılacak senaryoları belirlemek için etiketler (tags) kullanılır.
        tags = "", // Boş bırakıldığında tüm senaryoları çalıştırır.
        // Dry run modunu belirtir. Eğer true ise senaryoların gerçekten çalıştırılmadan kontrol edilmesini sağlar.
        dryRun = false  // false yaparsak browser da  test izlemesini görürüz // false olursa stepdefinitons için adımları verecektir.
)
public class Runner {

}
