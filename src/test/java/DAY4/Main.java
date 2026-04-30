package DAY4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        /*
        driver.findElement(By.cssSelector("#userNumber")).sendKeys("abc");
        driver.findElement(By.cssSelector("[id=\"userName\"]")).sendKeys("def");
        */

        driver.findElement(By.cssSelector(".mr-sm-2.form-control")).sendKeys("abc");
        Thread.sleep(5000);

        driver.quit();

    }
}
