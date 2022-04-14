package p03_scanner;

public class Odev {

    public static void main(String[] args) {

 /*     1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

        int sayi1=20;
        int sayi2=10;

        System.out.println("Swaptan once ki degerler sayi1 : " + sayi1 + " " + "sayi2 : " + sayi2);


        sayi1 = sayi1 - sayi2;
        sayi2 = sayi1 + sayi2;
        sayi1 = sayi2 - sayi1;


        System.out.println("Swaptan sonra ki degerler sayi1 : " + sayi1 + " " + "sayi2 : " + sayi2);

    }
}
