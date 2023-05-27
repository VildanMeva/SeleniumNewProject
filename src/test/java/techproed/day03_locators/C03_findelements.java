package techproed.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        //sayfadaki linklerin sayisini ve linkleri yazdiralim
        /*
        findelement ile bir webelemente ulasilabilirken,birden fazla web element icin
        findelement methodunu() kullaniriz.Bu webelementlerin sayisina ulasmak icin yada bu weelementlerin yazisini console yazdirabilmek icin
        List <webelement>linklerin listesi=driver.findelement(By.("locator degeri")) olrak kullaniriz
         olusturmus oldugumuz List'i loop ile console yazdirabiliriz
         */
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayısı = " + linklerListesi.size());

        for (WebElement w : linklerListesi) {
            if (!w.getText().isEmpty()) {
                System.out.println(w.getText());
            }
        }
    //lambda ile yazdiralim
        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});

        //shop deals in Electonics webelementinin yazisini yazdiralim
        System.out.println("**************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());


        driver.close();
    }
}