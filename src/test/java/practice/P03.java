package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) throws InterruptedException {

// Exercise3...
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        Thread.sleep(2500);

        // Type any number in the first input/ İlk girişe herhangi bir sayı yazın
        driver.findElement(By.id("number1")).sendKeys("3");

        // Type any number in the second input / İkinci girişe herhangi bir sayı yazın
        driver.findElement(By.id("number2")).sendKeys("8");

        // Click on Calculate / Hesapla'ya tıklayın
        driver.findElement(By.id("calculate")).click();

        // Get the result / sonucu getir
        String result = driver.findElement(By.xpath("//*[@id='answer']")).getText(); // hocanın yaptığı

        // Print the result / sonucu yazdır
        System.out.println("result = " + result);

        //  driver.close();

    }
}