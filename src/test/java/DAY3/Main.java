package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        Thread.sleep(3000);

        List<WebElement> genderInputs = driver.findElements(By.name("gender"));

        WebElement femaleRadioButton = genderInputs.get(1);

        femaleRadioButton.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
