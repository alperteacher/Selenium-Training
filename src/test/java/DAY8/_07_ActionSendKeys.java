package DAY8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _07_ActionSendKeys {
    public static void main(String[] args) throws InterruptedException {

        /*

        actions.sendKeys(x) ---> içerisine verdiğimiz x değeri browser a gönderir.

        */

        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(7000);

        WebElement searchInput = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

        new Actions(driver).click(searchInput).sendKeys("Oyuncak Araba").sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(3000);

        driver.quit();

    }
}
