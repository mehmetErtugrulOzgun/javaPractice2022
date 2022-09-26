package p41_exceptions;

import java.util.Collections;
import java.util.Scanner;

public class C11_Exceptions {
    public static void main(String[] args) {
        //  String str[],Urun isimlerini tuttugumuz bir Array olsun. Kullanicidan istedigi
        //  urunun sirasini isteyin ve istedigi urunu yazdirin.
        //  Kullanici Array’de olan urun sayisindan buyuk bir sira no girerse “Girdiginiz
        //  sira urun sayisindan buyuk” yazdirin

        Scanner scan=new Scanner(System.in);
        String str[]={"Uzum","Armut","Elma","Seftali","Kavun","Karpuz","Ananas"};

        for (String eac : str){
            System.out.print(eac +" ");
        }
        System.out.println("");
        System.out.println("Urunlerimiz bunlardir");
        System.out.println("Istediginiz urunu almak icin urunun sirasini giriniz :");
        int sira=scan.nextInt();

        try {
            System.out.println("Istediginiz urun : "+str[sira-1]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girdiginiz sira urun sayisindan buyuk");
        }
    }
}
