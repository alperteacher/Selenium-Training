package DAY10.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.js;

public class _02_IFramesExample {

    /*

        1- https://practice.expandtesting.com/iframe sayfasına git
        2- Internal IFrame: Email Subscription alanını doldur ve gönder
        3- You are now subscribed! yazısını konsola yazdır

    */

    public static void main(String[] args) {
        driver.get("https://practice.expandtesting.com/iframe");

        WebElement emailIframe = driver.findElement(By.id("email-subscribe"));

        js.executeScript("window.scrollTo(0, 1000)");

        driver.switchTo().frame(emailIframe);

        driver.findElement(By.id("email")).sendKeys("tester@gmail.com");

        js.executeScript("window.scrollTo(0, 500)");

        driver.findElement(By.id("btn-subscribe")).click();

        System.out.println(driver.findElement(By.id("success-message")).getText());

        driver.quit();

    }
}
