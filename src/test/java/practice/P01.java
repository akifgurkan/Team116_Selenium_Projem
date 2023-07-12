package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
    //....Exercise-1:...
    // Create a new class with main method
    public static void main(String[] args) throws InterruptedException {

        // 1-Set Path
        System.setProperty("Webdriver.chroma.driver", "src/resources/chromedriver.exe");
        // 2-Create a chrome driver
        WebDriver driver = new ChromeDriver();
        // 3-Maximize window
        driver.manage().window().maximize();
      //  4-driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Open google home page https://www.google.com
        driver.get("https://www.google.com");

        // On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();

        // Wait about 4 sn
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        // Navigate forward to amazon
        driver.navigate().forward();

        // Refresh page
        driver.navigate().refresh();

        // Close/quit the browser
        driver.close(); //Çalıştığımız pencereyi kapatır
        //driver.quit(); //Tüm açtığımız sayfaları kapatır

        // And Last step print "All is well" on console
        System.out.println("All is well -Her şey iyi-");
        System.err.println("\"Merhaba T-116\""); //Kodu renkli yazar

    }
}
