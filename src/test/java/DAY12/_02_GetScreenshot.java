package DAY12;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.wait;
import static Utility.SpeacialFunctions.takeScreenshot;

public class _02_GetScreenshot {

    /*
        1- https://www.akakce.com/ 'a git
        2- "airpods 3" araması yap
        3- Ekran görüntüsü al
    */

    public static void main(String[] args) throws InterruptedException, IOException {
        driver.get("https://www.akakce.com/");
        driver.findElement(By.id("q")).sendKeys("Airpods 3");
        new Actions(driver).sendKeys(Keys.ENTER).build().perform();

        /*
        Overwrite yapar
        File memoryState = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(memoryState, new File("target/screenshots/overwrite/screenshot.png"));
        */

        wait.until(ExpectedConditions.urlContains("Airpods+3"));

        takeScreenshot();

        driver.quit();
    }
}
