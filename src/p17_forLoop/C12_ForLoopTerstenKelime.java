package p17_forLoop;

import java.util.Scanner;

public class C12_ForLoopTerstenKelime {
    public static void main(String[] args) {
        //  Kullanicidan bir String isteyin ve Stringi tersine
        //  ceviren bir program yazin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string ifade giriniz");
        String kelime=scan.nextLine();
        String terstenKelime="";

        for (int i=0; i<kelime.length();i++){
            terstenKelime+=kelime.substring(kelime.length()-1-i,kelime.length()-i);
        }
        System.out.println(terstenKelime);
    }
}
