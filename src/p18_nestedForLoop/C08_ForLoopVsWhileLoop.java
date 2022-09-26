package p18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {

    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin
        Scanner scan = new Scanner(System.in);
        int sayi=1;
        int toplam=0;
        int sayac=0;

        while (sayi!=0){
            System.out.println("Girmek istediginiz sayiyi yaziniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("Girdiniz sayilarin toplami : "+toplam);
        System.out.println("Bu toplama su kadar sayida ulastiniz : "+sayac);
        // baslangic,bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
        // ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir
    }
}