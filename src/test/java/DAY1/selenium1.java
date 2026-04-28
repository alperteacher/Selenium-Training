package DAY1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());

        driver.get("https:www.x.com");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
