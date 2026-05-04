package DAY6;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


import static Utility.BaseDriver.driver;

public class webElementMethods1 {
    public static void main(String[] args) {


        /*

        1- isDisplayed() -> Web elementin sayfada görünürlülüğünün verisini verir
        2- isEnabled() -> Web elementin kullanılabilinir olup olmadığının değerini döndürür (true/false)
        3- isSelected()

        */

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        try {
            System.out.println(driver.findElement(By.id("gwt-debug-cwCheckBox-Wednesday-labeasdasdl")).isDisplayed());
        }catch (NoSuchElementException e) {
            System.out.println("Element displayed değil");
        }


        driver.quit();

    }
}
