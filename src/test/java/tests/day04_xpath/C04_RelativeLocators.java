package tests.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chroma.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2 ) Berlin’i 3 farkli relative locator ile locate edin
       WebElement bostonElementi= driver.findElement(By.xpath("//img[@id=‘pid6_thumb’]"));
       WebElement sailorElementi= driver.findElement(By.xpath("//img[@id=‘pid11_thumb’]"));
       WebElement byAreaElementi= driver.findElement(By.xpath("//img[@id=‘pid8_thumb’]"));
       WebElement eNYnti= driver.findElement(By.xpath("//img[@id=‘pid8_thumb’]"));



      //  3 ) Relative locator’larin dogru calistigini test edin



    }
}
