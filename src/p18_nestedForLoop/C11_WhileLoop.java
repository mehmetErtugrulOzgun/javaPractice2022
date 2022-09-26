package p18_nestedForLoop;

import java.util.Scanner;

public class C11_WhileLoop {
    public static void main(String[] args) {
        //  For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na
        //  tam bolunebilen sayilari yazdirin.

        System.out.println("For yontemi ile");
        // for loop yontemi ile
        for (int i=100;i<=999;i++){
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nWhile yontemi ile");
        // while yontemi loop ile
        int sayi=100;
        while (sayi<=999){
            if (sayi%15==0 && sayi%20==0 && sayi%90==0){
                System.out.print(sayi+" ");
            }
            sayi++;
        }
    }
}