package p41_exceptions;

import java.util.Scanner;

public class C10_Exceptions {
    public static void main(String[] args) {
        /*
        Kullanicidan carpma yapmak icin bir String isteyin.
        Kullanicinin girdigi String sadece sayilardan olusuyorsa
        sayiyi 2 ile carpip sonucunu yazdirin.
        Kullanici sayilardan olusmayan bir String girerse
        "Girdiginiz String sayiya cevrilemez" yazdirin. --------->Hata firlatma
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        String str=scan.nextLine();

        //NumberFormatException hata bu

        try {
            System.out.println(2*Integer.parseInt(str));
        }
        catch (NumberFormatException e){
            System.out.println("Girdiginiz String sayiya cevrilemez");
        }
        scan.close();
    }
}
