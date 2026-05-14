package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Utility.BaseDriver.*;

public class SpeacialFunctions {

    public static void scrollAndClick(WebElement element) throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(false)", element);
        js.executeScript("window.scrollTo(0, 500)", element);
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void takeScreenshot() throws IOException {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = "screenshot_" + timestamp + ".png";

        File memoryState = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(memoryState, new File("target/screenshots/" + fileName));
    }
}
