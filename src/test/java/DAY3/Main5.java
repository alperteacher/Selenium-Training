package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        for (int i = 0; i < inputs.size() - 1; i++) {

            if (inputs.get(i).getAttribute("type").equals("text")) {
                inputs.get(i).sendKeys("Selenium öğreniyorum");
            }

            Thread.sleep(1000);
        }

            /*
        for (WebElement element : inputs) {

            if (element.getAttribute("type").equals("text")) {
                element.sendKeys("Selenium ögreniyorum.");
            }

            Thread.sleep(1000);
        }
            */

        driver.quit();
    }
}
