package DAY9.Case;

import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class Case_1 {

    /*
    * 1- https://www.ebay.com/ ' a git
    * 2- Sol üstteki "deals" e tıkla
    * 3- İlk ürüne git
    * 4- Ürün ismini konsola yazdır
    * */

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.ebay.com/");

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("[href=\"https://www.ebay.com/deals\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//span[@itemprop='name'])[1]")).click();

        Thread.sleep(3000);

        System.out.println(driver.findElement(By.cssSelector("h1.x-item-title__mainTitle span")).getText());

        driver.quit();

    }
}
