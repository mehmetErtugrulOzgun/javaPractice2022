package p21_multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_MDArrays {
    public static void main(String[] args) {
        //  Soru 6) Verilen bir Array’den isten degere
        //  esit olan elamanlari kaldirip, kalanlari
        //  yeni bir Array olarak yazdiran
        //  bir method yaziniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz " +
                "eger arrayde varsa kaldiralim");
        String istenilenDeger=scan.next();
        String arr[]={"asda","asdas","fg",
                "sdff","saawad","fgddgfd","fdgd","dfgdgd"};
        for (int i=0;   i< arr.length;  i++){
            String yeni[]=arr[i].split(istenilenDeger);
            System.out.print(Arrays.toString(yeni));
        }
    }
}