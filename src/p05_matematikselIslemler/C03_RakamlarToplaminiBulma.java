package p05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanicidan aldigimiz dort basamakli bir sayinin basamaklar toplamini bulunuz
        //basamaklar toplamini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir tam sayi giriniz :");
        int sayi=scan.nextInt();
        System.out.println("Girdiginiz sayi : " + sayi);

        int rakam=0;
        int toplam=0;

        //1.adim r=0 t=0

        rakam=sayi%10;
        toplam +=rakam;
        sayi/=10;

        //2.adima geciyoruz

        rakam=sayi%10;
        toplam +=rakam;
        sayi/=10;

        //3.adima geciyoruz

        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;

        //4.adima geciyoruz

        rakam=sayi%10;
        toplam+=rakam;
        sayi/=10;

        //5.adim toplami yazdiriyoruz

        System.out.println(toplam);




    }
}
