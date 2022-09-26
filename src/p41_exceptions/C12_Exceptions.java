package p41_exceptions;

import java.util.Scanner;

public class C12_Exceptions {
    public static void main(String[] args) {
        //  Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir
        //  sayi girerse Exception verecek sekilde yazin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi giriniz : ");
        int yas=scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Yasiniz 0 dan kucuk olamaz");
        }
    }
}
