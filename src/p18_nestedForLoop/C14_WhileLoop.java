package p18_nestedForLoop;

import java.util.Scanner;

public class C14_WhileLoop {
    public static void main(String[] args) {
        //  Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int sayi=scan.nextInt();

        int i=sayi;
        int rakamlarToplami=0;
        int rakam=0;
        while (i>0){
            rakam=i%10;
            rakamlarToplami+=rakam;
            i/=10;
        }
        System.out.println("Girdiginiz " +sayi+" sayisinin rakamlar toplami : "+rakamlarToplami);
        System.out.println("");

        for (int j=sayi;j>0;j/=10){
            rakam=i%10;
            rakamlarToplami+=rakam;
            j/=10;
        }
        System.out.println("For dongusu ile : "+rakamlarToplami);
    }
}
