package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _04_ActionDragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        /*

            action.dragAndDropBy(WebElement, x ekseninde taşınacak pixel, y ekseninde taşınacak pixel)

        */

        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        Thread.sleep(3000);

        WebElement leftBarButton = driver.findElement(By.xpath("(//span[@class=\"ui-slider-handle ui-state-default ui-corner-all\"])[1]"));

        new Actions(driver).dragAndDropBy(leftBarButton, 100, 0).build().perform();

        Thread.sleep(5000);

        new Actions(driver).dragAndDropBy(leftBarButton, 200, 0).build().perform();

        Thread.sleep(5000);

        driver.quit();


    }
}
