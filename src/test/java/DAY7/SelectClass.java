package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utility.BaseDriver.driver;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {

        /*
            Select class bizim dropdown menüler üzerinde aksiyonlar almamızı sağlar.

            selectMenu.selectByIndex(int index) --> index teki opsiyonu seçer
            selectMenu.selectByValue("value"); ----> value değerine göre elementi seçer
            selectMenu.selectByVisibleText("text"); ---> text ine göre elementi seçer

            selectMenu.getOptions() ---> Selectin içerisindeki options elementlerini bir list olarak döndürür.
            selectMenu.getOptions().get(index) ---> listeden index teki elementi döndürür
            selectMenu.getOpsitons().size() ----> listenin uzunluğunu döndürür
        */

        driver.get("https://www.amazon.com.tr");

        Thread.sleep(7000);

        WebElement categorySearchMenuElement = driver.findElement(By.id("searchDropdownBox"));

        Select categorySearchMenu = new Select(categorySearchMenuElement);

        categorySearchMenu.selectByVisibleText("PC ve Video Oyunları");

        Thread.sleep(3000);

        driver.quit();

    }
}
