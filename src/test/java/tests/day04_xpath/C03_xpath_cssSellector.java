package tests.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_xpath_cssSellector {

    public static void main(String[] args) {
        System.setProperty("webdriver.chroma.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //Browseri tam sayfa yapin
        driver.manage().window().maximize();

        // Sayfayi “refresh”yapin
        driver.navigate().refresh();

        // Sayfa basliginin “Spend less”ifadesi icerdigini test edin
        driver.getTitle();

        // Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()=‘Gift Cards’]"));

        // Birthday butonuna basin


        // Best Seller bolumunden ilk urunu tiklayin
        //Gift card details’den 25 $’i secin
        // Urun ucretinin 25 $ oldugunu test edin
        // Sayfayi kapatin



    }
}
