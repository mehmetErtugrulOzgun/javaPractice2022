package p19_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //  Kullanicidan iki pozitif sayi isteyin
        //  Kullanici negatif tam sayi girdiginde
        //  girilen negatif sayilari yok sayip yeniden deger isteyin
        //  kullanici dogru giris yaptiginda "well done" ve sayilarin carpimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Iki adet pozitif tam sayi giriniz");

        int sayi1=0;
        int sayi2=0;
        while ( !(sayi1>0 && sayi2>0) ){
            sayi1=scan.nextInt();
            sayi2=scan.nextInt();
            if (sayi1>0 && sayi2>0){
                System.out.println("well done, sayilarin carpimi : "+(sayi1*sayi2));

            }
            else {
                System.out.println("Lutfen pozitif bir tam sayi giriniz");
            }
        }
    }
}