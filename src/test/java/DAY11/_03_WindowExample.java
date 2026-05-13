package DAY11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Iterator;

import static Utility.BaseDriver.*;
import static Utility.SpeacialFunctions.scrollAndClick;

public class _03_WindowExample {

            /*
                1- https://www.selenium.dev/ sayfasına gidelim
                2- Aşağıdan Open Collective linkine tıklayın
                3- Açılan yeni sekmeden sayfanın en altında rastgele bir elemente tıklayın
             */

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.selenium.dev/");

        WebElement openCollectiveLink = driver.findElement(By.xpath("//*[text()=\"Open Collective\"]"));

        js.executeScript("arguments[0].scrollIntoView(true)", openCollectiveLink);
        Thread.sleep(500);
        openCollectiveLink.click();

        Iterator<String> iterator = driver.getWindowHandles().iterator();
        String firstWindow = iterator.next();
        String secondWindow = iterator.next();

        driver.switchTo().window(secondWindow);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Sign Up\"]")));

        WebElement katkidaBulunun = driver.findElement(By.xpath("(//button[@data-cy=\"contribute-btn\"])[2]"));
        katkidaBulunun.click();

        driver.quit();
    }
}
