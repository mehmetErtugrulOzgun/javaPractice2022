package p19_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
        // ve toplam kac tane olduklarini ekranda yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi=scan.nextInt();

        // for loop ile de yapabiliriz ama while loop ile yapmak istiyoruz

        int bolen=2;
        int sayac=0;

        while (bolen<=sayi){
            if (sayi%bolen==0)
            {
                System.out.println(bolen + " ");
                sayac ++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(sayi + " sayisini bolen " + sayac + " adet sayi vardir");
    }
}