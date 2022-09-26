package p12_stringManipulation;

import java.util.Scanner;

public class C08_ornekSoru {
    public static void main(String[] args) {
        // kullanicidan bir cumle isteyin. cumle "buyuk" kelimeisni iceriyorsa tum cumleyi buyuk
        // "kucuk"kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin
        //iki kelimeyide icermiyorsa "cumle kucuk yada buyuk kelimesi icermiyor" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }
        else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }
        else{
            System.out.println("Cumlede kucuk yada buyuk kelimesi icermiyor");
        }
    }
}
