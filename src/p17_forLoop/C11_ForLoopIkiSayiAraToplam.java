package p17_forLoop;

import java.util.Scanner;

public class C11_ForLoopIkiSayiAraToplam {
    public static void main(String[] args) {
        //  Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
        //  tamsayilari toplayip, sonucu yazdiran bir program yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi1=scan.nextInt();

        System.out.println("Bir sayi daha giriniz");
        int sayi2=scan.nextInt();
        ikiSayiArasiToplamaMethodu(sayi1,sayi2);
    }

    private static void ikiSayiArasiToplamaMethodu(int sayi1, int sayi2) {
        int toplam=0;
        if (sayi1>sayi2){
            for (int i=sayi2; i<=sayi1; i++){
                toplam+=i;
            }
            System.out.println(toplam);
        }
        else if (sayi1<sayi2){
            for (int j=sayi1;j<=sayi2;j++){
                toplam+=j;
            }
            System.out.println(toplam);
        }
        else {
            System.out.println("Girdiniz sayi ayni ve bunlarin toplami : "+(sayi1+sayi2));
        }
    }
}