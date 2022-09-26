package p18_nestedForLoop;

import java.util.Scanner;

public class C12_WhileLoop {
    public static void main(String[] args) {
        //  Kullanicidan baslangic ve bitis haflerini alin ve baslangig harfinden baslayip
        //  bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        //  yapmadigini farz edin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangic harfi");
        char baslangicHarfi=scan.next().toUpperCase().charAt(0);

        System.out.println("Bitis harfi");
        char bitisHarfi=scan.next().toUpperCase().charAt(0);

        //  For loop ile
        for (char i=baslangicHarfi;i<=bitisHarfi;i++){
            System.out.print(i);
        }
        System.out.println("");
        //  While loop ile
        char harf=baslangicHarfi;
        while (harf<=bitisHarfi){
            System.out.print(harf);
            harf++;
        }
    }
}