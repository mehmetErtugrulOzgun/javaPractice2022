package p11_stringManipulation;

import java.util.Scanner;

public class C07_lastIndexOf {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir kelime isteyin
        //kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //1-girilen cumlede hic kullanilmamis
        //2-girilen cumlede 1 kere kullanilmis
        //3-girilen cumlede 1'den fazla kullanilmis

        System.out.println("Bir cumle giriniz :");
        Scanner scanCumle= new Scanner(System.in);
        String girilenCumle=scanCumle.nextLine().toLowerCase();

        System.out.println("Aramak istediginiz kelimeyi giriniz");
        Scanner scanKelime= new Scanner(System.in);
        String girilenKelime=scanKelime.nextLine().toLowerCase();

        System.out.println("Girdiginiz cumle : "+girilenCumle+ "\nAramak istediginiz kelime : "+girilenKelime);

        //1.yöntem
        int ilkKullanimIndexi=girilenCumle.indexOf(girilenKelime);
        int sonKullanimIndexi=girilenKelime.lastIndexOf(girilenKelime);

        if (ilkKullanimIndexi==-1){
            System.out.println("1-cumlede hic kullanilmamis");
        }
        else if (ilkKullanimIndexi==sonKullanimIndexi){
            System.out.println("1-Cumlede 1 kere kullanilmis");
        }
        else {
            System.out.println("1-Cumlede 1 den fazla kullanilmis");
        }
        //2.yöntem
        if (girilenCumle.indexOf(girilenKelime)==-1) {
            System.out.println("2-Cumlede hic kullanilmamis");
        }
        else if (girilenCumle.indexOf(girilenKelime)==girilenCumle.lastIndexOf(girilenKelime)){
            System.out.println("2-Cumlede 1 kere kullanilmamis");
        }
        else{
            System.out.println("2-Cumlede 1 den fazla kullanilmis");
        }
    }
}








