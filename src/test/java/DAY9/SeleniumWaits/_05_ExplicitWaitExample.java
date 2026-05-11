package DAY9.SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utility.BaseDriver.driver;

public class _05_ExplicitWaitExample {

    public static void main(String[] args) {

        driver.get("https://letcode.in/waits");

        driver.findElement(By.id("accept")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        driver.quit();
    }
}
