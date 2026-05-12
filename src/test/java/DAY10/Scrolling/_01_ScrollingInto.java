package DAY10.Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class _01_ScrollingInto {

    /*
            window.scrollTo(x, y) ---> x ve y ekseninde ekranı kaydırır yapar
            window.scrollTo(0, document.body.scrollHeight) --> sayfanın en altına kaydırır
            window.scrollTo(0, -document.body.scrollHeight) --> sayfanın en üstüne kaydırır

            js.executeScript("arguments[0].scrollIntoView(true)", element);  ---> elemente kadar kaydırır
            true ---> element sayfanın yukarısında kalır
            false ---> element sayfanın altında kalır
     */

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://practice.expandtesting.com/iframe");

        WebElement element = driver.findElement(By.id("email-subscribe"));

        // Driver ımda çalışan bir js komut değişkeni
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true)", element);

        Thread.sleep(4000);

        driver.quit();
    }
}
