package k2_bisikletOrnegi;

import java.util.Scanner;

public class C01_BisikletClass {
    public static void main(String[] args) {
        C02_Bisiklet bisiklet1 = new C02_Bisiklet();
        bisiklet1.hiz=30;
        System.out.println("Mevcut hiziniz : " + bisiklet1.hiz);
        System.out.println("Hangi İslemi Yapmak istersiniz :" + "\n[1] Vites Yukseltme" + "\n[2] Vites Kucultme");
        Scanner scan1= new Scanner(System.in);
        int secilendeger=scan1.nextInt();
        int secilendegerveyenivites;
        int vitesdegeri= bisiklet1.vites;


        if (secilendeger==1)
        {
            System.out.println("Vites arttirma secenegini sectiniz");
            secilendegerveyenivites= secilendeger+vitesdegeri;
            bisiklet1.HizArttir();
            System.out.println("Yeni hiziniz : " +bisiklet1.hiz);
        }
        else if (secilendeger==2)
        {
            System.out.println("Vites kucultme secenegini sectiniz");
            secilendegerveyenivites= secilendeger+vitesdegeri;
            bisiklet1.VitesAzalt();
            System.out.println("Yeni hiziniz : " +bisiklet1.hiz);

        }
        else
        {
            System.out.println("Gecersiz bir secenek sectiniz");
        }

    }
}
