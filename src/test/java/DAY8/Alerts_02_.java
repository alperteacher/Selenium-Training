package DAY8;

import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Alerts_02_ {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new InternetExplorerDriver();

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("promtButton")).click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Merhaba");

        Thread.sleep(2000);

        driver.quit();

    }
}
