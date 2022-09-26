package project1_yesilMarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_YesilMarketRunner {
    public static List<String> urun= new ArrayList<>();
    public static List<Double> urunFiyati= new ArrayList<>();
    double sepetFiyati;
    public static List <String> alisverisSepeti=new ArrayList<>();
    public static List <Double> sepetKilo=new ArrayList<>();
    public static List <Double> sepetFiyat= new ArrayList<>();


    public static void main(String[] args) {

        urun.add("DOMATES");
        urun.add("PATATES");
        urun.add("BİBER");
        urun.add("SOGAN");
        urun.add("HAVUC");
        urun.add("ELMA");
        urun.add("MUZ");
        urun.add("CİLEK");
        urun.add("KAVUN");
        urun.add("UZUM");
        urun.add("LIMON");

        urunFiyati.add(2.10);
        urunFiyati.add(3.2);
        urunFiyati.add(1.5);
        urunFiyati.add(2.3);
        urunFiyati.add(3.1);
        urunFiyati.add(1.2);
        urunFiyati.add(1.9);
        urunFiyati.add(2.35);
        urunFiyati.add(4.1);
        urunFiyati.add(5.8);
        urunFiyati.add(3.4);
        int urunNo;
        double urunKilo;
        String devam;
        double toplam;


       do {
            urunListele();
            Scanner scan=new Scanner(System.in);
            System.out.println("Almak istediginiz urunun kodunu giriniz");
            urunNo=scan.nextInt();
            System.out.println("Sectiginiz urun kac kilo olsun ? ");
            urunKilo=scan.nextDouble();
            sepetEkle(urunNo,urunKilo);
            toplam=sepetiYazdir();
            System.out.println("");
            System.out.println("Devam etmek istiyor musunuz (E/H)");
            devam= scan.next();
       }
       while (devam.equalsIgnoreCase("E"));

       odemeYap(toplam);



    }

    private static void odemeYap(double toplam) {
        Scanner scan = new Scanner(System.in);
        double paraMiktari = 0;
        System.out.println("Odemeniz gereken miktar : " + toplam);

        do {
            System.out.println("Ne kadar paraniz var ");
            paraMiktari += scan.nextDouble();
            if (paraMiktari < toplam) {
                System.out.println("Paraniz yetersiz ekleme yapin");
                System.out.println("Ekleme yapacaginiz miktar : " + (toplam - paraMiktari));

            }
        }
        while (paraMiktari<=toplam);
        System.out.println("");
        System.out.println("Suana kadar : "+paraMiktari+" kadar odeme yaptiniz");
        System.out.println("Toplam borcunuz "+toplam);

        System.out.println("Para ustunuz : "+(paraMiktari-toplam));

    }


    private static double sepetiYazdir() {
        double sepettekiToplam=0;
        for (int i=0;i<alisverisSepeti.size();i++){
            System.out.println("Urun Adi \t Kilo \t\tTutar");
            System.out.println(alisverisSepeti.get(i)+"\t\t "+sepetKilo.get(i)+
                    "\t\t "+sepetFiyat.get(i));

            sepettekiToplam+=sepetFiyat.get(i);
        }
        return sepettekiToplam;
    }

    private static void sepetEkle(int urunNo, double urunKilo) {
        alisverisSepeti.add(urun.get(urunNo));
        sepetKilo.add(urunKilo);
        sepetFiyat.add(urunFiyati.get(urunNo)*urunKilo);
    }

    private static void urunListele() {
        System.out.println("Urun no\t\tURUNLER\t\tFIYATLAR");
        System.out.println("================================");
        for (int i=0; i<urun.size();i++){
            System.out.println(i+"\t\t\t"+urun.get(i)+" \t\t"+urunFiyati.get(i));
        }
    }


}
