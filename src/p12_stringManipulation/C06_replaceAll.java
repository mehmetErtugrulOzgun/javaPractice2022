package p12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        // kullanicidan isim soyisim alip butun harfleri * yapalim

        Scanner scann=new Scanner(System.in);
        System.out.println("Luttfen isminizi giriniz");
        String isimSoyisim=scann.nextLine();

        System.out.println("ismi ve soyismi degistirmeden yazarsak : " + isimSoyisim);
        System.out.println("isim ve soyismi * ile degistirip yazarsak" +
                isimSoyisim.replaceAll("\\S" , "*"));

    }
}
