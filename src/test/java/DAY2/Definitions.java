package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Definitions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Driverı (Web Sürücüsü) web site adresine yönlendirir
        driver.get("https://www.google.com");

        driver.manage().window().maximize(); // Browser ımı büyültür.
        driver.manage().window().minimize(); // Browser ımı alta alır.

        driver.getTitle(); // Sayfanın title ını döndürür
        driver.getCurrentUrl(); // Sayfanın url ini alıyor

        driver.close(); // Sadece sekmeyi kapatır
        driver.quit(); // Driver ı sonlandırır

        driver.findElement(By.id("")); // Sürücümü kullanarak id ile bulma yöntemi ile element bulur
        WebElement element = driver.findElement(By.id("")); // Bir web elementi tanımlar

        element.click(); // Elemente Click yapar
        element.sendKeys("abc"); // Elemente text gönderir

    }
}
