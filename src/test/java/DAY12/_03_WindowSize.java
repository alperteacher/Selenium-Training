package DAY12;

import org.openqa.selenium.Dimension;

import static Utility.BaseDriver.driver;

public class _03_WindowSize {

    /*
        ----------------------------------
        Dimension dimension = driver.manage().window().getSize(); ---> Windowun size ını döndürür
        ----------------------------------
        Dimension dimension = new Dimension(width, height); ---> verilen yükseklikte ve genişlikte dimension
        nesnesi oluşturur.

        driver.manage().window().setSize(dimension); ---> Oluşuturlan dimension u set eder.
        ----------------------------------
    */

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.google.com");

        Dimension dimension = new Dimension(300, 1600);
        driver.manage().window().setSize(dimension);

        System.out.println(dimension);
        System.out.println("Genişlik: " + dimension.width);
        System.out.println("Yükseklik: " + dimension.height);

        Thread.sleep(3000);
        driver.quit();
    }
}
