package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _00_ActionClassIntro {
    public static void main(String[] args) {


        /*

                Action class bizim browserda aksiyonlar almamızı sağlar.

                Örn : Sol click, Sağ click, Double Click, Drag and drop, Basılı tut, Klavyeden bir tuş kullan,
                mousehover

                Uzun Yol :

                WebElement searchButton = driver.findElement(By.id("gh-search-btn"));
                Actions actions = new Actions(driver);
                Action searchButtonClick = actions.moveToElement(searchButton).click().build();
                searchButtonClick.perform();

         */

                driver.get("https://www.ebay.com");

                WebElement searchButton = driver.findElement(By.id("gh-search-btn"));

                // Kısa yol :

                new Actions(driver).click(searchButton).build().perform();

    }
}
