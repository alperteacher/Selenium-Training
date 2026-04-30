package DAY4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class case1 {

    /*
    CASE 1:
        1- https://demoqa.com/automation-practice-form
        2- tüm inputlar doldurlacak
        3- submit edilecek
        4- Thanks for submitting the form elementi alınıp konsola texti yazdırılacak
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("test");
        driver.findElement(By.id("lastName")).sendKeys("test");
        driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
        driver.findElement(By.id("gender-radio-2")).click();
        driver.findElement(By.id("userNumber")).sendKeys("5555555555");
        driver.findElement(By.id("hobbies-checkbox-3")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("test");
        driver.findElement(By.id("submit")).click();


        Thread.sleep(3000);

        System.out.println(driver.findElement(By.id("example-modal-sizes-title-lg")).getText());

        driver.quit();
    }
}
