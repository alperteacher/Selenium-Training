package DAY5;

import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class Case2 {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.amazon.com.tr");


        Thread.sleep(3000);

        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[data-menu-id=\"2\"]:nth-child(1)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div[data-menu-id=\"2\"] > section > ul > li:first-child > a")).click();



        driver.quit();

    }


}
