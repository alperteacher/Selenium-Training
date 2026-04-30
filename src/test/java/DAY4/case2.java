package DAY4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class case2 {

    /*
    CASE 2:
        1- https://www.saucedemo.com/ sayfasına gidilecek
        2- giriş yapılacak
        3- 4 adet rastgele ürün sepete eklenecek
        4- sepet sayfasına gidilecek
        5- sepetteki 4 ürünün isimleri konsola yazdırılacak
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        List<WebElement> addToCartList = driver.findElements(By.className("btn_inventory"));

        Random random = new Random();
        HashSet<Integer> randomIndexes = new HashSet<>();
        int randomNumber;

        while (true) {
            int randomIndex = random.nextInt(0, addToCartList.size());
            randomIndexes.add(randomIndex);

            if (randomIndexes.size() == 4){
                break;
            }
        }

        ArrayList<Integer> randomIndexes2 = new ArrayList<>(randomIndexes);

        for (int i = 0; i < randomIndexes.size(); i++) {
           randomNumber = randomIndexes2.get(i);
           addToCartList.get(randomNumber).click();
        }

        Thread.sleep(10000);

        driver.quit();

    }

}
