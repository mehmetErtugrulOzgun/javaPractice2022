package p41_exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    /*
    Kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Payi giriniz: ");
        short sayi1= scan.nextShort();

        System.out.println("Paydayi giriniz: ");
        short sayi2= scan.nextShort();;

        try {
            System.out.println("Girdiginiz iki sayinin bolumu: "+sayi1/sayi2);
        }
        catch (ArithmeticException e){
            System.out.println("Bolme isleminde 0 olamaz");
        }


    }
}
