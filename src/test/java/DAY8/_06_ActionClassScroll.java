package DAY8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _06_ActionClassScroll {
    public static void main(String[] args) throws InterruptedException {

        /*

        1- actions.scrollToElement(WebElement x1) ---> x1 elementine kadar sayfayı scroll eder.
        2- actions.scrollByAmount(x, y) ----> x ekseninde yada y ekseninde scroll yapar.

        */

        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(8000);

        new Actions(driver).scrollByAmount(0, 1000).build().perform();

        Thread.sleep(3000);

        new Actions(driver).scrollByAmount(0, -500).build().perform();

        Thread.sleep(3000);

        driver.quit();

    }
}
