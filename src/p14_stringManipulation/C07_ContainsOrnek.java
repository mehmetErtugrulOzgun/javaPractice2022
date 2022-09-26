package p14_stringManipulation;

import java.util.Scanner;

public class C07_ContainsOrnek {
    public static void main(String[] args) {
        // Kullanicidan isim isteyin. Eger
        //- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        //- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        //- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Isim giriniz");
        String isim=scan.nextLine();

        if (isim.contains("Z")&&isim.contains("a")){
            System.out.println("Girdiginiz isim hem a harfi hemde Z harfini iceriyor");
        }
        else if (isim.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }
        else if (isim.contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }

        else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
    }
}
