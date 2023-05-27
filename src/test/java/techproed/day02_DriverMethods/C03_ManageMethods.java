package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorome.diriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Browser'in konumunu yazdiralim
        System.out.println("sayfanin konumu="+driver.manage().window().getPosition());
        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari="+driver.manage().window().getSize());
        //Browser'i maximize yapalim
        driver.manage().window().maximize();
        /*
        Bir web sitesine gittigimizde browser default olarak bir boyuta gelir.Ve acilan browser;daki
        web elementlere browser maximize olmadigi icin ulasamayabiliriz.
         Dolayısıyla browser'ı açtıktan sonra
        maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
        browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
        ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz*/
        //Tecproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");
        ///Browser'in konumunu yazdiralim
        System.out.println("sayfanin konumu="+driver.manage().window().getPosition());
        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari="+driver.manage().window().getSize());
        Thread.sleep(3000);
        //Browser'in minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000); //sleep() exception firlatir. add signature yapiyoruz, maine "throws InterruptedException" ekliyoruz
        //minimize() ekrani baslangica kücültür
        //sayfayi fullScreen yapalim
        driver.manage().window().fullscreen();

        driver.manage().window().setPosition(new Point(50,50));////istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir

        //sayfayi kapatiniz
        driver.close();
    }
}
