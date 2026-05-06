package DAY8;

import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class Alerts_01_ {
    public static void main(String[] args) throws InterruptedException {


        /*
            switchTo().accept() ---> Alert onayı verir
            switchTo().dismiss() ---> Alerti red eder
            switchTo().sendKeys()
            switchTo().getText() ---> Alertin textini verir
        */

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");

        Thread.sleep(2000);

        driver.findElement(By.id("confirm")).click();

        Thread.sleep(2000);

        driver.switchTo().alert().getText();


        Thread.sleep(2000);

        driver.quit();

    }
}
