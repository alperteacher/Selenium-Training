package DAY12;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import static Utility.BaseDriver.driver;

public class _04_Navigate {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.akakce.com/");

        driver.findElement(By.cssSelector("[title=\"Broşürlerdeki Daha Ucuz Fiyatlar\"]")).click();

        // Bir sayfa geriye gider
        driver.navigate().back();

        // Bir sayfa ileriye gider
        driver.navigate().forward();

        driver.quit();
    }
}
