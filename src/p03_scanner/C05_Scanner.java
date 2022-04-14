package p03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //soru kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yari capini giriniz : ");
        float yaricap= scan.nextFloat();

        System.out.println("Girdiginiz yaricap : " + yaricap);
        System.out.println("Cemberin cevresi : " + 2*3.14*yaricap);
        System.out.println("Dairenin alani : " + 3.14*yaricap*yaricap);

    }
}
