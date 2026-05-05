package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _03_ActionMouseHoverEffect {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://hepsiburada.com");

        Thread.sleep(1000);

        new Actions(driver).moveToElement(
                driver.findElement(By.xpath("//span[text()=\"Oto, Bahçe, Yapı Market\"]")))
                .build()
                .perform();
    }
}
