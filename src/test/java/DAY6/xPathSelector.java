package DAY6;

import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class xPathSelector {
    public static void main(String[] args) {

        /*
            Xpath selector, css selector e çok benzer fakat daha yavaş çalışır.
            Xpath in avantajları :
            1- Herhangi bir elemanı görünen text inden alabilir.
            2- HTML içerisinde geriye gidebilir
            3- Xpath ile bulunan elementler sayfada çok ise doğrudan sayı verilerek hangisini istiyorsak alabiliriz.

            Xpath selector 2 ye ayrılır.

            1- Absolute xpath (kullanılmaz çünkü sayfada bir element değişirse selector bozulur.)
            Syntax --> html/div/header/div[2]/nav/ul/li[7]/div[1]/a

            Html den başlar ve elemente kadar giden yolu kapsar. Tavsiye edilmez çünkü araya bir element eklenirse
            locator artık kullanılamaz olur.

            2- Relative xpath (daha çok kullanılan yaygın yöntemdir)
            Syntax --> //etiket[@attribute="Değer"]

            Text bulma yöntemi ----> //etiket[text()="metin"]

            ----> Class tanımlar iken elementin tüm classını selectore vermemiz gerekir.

            ----> Eğer ki etiket yerine "*" tanımlarsak tüm etiketlerin içerisinde arar.

            Çoklu attribute kullanarak element bulma ----> //etiket[@attribute="değer" and @attribute="değer"]

            Elementin değerinin bir kısmı ile bulma ---->

            Starts with -> //etiket[starts-with(@attribute, "değer")]
            Contains -> //etiket[contains(@attribute, "değer")]
            Ends With -> //tag[substring(@attribute, string-length(@attribute) - string-length('değer') + 1) = 'değer']

            Child bulma ----> /
            Tüm childlardan bulma ----> //
            Kardeş bulma ----> //following-sibling::etiket
                         ----> //following::etiket

           Sayı ile element bulma ----> (//etiket)[sayı]

           Parent element bulma ----> //etiket/..

         */

            driver.get("https://demoqa.com/automation-practice-form");

            driver.findElement(By.xpath("//*[@id=\"header__container\"]/div/header/div[2]/nav/ul/li[7]/div[1]/a"));


    }
}
