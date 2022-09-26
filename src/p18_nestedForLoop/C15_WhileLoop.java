package p18_nestedForLoop;

import java.util.Scanner;

public class C15_WhileLoop {
    public static void main(String[] args) {
        //  Kullanicidan toplamak uzere sayi isteyen toplam 200 oluncaya kadar sayi istemeye devam edin
        //  toplam 200u gectiginde kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int toplam=0;
        int sayac=0;

        while (toplam<200){
            System.out.println("Lutfen girmek istediginiz tam sayiyi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        //  Eger bu adima geldiysek toplam 200u asmistir
        System.out.println("200u su kadar sayi girerek gectiniz : "+sayac+" bu sayilarin toplami da : "+toplam);
    }
}
