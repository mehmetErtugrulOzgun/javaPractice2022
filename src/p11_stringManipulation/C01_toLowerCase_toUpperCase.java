package p11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Java guzeldir";
        // Biz string methodlarini arka arkaya kullanabiliriz
        // Misal ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        // str.charAt(5); olarak yazdigimizda sonuc artik String degil char olacaktir
        // bundan dolayisiyla Stringten yapmak istedigimiz tum degisiklikleri
        // once yapip sonra charAt() methodunu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));

    }
}
