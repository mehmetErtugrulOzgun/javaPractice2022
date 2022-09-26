package p15_methodCreation;

import java.util.Scanner;

public class C12_MethodCreation {
    //  Email kontrolu yapan bir program yazin.Kullanicinin girdigi mail
    //- @ isareti icermiyorsa gecersiz email yazdirin
    //- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
    //- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String girilenMail=scan.nextLine();

        maildeEtIsaretiVarMi(girilenMail);
        maildeGmailVarMi(girilenMail);
        mailGmailIleBitiyorMu(girilenMail);
        scan.close();
    }

    private static void mailGmailIleBitiyorMu(String girilenMail) {
        if (girilenMail.endsWith("@gmail.com")){
            System.out.println("Mailiniz basariyla kaydedildi");
            System.out.println("Girdiniz mail : "+girilenMail);
        }
        else {
            System.out.println("Yazimda sorun var, maili kontrol ediniz");
        }
    }

    private static void maildeGmailVarMi(String girilenMail) {
        if (girilenMail.contains("@gmail.com")){
            System.out.println();
        }
        else {
            System.out.println("Lutfen gmail adresinizi giriniz");
        }
    }

    private static void maildeEtIsaretiVarMi(String girilenMail) {
        if (girilenMail.contains("@")){
            System.out.println();
        }
        else {
            System.out.println("Gecersiz email");
        }
    }
}
