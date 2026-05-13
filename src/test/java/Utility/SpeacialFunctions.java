package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.js;
import static Utility.BaseDriver.wait;

public class SpeacialFunctions {

    public static void scrollAndClick(WebElement element) throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}
