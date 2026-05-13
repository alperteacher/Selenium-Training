package DAY11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

import static Utility.BaseDriver.*;
    /*
        arguments[0].click()
        Elemente click yapar
    */
public class _02_WindowExample {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.selenium.dev/");
        List<WebElement> targetBlankList = driver.findElements(By.cssSelector("[target=\"_blank\"]"));

        for(WebElement element : targetBlankList) {
            js.executeScript("arguments[0].scrollIntoView(true)", element);
            js.executeScript("arguments[0].click()", element);
        }

        Set<String> windowIDList = driver.getWindowHandles();

        for (String id : windowIDList) {
            driver.switchTo().window(id);
            driver.close();
            Thread.sleep(500);
        }

    }
}
