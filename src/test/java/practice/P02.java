package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {

    public static void main(String[] args) throws InterruptedException {
        //. .Exercise2...
        //   1-Driver oluşturalim
        System.setProperty("Webdriver.chroma.driver", "src/resources/chromedriver.exe");

       //2-Java class'imiza chnomedriver.exe yi tanitalim
        WebDriver driver = new ChromeDriver();

       //3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();

       //4-"https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");

       //5-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.findElement(By.xpath("//*[@id=\"cookieBanner\"]/div/div/div[2]/button")).click();

       //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
       String ottoTitle=  driver.getTitle();
        System.out.println("ottoTitle = " + ottoTitle); // soutv ile otomatik yaptık
        String ottoUrl= driver.getCurrentUrl();
        System.out.println("ottoUrl = " + ottoUrl);

       //7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        if (ottoTitle.contains("0TT0") && ottoUrl.contains("0TT0")) {
            System.out.println("Hem Title hem url \"0TT0\" içeriyor.\nTest başarılı");
        }else {
            System.out.println("En az biri \"0TT0\" içermiyor.\nTest başarısız");
        }

       //8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/" );

       //9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        String wiseTitle= driver.getTitle();
        System.out.println("ottoUrl = " + ottoUrl);
        if (wiseTitle.contains("Quarter")){
            System.out.println("Sayfa başlığı \"Quarter\" içeriyor.\n Test Başarılı");
        }else {
            System.out.println("Sayfa başlığı \"Quarter\" içermiyor.\n Test başarısız");
        }

       //10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();

       //11-Sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

       //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().back();
        driver.close();

       //13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();

    }
}
