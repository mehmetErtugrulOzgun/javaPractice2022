package p11_stringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin
        // girdigi String "Java" iceriyorsa "Aferin" yazdirin
        // icermiyorsa daha cok calisman lazim yazdirin
        // buyuk-kucuk harf onemsiz olsun

        System.out.println("Bir String value giriniz");
        Scanner scan= new Scanner(System.in);
        String girilenScan= scan.nextLine().toLowerCase();
        if (girilenScan.indexOf("java")==(-1)){
            System.out.println("Daha cok calisman lazim");
        }
        else {
            System.out.println("Aferin");
        }
    }
}