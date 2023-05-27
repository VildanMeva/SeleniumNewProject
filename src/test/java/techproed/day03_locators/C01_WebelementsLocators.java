package techproed.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementsLocators {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");
       //Arama kutusunu locate edelim

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");

         /*
     Bir webelementin locate'ini birden fazla kullanacaksanız bir Webelement'e değişken olarak atayabilirsiniz.
     Webelement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
     1-Locate işlemi bittikten sonra webelemente bir metin göndereceksek sendKeys() methodu kullanırız.
     2-Webelement'e tıklayacaksak click() methodu kullanırız
     3-Webelement'in üzerindeki yazıyı almak istiyorsak getText()methodunu kullanırız.
     */
     //Arama kutusuna iphone yazdıralım ve aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //Sayfayı kapatalım
        driver.close();





    }
}
