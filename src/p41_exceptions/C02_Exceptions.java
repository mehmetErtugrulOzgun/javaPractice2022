package p41_exceptions;

import java.util.Scanner;

public class C02_Exceptions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=1;
        while (count<=3){
            System.out.println("Payi giriniz: ");
            int sayi1= scan.nextInt();
            System.out.println("Paydayi giriniz: ");
            int sayi2= scan.nextInt();;
            try {
                System.out.println("Iki sayinin bolumu : "+(sayi1/sayi2));
            }
            catch (ArithmeticException e){
                System.out.println("Payda 0 olamaz");// manuel handle

                System.out.println(e.getMessage());//   / by zero -------> handle edilecek veri
                e.printStackTrace();
            }
            count++;
        }
        System.out.println("Bu yaziyi okuyorsan dongu ve program bitmistir");
    }
}
