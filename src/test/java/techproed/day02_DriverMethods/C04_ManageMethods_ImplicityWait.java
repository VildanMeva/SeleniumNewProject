package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicityWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chorome.diriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        implicitlyWait(Duration.ofSeconds(20) sayfadaki web elementleri gorunur olana kadar(sayfada olsana kadar)
        maximum 20 saniye bekler.Eger webelementler 2 saniyede olusursa 2 saniye bekler
         ve alt satira gecer . Fakat belirttigimiz
    sure boyunca internetten ya da sayfadan kaynakli webElementler olusmazsa testimiz "FAIL" verir
    Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler. 30 saniye beklemesini belirtirsem
    30 saniye bekler ve alt satira gecer .

         */
        //techproed sayfasina gidelim
        String amazonUrl = "https://amazon.com";
        String tecproUrl = "https://techproeducation.com";
        driver.get(tecproUrl);
       //amazona gidelim
        driver.get(amazonUrl);
       //techpro sayfasina geri donelim
        driver.navigate().back();
       //sayfa basligini techpro icerdigini test edelim
        String actualTitle = driver.getTitle();
        String arananKelime ="Techpro";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED->"+actualTitle);
       //tekrar amazon sayfasina gidelim
        driver.navigate().forward();
       //sayfa basligini Amazon icerdigini test edelim
       if(driver.getTitle().contains("Amazon")){
           System.out.println("Test PASSED");
       }else System.out.println("Test FAILED");
       //Sayfayi kapatiniz
        driver.close();


    }
}

