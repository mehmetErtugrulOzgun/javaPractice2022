package p12_stringManipulation;

import java.util.Scanner;

public class C07_contains {
    public static void main(String[] args) {
        // kullanicidan bir cumle ve bir kelime alin,
        //cumlede kelimenin kullanilip kullanilmadigini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String alinanCumle=scan.nextLine();

        System.out.println("Lutfen aramak istediginiz kelimeyi giriniz");
        String alinanKelime= scan.nextLine();

        System.out.println("Girdiginiz cumle = "+alinanCumle);
        System.out.println("Aramak istediginiz kelime = "+alinanKelime);

        if (alinanCumle.contains(alinanKelime)){
            System.out.println("Aradiginiz kelime cumlede kullanilmistir");
        }
        else {
            System.out.println("Aradiginiz kelime cumlede kullanilmamistir");
        }
    }
}
