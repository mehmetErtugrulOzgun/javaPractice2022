package p14_stringManipulation;

import java.util.Scanner;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        Scanner scan= new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("Soyisminizi giriniz");
        String soyIsim= scan.nextLine();

        System.out.println("Kredi Karti Numaranizi Giriniz");
        String kkNo=scan.nextLine();

        String yeniKkNo=kkNo.substring(0,4)+" "+kkNo.substring(4,8)+" "+kkNo.substring(8,12)+" "+kkNo.substring(12,16);
        System.out.println(yeniKkNo);

        String yeniIsim = isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        //M**** oldu

        String yeniSoyisim = soyIsim.substring(0,1).toUpperCase()+
                soyIsim.substring(1).replaceAll("\\S}","*");
        // O**** oldu

        String yeniKkNoSon=kkNo.substring(12);
        String yeniKkNoBas=kkNo.substring(0,12);

        String sonKkNo=yeniKkNoBas.replaceAll("\\S","*")+" "+yeniKkNoSon;
        System.out.println(sonKkNo);
        System.out.println("İsim-Soyisim : "+yeniIsim + " "+ yeniSoyisim +"\nkart no : "+sonKkNo);
    }
}
