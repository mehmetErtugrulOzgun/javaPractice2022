package p07_IfElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0)
        {
            System.out.println("Girdiginiz sayi cifttir");
        }
        if (sayi%2!=0)
        {
            System.out.println("Girdiginiz sayi tektir");
        }
        //Tam olan bir sayi ya tektir ya cifttir ucuncu bir durum yoktur
        //O zaman tek olmasi ve cift olmasini iki ayri if ile degil
        //if else ile tek statement da yapmak daha guzel olur
        // ===================if else ile cozum ====================

        if (sayi%2==0)
        {
            System.out.println("sayi cifittir");
        }
        else
        {
            System.out.println("sayi tektir");
        }
    }
}
