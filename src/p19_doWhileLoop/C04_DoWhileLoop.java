package p19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //  Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a
        //  basmasini soyleyin.
        //  Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin
        //  toplaminin kac oldugunu yazdirin.


        Scanner scan=new Scanner(System.in);
        int sayac=0;
        double sayi=5;
        int toplam=0;

        do {
            System.out.println("Lutfen toplamak icin pozitif sayilar girin \nIslemi bitirmek icin 0a basin");
            sayi=scan.nextDouble();
            if (sayi>0){
                 toplam+=sayi;
                 sayac++;
             }
             else if (sayi<0){
                System.out.println("Pozitif sayi girmeliydiniz \nGirdigin negatif degeri yok sayiyorum");
             }
         }
         while (!(sayi==0.0));
        System.out.println("Bu sonuca su kadar sayida ulatiniz : "+sayac+
                "\nGirdiginiz sayilarin toplami : "+toplam);

    }
}
