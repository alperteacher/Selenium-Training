package DAY12;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utility.BaseDriver.driver;
import static Utility.SpeacialFunctions.scrollAndClick;

public class _01_ShadowContent {

    /*
        1- https://www.akakce.com/ 'a git
        2- "Yeşil Işık" a tıkla
        3- Sayfadaki sonuncu ürüne tıkla
        4- Ürün ismini konsola yazdır
    */

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.akakce.com/");

        /* Shadow Content İçeriği Alma */
        SearchContext shadowContent = driver.findElement(By.tagName("efilli-layout-dynamic")).getShadowRoot();
        shadowContent.findElement(By.cssSelector("[data-name=\"kabul et\"]")).click();

        driver.findElement(By.cssSelector("[title=\"Broşürlerdeki Daha Ucuz Fiyatlar\"]")).click();

        List<WebElement> productTitles = driver.findElements(By.className("pn_v8"));
        scrollAndClick(productTitles.get(productTitles.size() - 1));

        System.out.println(driver.findElement(By.tagName("h1")).getText());

        driver.quit();
    }
}
