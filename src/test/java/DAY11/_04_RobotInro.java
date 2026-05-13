package DAY11;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Utility.BaseDriver.driver;

public class _04_RobotInro {
    public static void main(String[] args) throws AWTException, InterruptedException {
        driver.get("https://www.google.com");

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        driver.quit();
    }
}
