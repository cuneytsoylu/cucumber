package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@WebU",
        dryRun = false
)

public class Runner {
    // Runner class'inin body'sine hic bir kod yazmiyoruz
    // Bu class icin onemli olan kullanacagimiz iki adet notasyon

    // dryRun= false yazildiginda belirlenen tag'la etiketlenen tum senaryolari sirasiyla calistirir
    // dryRun= true dedigimizde ise kodlari calistirmadan eksik stepler olup olmadigini kontrol eder
    // ve varsa bize eksik stepleri rapor eder.

    // features ve glue olarak spesifik bir class veya feature dosyasini degil
    // tum klasor ve packageyi sectik
    // dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun
    // isimize yarayan bir stepdefinitions varsa rahatlikla kullanabiliriz
}
/*//raporlama icin Runner classi kullanilir
@RunWith(Cucumber.class)//bu notasyondan dolayi Junit kullaniyoruz,class'i calistirmaya yarar
@CucumberOptions(//hangi baglantilarla calisilacagi yazilir
        plugin = {"html:target\\cucumber-reports.html",
                  "json:target/json-reports/cucumber.json",
                  "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",//calistirilacak yerin path'i aliyoruz
        glue = "stepDefinitions",//glue yapistirici,nereye yapistiracagimizin ismini seciyoruz
        tags = "@Editor",//testng deki grup mantigiyla calistirilacak scenario'ya tag yazilir
        dryRun = false
)*/