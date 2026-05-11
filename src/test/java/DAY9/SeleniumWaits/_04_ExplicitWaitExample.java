package DAY9.SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utility.BaseDriver.driver;

public class _04_ExplicitWaitExample {
    public static void main(String[] args) {

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn2")).click();

        System.out.println(driver.findElement(By.id("txt1")).getAttribute("placeholder"));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txt2"))));

        System.out.println(driver.findElement(By.id("txt2")).getAttribute("placeholder"));

        driver.quit();
    }
}
