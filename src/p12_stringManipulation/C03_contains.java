package p12_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        // mhmtertg99@gmail.com.tr

        System.out.println("lutfen gmail adresinizi yaziniz");
        Scanner scan=new Scanner(System.in);
        String email=scan.nextLine();

        String arananMetin="gmail.com";



        if (email.lastIndexOf(arananMetin)==(email.length()-9))
        // @ g m a i l . c o m
        // 9 8 7 6 5 4 3 2 1 0 lastIndexten çekeriz
        {
            if (email.contains(" ")==false){
                System.out.println("email adresiniz kayit edildi");
            }
            else {
                System.out.println("lutfen yazimi kontrol edin");
            }
        }
        else
        {
            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}
