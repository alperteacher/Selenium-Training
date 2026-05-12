package DAY10.Case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Utility.BaseDriver.driver;

public class Case1 {

    /*
        1- Ebay a git
        2- Inputun yanındaki dropdown dan "Health & Beauty" seçimini yap
        3- Inputa "Massage Gun" yaz ve arat
        4- Çıkan sayfada deafult sergilenen ürün sayısını bul ve değişkende tut
        5- Toplam sayfadaki ürün sayısını bul ve default ile karşılaştır

    */

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.ebay.com/");

        WebElement categoriesElement = driver.findElement(By.cssSelector("select[class='gh-search-categories']"));

        Select categoriesDropdown = new Select(categoriesElement);
        categoriesDropdown.selectByVisibleText("Health & Beauty");

        driver.findElement(By.id("gh-ac")).sendKeys("Massage Gun");
        driver.findElement(By.id("gh-search-btn")).click();

        List<WebElement> productTitles = driver.findElements(By.cssSelector(".srp-results .s-card__title"));
        int actualProductSize = productTitles.size();
        int expectedProductSize = Integer.parseInt(driver.findElement(By.cssSelector("[aria-controls=\"srp-ipp-menu-content\"] span span")).getText());

        if (actualProductSize == expectedProductSize) {
            System.out.println("Test Başarılı");
        } else {
            System.out.println("Test Başarısız");
            System.out.println(actualProductSize);
            System.out.println(expectedProductSize);
        }

        driver.quit();
    }
}
