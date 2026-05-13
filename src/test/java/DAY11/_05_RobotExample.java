package DAY11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Utility.BaseDriver.driver;

public class _05_RobotExample {
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver.get("https://letcode.in/file");

        Thread.sleep(3000);

        WebElement fileInputButton = driver.findElement(By.className("file-cta"));
        fileInputButton.click();

        Robot robot = new Robot();

        for (int i = 0; i < 9; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(200);
        }

        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(200);

        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            Thread.sleep(200);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(200);

        Thread.sleep(5000);
        driver.quit();
    }
}
