package DAY10.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class _01_IFramesIntro {

    /*
         IFrame'e gitme yöntemleri :

         1- Index ile gitme ---> driver.switchTo().frame(x); ---> x yerine index verilir
         2- Name ile gitme ---> driver.switchTo().frame(x); ---> x yerine name attribute'u verilir
         3- Web Element ile gitme ---> driver.switchTo().frame(x); ---> x yerine web element verilir

         driver.switchTo().parentFrame(); --> parent frame e döner
         driver.switchTo().defaultContent(); --> ana html e döner
    */

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement iframe = driver.findElement(By.cssSelector("[src=\"SingleFrame.html\"]"));

        driver.switchTo().frame(iframe);

        driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("Merhaba");

        driver.switchTo().defaultContent();

        driver.findElement(By.cssSelector("[href=\"WebTable.html\"]")).click();


        Thread.sleep(2000);

        driver.quit();
    }
}
