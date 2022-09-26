package p18_nestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Eskenar ucgenin ortasinda ki yildiz kac adet olsun");
        int yukseklik=scan.nextInt();

        for (int i=1;i<=yukseklik;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i=yukseklik-2;i>=0;i--){
            for (int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}