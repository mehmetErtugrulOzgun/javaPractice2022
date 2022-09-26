package p14_stringManipulation;

import java.util.Scanner;

public class C08_IsimSoyisimUzunlukKontrol {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu
        //yazdirin
        Scanner scan=new Scanner(System.in);

        System.out.println("Isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Soyisminizi giriniz");
        String soyIsim=scan.nextLine();

        int isimUzunlugu=isim.length();
        int soyIsimUzunlugu=soyIsim.length();

        if (isimUzunlugu>soyIsimUzunlugu){
            System.out.println("Isminiz, soyisminizden daha uzundur");
        }

        else if(isimUzunlugu<soyIsimUzunlugu){
            System.out.println("Soyisiminiz, isminizden daha uzundur");
        }

        else {
            System.out.println("Isminiz ile soyisminiz ayni uzunluktadir");
        }
    }
}
