package p21_multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_MDArrays {
    public static void main(String[] args) {
        //  Soru 5) Kullanicidan bir cumle isteyin
        //  ve cumledeki kelime sayisini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime sayisini " +
                "ogrenmek istediginiz cumleyi giriniz");
        String cumle=scan.nextLine();
        String cumleArray[]={cumle};
        System.out.println("Girdiginiz cumlenin kelime sayisi = "
                +cumle.split(" ").length);
    }
}
