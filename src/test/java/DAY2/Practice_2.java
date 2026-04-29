package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_2 {
    public static void main(String[] args) throws InterruptedException {

        /*
        Case 2 :
            1- https://demoqa.com/text-box 'a git

            2-
            Full Name
            Email
            Current Address
            Permanent Address
            alanlarını doldur

            3- Submit button a tıkla
         */

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        Thread.sleep(2000);

        WebElement userNameInput = driver.findElement(By.id("userName"));
        userNameInput.sendKeys("technostudyts9");

        Thread.sleep(2000);

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("technostudyts9@gmail.com");

        Thread.sleep(2000);

        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys("İzmir - Urla");

        Thread.sleep(2000);

        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys("Haci isa mahallesi");

        Thread.sleep(2000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
