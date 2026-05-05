package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _02_ActionRightClick {
    public static void main(String[] args) throws InterruptedException {

        // .contextClick() elemente sağ tıklamaya yarar.

        driver.get("https://demoqa.com/buttons");

        Thread.sleep(1000);

        new Actions(driver).contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();

    }
}
