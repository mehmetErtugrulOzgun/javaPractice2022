package p15_methodCreation;

import java.util.Scanner;

public class C10_MethodCreation {
    //  Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan
    //  buyuk mu kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar ve yuzler
    //  basamagindaki rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini
    //  yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int girilenSayi=scan.nextInt();

        tekCiftKontrolMethodu(girilenSayi);
        isaretKontroluMethodu(girilenSayi);
        yuzdenBuyukOlmaMethodu(girilenSayi);
        scan.close();;
    }

    private static void yuzdenBuyukOlmaMethodu(int girilenSayi) {
        if (girilenSayi>=100){
           int girilenSayininIlkBasamagi=girilenSayi%10;
           int girilenSayininIkinciBasamagi=girilenSayininIlkBasamagi%10;
           int girilenSayininUcuncuBasamagi=girilenSayininIkinciBasamagi%10;

            System.out.println("Girdiginiz sayinin rakamlar toplami : " +(girilenSayininIlkBasamagi
                    +girilenSayininIkinciBasamagi+girilenSayininUcuncuBasamagi));
        }
        else {
            girilenSayi=girilenSayi%10;
            System.out.println("Girdiginiz sayinin birler basamagi : "+girilenSayi);
        }
    }

    private static void isaretKontroluMethodu(int girilenSayi) {
        if (girilenSayi>0){
            System.out.println("Girdiginiz sayi pozitiftir");
        }
        else if (girilenSayi<0){
            System.out.println("Girdiginiz sayi negatiftir");
        }
        else {
            System.out.println("Girdiginiz sayi notrdur");
        }
    }

    private static void tekCiftKontrolMethodu(int girilenSayi) {
        if (girilenSayi%2==0){
            System.out.println("Sayiniz cifttir");
        }
        else {
            System.out.println("Sayiniz tektir");
        }
    }
}
