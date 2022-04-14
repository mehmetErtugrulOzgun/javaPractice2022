package p03_scanner;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //scanner kullanmak için 3 adımı takip etmemiz lazım
        //1.adım kendimize bir scanner olusturmak

        Scanner scan = new Scanner(System.in); //esitligin saginda yeni bir scanner olusturulur
                                               //ve olusturulan bu scanner scan variablına assign edilir
                                               //scan variablenin ismidir istedigimiz ismi verebiliriz

        //2.adim kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdiralim

        System.out.println("Lutfen isminizi giriniz : ");

        //3.adim kullanicinin girdigi degeri uygun bir bir variable olusturup kaydedelim

        //String kullaniciAdi=scan.next(); //SADECE ilk kelimeyi alir (ilk space e kadar olan bolumu alir)

        String kullaniciAdi=scan.nextLine();

        //Kullanicidan ismi aldik bunu yazdiriyoruz

        System.out.println("Girdiginiz Isim :" + kullaniciAdi);

    }
}
