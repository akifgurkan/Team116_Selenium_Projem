package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class P07 {
    public static void main(String[] args) {
        //1 ) http://babayigit.net/relativelocators/relative.html adresine gidin
        //2 ) Nurse  3 farkli relative locator ile locate edin
        //3 ) Relative locator’larin dogru calistigini test edin

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://babayigit.net/relativelocators/relative.html");
        WebElement dr = driver.findElement(By.id("dr_thumb"));
        WebElement fr = driver.findElement(By.id("frmn_thumb"));
        WebElement pl = driver.findElement(By.id("pol_thumb"));
        WebElement sll = driver.findElement(By.id("sll_thumb"));

        WebElement nurse1 = driver.findElement(RelativeLocator.with(By.tagName("img")).below(dr));
        WebElement nurse2 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(fr));
        WebElement nurse3 = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(pl));
        WebElement nurse4 = driver.findElement(RelativeLocator.with(By.tagName("img")).above(sll));

        if (nurse1.getAttribute("id").equals("nurs_thumb")) {
            System.out.println("İlk Test Passed");
        } else {
            System.out.println("İlk Test Failed");
        }
        System.out.println("/////////////////////////////////////////////");

        if (nurse2.getAttribute("id").equals("nurs_thumb")) {

            System.out.println("İkinci Test Passed");
        } else {
            System.out.println("İkinci Test Failed");
        }
        System.out.println("//////////////////////////////////");

        if (nurse3.getAttribute("id").equals("nurs_thumb")) {
            System.out.println("Üçüncü Test Passed");
        } else {
            System.out.println("Üçüncü Test Failed");
        }

        System.out.println("//////////////////////////////////");

        if (nurse4.getAttribute("id").equals("nurs_thumb")) {
            System.out.println("dördüncü Test Passed");
        } else {
            System.out.println("dördüncü Test Failed");
        }

         driver.close();
    }
}