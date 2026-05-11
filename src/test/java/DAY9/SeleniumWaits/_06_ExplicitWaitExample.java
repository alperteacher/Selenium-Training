package DAY9.SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.wait;

public class _06_ExplicitWaitExample {

    public static void main(String[] args) {

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        driver.findElement(By.cssSelector("#post-body-7708391096228750161 button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"WebDriver\"]")));

        System.out.println(driver.findElement(By.id("demo")).getText());

        driver.quit();
    }
}
