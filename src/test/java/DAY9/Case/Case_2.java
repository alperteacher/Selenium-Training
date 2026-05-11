package DAY9.Case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static Utility.BaseDriver.driver;

public class Case_2 {

    /*

    1- https://www.ebay.com/ ' a git
    2- "Sports" ' a hover yap
    3- "Cycling" e tıkla
    4- Soldaki bardan "Bicycle Accessories" e tıkla
    5- Sayfadaki ürün sayısını konsola yazdıralım

     */

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.ebay.com/");

        Thread.sleep(5000);

        WebElement sportsMenu = driver.findElement(By.xpath("//span[text()=\"Sports\"]"));

        new Actions(driver).moveToElement(sportsMenu).build().perform();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()=\"Cycling\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()=\"Bicycle Accessories\"]")).click();

        Thread.sleep(3000);

        List<WebElement> list = driver.findElements(By.cssSelector(".brwrvr__item-results.brwrvr__item-results--list  h3.bsig__title__text"));

        System.out.println(list.size());

        driver.quit();

    }
}
