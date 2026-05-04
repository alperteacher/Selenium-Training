package DAY1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/links");



        Thread.sleep(3000);

        driver.quit(); // Sadece var olan sekmeyi kapatır
    }
}
