package DAY11;

import org.openqa.selenium.By;
import java.util.Iterator;
import static Utility.BaseDriver.driver;

public class _01_WindowIntro {
    /*
        driver.getWindowHandle() ---> içinde bulunduğumuz windowun id sini verir
        driver.getWindowHandles() ---> tüm vindowların id sini bir Set olarak döndürür
        driver.switchToWindow(x) ----> x yerine window id si gelir

        driver.switchTo().newWindow(WindowType.TAB); ---> yeni sekme açar ve switch yapar
    */
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.ebay.com/");
        // String mainWindowID = driver.getWindowHandle();
        driver.findElement(By.id("item-1")).click();

        /*
        // Diğer Kullanım
        Set<String> windowIDs = driver.getWindowHandles();
        for(String id : windowIDs) {
            if(!(id == mainWindowID)) {
                driver.switchTo().window(id);
            }
        }
        */

        Iterator<String> iterator = driver.getWindowHandles().iterator();
        String firstWindow = iterator.next();
        String secondWindow = iterator.next();

        driver.switchTo().window(secondWindow);
        System.out.println(driver.findElement(By.cssSelector(".x-item-title__mainTitle")).getText());
        driver.findElement(By.id("binBtn_btn_1")).click();

        driver.switchTo().window(firstWindow);
        driver.get("https://www.lcw.com/");

        driver.quit();
    }
}
